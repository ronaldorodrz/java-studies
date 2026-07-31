package Java.Variables;

public class DataTypes {
    public static void main(String[] args) {

        // byte armazena números inteiros pequenos
        byte minutos = 60;

        // short armazena números inteiros maiores que byte
        short segundos = 3600;

        // int é o tipo inteiro mais utilizado
        int quilogramasEmUmaTonelada = 1000;

        // long armazena números inteiros muito grandes, terminar com L
        long numeroGrande = 15000000000L;

        // float armazena números decimais, terminar com f
        float precoProdutoA = 5.75f;

        // double armazena números decimais com maior precisão
        double precoProdutoB = 19.99;

        // boolean representa verdadeiro ou falso
        boolean respostaCorreta = true;

        // char armazena apenas um caractere
        char nota = 'B';

        // String armazena textos
        String nome = "Walter White";

        // Ela permite que o compilador descubra automaticamente o tipo da variável com base no valor atribuído.
        var ano = 21;

        System.out.println("Uma hora possui " + minutos + " minutos.");
        System.out.println("Uma hora possui " + segundos + " segundos.");
        System.out.println("Uma tonelada possui " + quilogramasEmUmaTonelada + " kg.");
        System.out.println("Número grande: " + numeroGrande);
        System.out.println("Preço A: R$ " + precoProdutoA);
        System.out.println("Preço B: R$ " + precoProdutoB);
        System.out.println("A resposta está correta? " + respostaCorreta);
        System.out.println("Minha nota foi: " + nota);
        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho " + ano + " anos");
    }
}
