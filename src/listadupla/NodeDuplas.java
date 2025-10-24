package listadupla;

public class NodeDuplas {
    public int data;
    public NodeDuplas next;
    public NodeDuplas prev;

    public NodeDuplas(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}