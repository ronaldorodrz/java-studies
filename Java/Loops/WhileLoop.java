package Java.Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;

        // O while executa um bloco de código enquanto a condição for verdadeira.
        while (i < 5) {
            System.out.println("i = " + i);

            // Incrementa a variável para evitar um loop infinito.
            i++;
        }
    }
}
