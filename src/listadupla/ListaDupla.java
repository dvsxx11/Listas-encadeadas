package listadupla;

public class ListaDupla {
    private NodeDuplas inicio;
    private NodeDuplas fim;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirInicio(int data) {
        NodeDuplas novoNode = new NodeDuplas(data);
        if (inicio == null) {
            inicio = fim = novoNode;
        } else {
            novoNode.next = inicio;
            inicio.prev = novoNode;
            inicio = novoNode;
        }
        System.out.println("Inserido no início: " + data);
    }

    public void inserirFinal(int data) {
        NodeDuplas novoNode = new NodeDuplas(data);
        if (fim == null) {
            inicio = fim = novoNode;
        } else {
            novoNode.prev = fim;
            fim.next = novoNode;
            fim = novoNode;
        }
        System.out.println("Inserido no final: " + data);
    }

    public boolean buscar(int data) {
        NodeDuplas atual = inicio;
        while (atual != null) {
            if (atual.data == data) {
                return true;
            }
            atual = atual.next;
        }
        return false;
    }

    public void remover(int data) {
        NodeDuplas atual = inicio;

        while (atual != null && atual.data != data) {
            atual = atual.next;
        }

        if (atual == null) return;

        if (atual.prev != null) {
            atual.prev.next = atual.next;
        } else {
            inicio = atual.next;
        }

        if (atual.next != null) {
            atual.next.prev = atual.prev;
        } else {
            fim = atual.prev;
        }

        System.out.println("Removido: " + data);
    }

    public void listarInicioFim() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        NodeDuplas atual = inicio;
        System.out.print("Início -> Fim: ");
        while (atual != null) {
            System.out.print(atual.data + " <-> ");
            atual = atual.next;
        }
        System.out.println("NULL");
    }

    public void listarFimInicio() {
        if (fim == null) {
            System.out.println("Lista vazia!");
            return;
        }

        NodeDuplas atual = fim;
        System.out.print("Fim -> Início: ");
        while (atual != null) {
            System.out.print(atual.data + " <-> ");
            atual = atual.prev;
        }
        System.out.println("NULL");
    }
}