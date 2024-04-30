public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.push(3);
        fila.push(5);
        fila.push(7);
        System.out.println();
        fila.peak();
        fila.pop();
        System.out.println(fila.isEmpty());
        fila.peak();
    }
}