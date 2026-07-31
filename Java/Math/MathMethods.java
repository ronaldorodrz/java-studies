package Java.Math;

public class MathMethods {
    public static void main(String[] args) {

        /* Math.max(x, y)
        Retorna o maior valor entre dois números. */
        System.out.println("Math.max(5, 7) = " + Math.max(5, 7));

        /* Math.min(x, y)
        Retorna o menor valor entre dois números. */
        System.out.println("Math.min(4, 10) = " + Math.min(4, 10));

        /* Math.sqrt(x)
        Retorna a raiz quadrada de um número. */
        System.out.println("Math.sqrt(64) = " + Math.sqrt(64));

        /* Math.abs(x)
        Retorna o valor absoluto (sempre positivo). */
        System.out.println("Math.abs(-4.7) = " + Math.abs(-4.7));

        /* Math.pow(x, y)
        Retorna x elevado à potência y. */
        System.out.println("Math.pow(2, 8) = " + Math.pow(2, 8));

        /* Math.round(x)
        Arredonda para o inteiro mais próximo. */
        System.out.println("Math.round(4.6) = " + Math.round(4.6));

        /* Math.ceil(x)
        Arredonda para cima. */
        System.out.println("Math.ceil(4.1) = " + Math.ceil(4.1));

        /* Math.floor(x)
        Arredonda para baixo. */
        System.out.println("Math.floor(4.9) = " + Math.floor(4.9));

        /* Math.random()
        Gera um número aleatório entre 0.0 (inclusive) e 1.0 (exclusivo). */
        System.out.println("Math.random() = " + Math.random());
    }
}
