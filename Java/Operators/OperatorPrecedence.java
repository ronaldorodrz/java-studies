package Java.Operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int resultado;
        boolean condicao;

        /* () Parênteses
        Os parênteses têm a maior prioridade e são executados primeiro. */
        resultado = (2 + 3) * 4;
        System.out.println("(2 + 3) * 4 = " + resultado);

        /* *, /, % Multiplicação, Divisão e Módulo
        Operadores de mesma prioridade são executados da esquerda para a direita. */
        resultado = 20 / 4 * 2;
        System.out.println("20 / 4 * 2 = " + resultado);

        resultado = 10 % 3;
        System.out.println("10 % 3 = " + resultado);

        /* +, - Adição, Subtração
        Também possuem a mesma prioridade e são executados da esquerda para a direita. */
        resultado = 2 + 2 - 3;
        System.out.println("2 + 2 - 3 = " + resultado);

        /* >, <, >=, <= Comparação
        O resultado de uma comparação sempre é true ou false. */
        condicao = 4 < 5;
        System.out.println("4 < 5 = " + condicao);

        /* ==, != Igualdade
        Verifica se dois valores são iguais ou diferentes. */
        condicao = 3 != 6;
        System.out.println("3 != 6: " +condicao);

        /* && Lógico AND
        Retorna true somente se as duas condições forem verdadeiras. */
        condicao = (2 > 0) && (5 < 9);
        System.out.println("(2 > 4) && (5 < 9) = " + condicao);

        /* || Lógico OU
        Retorna true se pelo menos uma condição for verdadeira. */
        condicao = (5 < 3) || (10 > 8);
        System.out.println("(5 < 3) || (10 > 8) = " + condicao);

        /* = Atribuição */
        resultado = 21;
        System.out.println("resultado = " + resultado);
    }
}
