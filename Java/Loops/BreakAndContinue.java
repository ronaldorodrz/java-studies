package Java.Loops;

public class BreakAndContinue {
    public static void main(String[] args) {

        // O break encerra completamente o loop.
        for (int i = 0; i < 10; i++) {

            // Quando i for igual a 4, o loop será encerrado.
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } 

        // O continue pula apenas a iteração atual.
        for (int i = 0; i < 10; i++) {

            // O número 4 não será impresso.
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
