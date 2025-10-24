package listasimples;

public class ListaSimples {
    private NodeSimples inicio;

    public ListaSimples() {
        this.inicio = null;
    }

    public void inserirInicio(int data) {
        NodeSimples novoNode = new NodeSimples(data);
        novoNode.next = inicio;
        inicio = novoNode;
        System.out.println("Inserido no início: " + data);
    }

    public void inserirFinal(int data) {
        NodeSimples novoNode = new NodeSimples(data);
        if (inicio == null) {
            inicio = novoNode;
        } else {
            NodeSimples atual = inicio;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novoNode;
        }
        System.out.println("Inserido no final: " + data);
    }

    public boolean buscar(int data) {
        NodeSimples atual = inicio;
        while (atual != null) {
            if (atual.data == data) {
                return true;
            }
            atual = atual.next;
        }
        return false;
    }

    public void remover(int data) {
        if (inicio == null) return;

        if (inicio.data == data) {
            inicio = inicio.next;
            System.out.println("Removido: " + data);
            return;
        }

        NodeSimples atual = inicio;
        while (atual.next != null && atual.next.data != data) {
            atual = atual.next;
        }

        if (atual.next != null) {
            atual.next = atual.next.next;
            System.out.println("Removido: " + data);
        }
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        NodeSimples atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.data + " -> ");
            atual = atual.next;
        }
        System.out.println("NULL");
    }
}