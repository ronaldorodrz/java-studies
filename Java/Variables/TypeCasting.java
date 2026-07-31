package Java.Variables;

public class TypeCasting {
    public static void main(String[] args) {
        int numeroInt;
        double numeroDouble;

        // Widening Casting - Automático

        numeroInt = 9;
        numeroDouble = numeroInt;
        /* O Java converte automaticamente um int para double,
        pois não há risco de perda de informação.*/

        System.out.println("Valor do int: " + numeroInt);
        System.out.println("Valor do double: " + numeroDouble);

        // Narrowing Casting - Manual
        
        numeroDouble = 9.78;
        numeroInt = (int) numeroDouble;
        /* Converte manualmente o double para int.
        A parte decimal será descartada. */

        System.out.println("Valor do double: " + numeroDouble);
        System.out.println("Valor do int: " + numeroInt);
    }
}
