package Java.Strings;

public class Strings {
    public static void main(String[] args) {

        // String é uma classe utilizada para armazenar textos
        String texto = "Hello, World!";
        String texto2 = "World!";
        String texto3 = "         Hello";

        System.out.println(texto);

        /* length()
        Retorna a quantidade de caracteres da String. */
        System.out.println("Quantidade de caracteres da String: " + texto.length());

        /* toUpperCase()
        Converte todos os caracteres para letras maiúsculas. */
        System.out.println("Maiúsculas: " + texto.toUpperCase());

        /* toLowerCase()
        Converte todos os caracteres para letras minúsculas. */
        System.out.println("Minúsculas: " + texto.toLowerCase());

        /* indexOf()
        Retorna a posição da primeira ocorrência de um texto. */
        System.out.println("Posição da palavra \"World\": " + texto.indexOf("World"));

        /* charAt()
        Retorna o caractere localizado em uma posição. */
        System.out.println("Primeiro caractere: " + texto.charAt(0));
        System.out.println("Último caractere: " + texto.charAt(texto.length() - 1));

        /* equals()
        Compara duas Strings. */
        System.out.println("texto é igual a texto2? " + texto.equals(texto2));
        
        /* trim()
        Remove espaços no início e no final da String. */
        System.out.println("Texto com espaços no início: " + texto3);
        System.out.println("Depois de remove: " + texto3.trim());
    }
}
