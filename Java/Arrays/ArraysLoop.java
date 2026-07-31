package Java.Arrays;

public class ArraysLoop {
    public static void main(String[] args) {

        // Array de Strings.
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};

        /* Percorrendo um array utilizando o loop for tradicional.
        É ideal quando precisamos do índice do elemento. */
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Índice " + i + ": " + carros[i]);
        }

        /* Percorrendo um array utilizando o for-each.
        Mais simples quando só precisamos do valor. */
        for (String car : carros) {
            System.out.println(car);
        }
    }
}
