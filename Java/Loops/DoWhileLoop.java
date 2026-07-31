package Java.Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;

        /* O bloco de código é executado primeiro.
        Depois a condição é verificada.
        Enquanto a condição for verdadeira, o laço continuará repetindo. */
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }
}
