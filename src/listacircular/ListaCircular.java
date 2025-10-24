package listacircular;

public class ListaCircular {
    private NodeCircular ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    public void inserir(int data) {
        NodeCircular novoNode = new NodeCircular(data);

        if (ultimo == null) {
            ultimo = novoNode;
            ultimo.next = ultimo;
            System.out.println("Inserido: " + data + " (PRIMEIRO ELEMENTO - INÍCIO DA LISTA)");
        } else {
            novoNode.next = ultimo.next;
            ultimo.next = novoNode;
            ultimo = novoNode;
            System.out.println("Inserido: " + data + " | Início da lista: " + getInicio());
        }
    }

    public boolean buscar(int data) {
        if (ultimo == null) return false;

        NodeCircular atual = ultimo.next;
        NodeCircular inicio = atual;

        do {
            if (atual.data == data) {
                return true;
            }
            atual = atual.next;
        } while (atual != inicio);

        return false;
    }

    public void remover(int data) {
        if (ultimo == null) return;

        NodeCircular atual = ultimo.next;
        NodeCircular anterior = ultimo;

        do {
            if (atual.data == data) {
                if (atual == atual.next) {
                    ultimo = null;
                    System.out.println("Removido: " + data + " (LISTA VAZIA)");
                } else {
                    anterior.next = atual.next;
                    if (atual == ultimo) {
                        ultimo = anterior;
                    }
                    System.out.println("Removido: " + data + " | Novo início: " + getInicio());
                }
                return;
            }
            anterior = atual;
            atual = atual.next;
        } while (atual != ultimo.next);

        System.out.println("Elemento " + data + " não encontrado!");
    }

    public void listar() {
        if (ultimo == null) {
            System.out.println("Lista vazia!");
            return;
        }

        NodeCircular atual = ultimo.next;
        NodeCircular inicio = atual;

        System.out.print("Lista Circular (Início: " + getInicio() + "): ");
        do {
            System.out.print(atual.data);
            if (atual == ultimo) {
                System.out.print(" (último)");
            }
            if (atual.next != inicio) {
                System.out.print(" -> ");
            }
            atual = atual.next;
        } while (atual != inicio);
        System.out.println(" -> (volta para " + getInicio() + ")");
    }

    public int getInicio() {
        if (ultimo == null) return -1;
        return ultimo.next.data;
    }
}