package Java.Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int z = 5;

        // Soma dois valores.
        System.out.printf("%d + %d = %d\n", x, y, x + y); 

        // Subtrai um valor do outro.
        System.out.printf("%d - %d = %d\n", x, y, x - y); 

        // Multiplica dois valores.
        System.out.printf("%d * %d = %d\n", x, y, x * y); 

        // Divide um número pelo outro.
        System.out.printf("%d / %d = %d\n", x, y, x / y); 

        // Retorna o resto da divisão.
        System.out.printf("%d %% %d = %d\n", x, y, x % y); 

        // Aumenta o valor da variável em 1.
        System.out.printf("++z = %d\n", ++z);

        // Diminui o valor da variável em 1.
        System.out.printf("--z = %d\n", --z);
    }
}
