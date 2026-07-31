package Java.Strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String primeiroNome = "Ronaldo";
        String segundoNome = "Rodrigues";
        int idade = 21;
        
        // Operador + une duas ou mais Strings
        System.out.println(primeiroNome + " " + segundoNome);
        System.out.println("Meu nome é " + primeiroNome + " e eu tenho " + idade + " anos.");

        /*  concat()
        Une duas Strings sem utilizar o operador + */
        System.out.println(primeiroNome.concat(segundoNome));
    }
}
