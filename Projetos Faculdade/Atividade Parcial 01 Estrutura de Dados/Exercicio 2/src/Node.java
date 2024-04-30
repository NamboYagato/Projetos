public class Node {
    private int x;
    private Node prox;

    public Node(int x) {
        this.x = x;
        this.prox = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}
