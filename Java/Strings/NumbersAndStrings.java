package Java.Strings;

public class NumbersAndStrings {
    public static void main(String[] args) {
       
        // Quando os dois valores são numéricos, o operador + realiza uma operação matemática
        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 + num2 = " + (num1 + num2));

        // Quando os dois valores são Strings, o operador + junta os textos
        String text1 = "21";
        String text2 = "19";

        System.out.println("text1 + text2 = " + (text1 + text2));

        // Se um dos valores for String, o Java converte o número para texto e realiza uma concatenação
        String text = "45";
        int num = 8;

        System.out.println("text + num = " + (text + num));
    }
}
