package Java.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        /* Declaração de um array bidimensional (matriz).
        Cada linha é um array independente. */
        int[][] numeros = {
            {1, 4, 2},
            {3, 6, 8}
        };

        // Acessando elementos da matriz[linha][coluna].
        System.out.println("Elemento da linha 1, coluna 2: " + numeros[1][2]);
        System.out.println("Elemento da linha 0, coluna 1: " + numeros[0][1]);

        // Alterando um elemento da matriz.
        numeros[1][2] = 9;

        System.out.println("Novo valor da linha 1, coluna 2: " + numeros[1][2]);

        // Percorrendo a matriz utilizando dois loops for.
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.println("numeros[" + linha + "][" + coluna + "] = " + numeros[linha][coluna]);
            }
        }

        // Percorrendo a matriz utilizando for-each.
        for (int[] linha : numeros) {
            for (int matriz : linha) {
                System.out.println(matriz);
            }
        }
    }
}
