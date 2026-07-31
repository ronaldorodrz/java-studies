package Java.Conditions;

public class IfElse {
    public static void main(String[] args) {
        int x = 21;
        int y = 14;
        int a = 2;
        int b = 12;
        int c = 34;
        boolean cidadao = true;

        // O if executa um bloco de código somente se a condição for verdadeira.
        if (x >= 18) {
            System.out.println("Maior de idade.");
        }

        // O else executa um bloco de código quando a condição do if é falsa.
        if (y >= 18) {
            System.out.println("Você tem a idade mínima.");
        } else {
            System.out.println("Você não tem a idade mínima.");
        }

        // O else if permite testar uma nova condição quando a primeira é falsa.
        if (x < y) {
            System.out.println("x é menor que y.");
        } else if (x > y) {
            System.out.println("x é maior que y.");
        } else {
            System.out.println("x é igual a y.");
        }

        // Operador ternário é uma forma reduzida de escrever um if e else.
        String resultado = (x < 18) ? "Bom dia." : "Boa noite.";
        System.out.println(resultado);

        System.out.println((x < 18) ? "Bom dia." : "Boa noite.");

        // Exemplo de if aninhado (if dentro de outro if).
        if (x >= 18) {
            System.out.println("Idade suficiente para votar.");
            if (cidadao) {
                System.out.println("Você é cidadão e pode votar.");
            } else {
                System.out.println("Você precisa ser cidadão para votar.");
            }
        } else {
            System.out.println("Você ainda não tem idade para votar.");
        }

        /* AND (&&).
        Retorna true somente se todas as condições forem verdadeiras. */
        if (a > b && c > a) {
            System.out.println("As duas condições são verdadeiras.");
        }

        /* OR (||).
        Retorna true se pelo menos uma condição for verdadeira. */
        if (a > b || a > c) {
            System.out.println("Pelo menos uma condição é verdadeira.");
        }

        /* NOT (!).
        Inverte o resultado da condição. */
        if (!(a < b)) {
            System.out.println("A condição \"a < b\" é falsa.");
        }
    }
}
