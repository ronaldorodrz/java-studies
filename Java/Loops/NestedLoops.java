package Java.Loops;

public class NestedLoops {
    public static void main(String[] args) {

        /* Um laço aninhado é um laço dentro de outro laço.
        O laço interno executa completamente para cada repetição do laço externo. */

        // Laço externo
        for (int i = 1; i <= 2; i++) {
            System.out.println("Laço externo: " + i);

            // Laço interno
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Laço interno: " + j);
            }
        }
    }
}
