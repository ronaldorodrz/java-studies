package Java.Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean estudou = true;
        boolean exerceicio = false;

        // O operador AND retorna true somente quando todas as condições são verdadeiras
        System.out.println("O aluno estudou e fez o exercício? " + (estudou && exerceicio));

        // O operador OR retorna true quando pelo menos uma das condições é verdadeira
        System.out.println("O aluno estudou ou fez o exercício? " + (estudou || exerceicio));

        // O operador NOT inverte o resultado de uma condição
        System.out.println("O aluno fez o exercício? " + !exerceicio);
    }
}
