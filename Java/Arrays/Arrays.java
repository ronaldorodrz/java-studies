package Java.Arrays;

public class Arrays {
    public static void main(String[] args) {

        // Um array armazena vários valores do mesmo tipo.
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Primeiro carro: " + carros[0]);

        // Alterando um elemento.
        carros[0] = "Opel";
        System.out.println("Primeiro carro após alteração: " + carros[0]);

        // Tamanho do array.
        System.out.println("Quantidade de carros:" + carros.length);
    }
}
