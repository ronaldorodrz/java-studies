package Java.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 10;

        // Atribuição
        x = 10;
        System.out.println("x = " + x);

        // Soma e atribui
        x += 3;
        System.out.println("x += 3: " + x);

        // Subtrai e atribui
        x -= 2;
        System.out.println("x -= 2: " + x);

        // Multiplica e atribui
        x *= 6;
        System.out.println("x *= 6: " + x);

        // Divide e atribui
        x /= 2;
        System.out.println("x /= 2: " + x);

        // Resto da divisão e atribui
        x %= 4;
        System.out.println("x %= 4: " + x);

        // AND bit a bit e atribui
        x &= 7;
        System.out.println("x &= 7: " + x);

        // OR bit a bit e atribui
        x |= 5;
        System.out.println("x |= 5: " + x);

        // XOR bit a bit e atribui
        x ^= 8;
        System.out.println("x ^= 8: " + x);

        // Deslocamento à direita
        x >>= 6;
        System.out.println("x >>= 6: " + x);

        // Deslocamento à esquerda
        x <<= 4;
        System.out.println("x <<= 4: " + x);
    }
}
