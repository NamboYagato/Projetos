public class Fila {
    private Node inicio, fim;
    private Pilha pilha1, pilha2;

    /**
     * Construtor para objetos da classe Fila
     */
    public Fila() {
        // inicializa variáveis de instância
        inicio = fim = null;
        pilha1 = new Pilha();
        pilha2 = new Pilha();
    }

    public void push(int x) {
        if (pilha1.isEmpty()) {
            pilha1.push(x);
        } else {
            while (!pilha1.isEmpty()) {
                int val = pilha1.pop();
                pilha2.push(val);
            }
            pilha1.push(x);
            while (!pilha2.isEmpty()) {
                int val = pilha2.pop();
                pilha1.push(val);
            }
        }
    }

    public int pop() {
        if(pilha1.isEmpty()){
            System.out.println("Tentativa de remover em pilha vazia");
            return -99999;
        }
        else{
            return pilha1.pop();
        }
    }

    public boolean isEmpty(){
        return pilha1.isEmpty();
    }

    public void peak() {
        System.out.println("Pilha 1: " + pilha1.peak());
        System.out.println("Pilha 2: ");
        System.out.println(pilha2.peak());

    }

    /*public void push(int x) {
        if (inicio == null) {
            inicio = new Node(x);
            fim = inicio;
        } else {
            fim.setProx(new Node(x));
            fim = fim.getProx();
        }
    }

    public int pop() {
        Node aux = inicio;
        if (aux == null) {
            System.out.println("Tentativa de remover em pilha vazia");
            return -99999;
        } else {
            inicio = inicio.getProx();
            if (inicio == null) fim = null;
            return aux.getX();
        }
    }

    public boolean isEmpty() {
        if (inicio == null) return true;
        else return false;
    }*/
}
