package Java.Operators;

public class ComparisonOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        // Igual a
        System.out.printf("%d == %d: %b\n", x, y, x == y);

        // Diferente de
        System.out.printf("%d != %d: %b\n", x, y, x != y);

        // Maior que
        System.out.printf("%d > %d: %b\n", x, y, x > y);

        // Menor que
        System.out.printf("%d < %d: %b\n", x, y, x < y);

        // Maior ou igual
        System.out.printf("%d >= %d: %b\n", x, y, x >= y);

        // Menor ou igual
        System.out.printf("%d <= %d: %b\n", x, y, x <= y);
    }
}
