import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner read = new Scanner(System.in);

        int x = rand.nextInt(10)+1;
        int chute;

        do{
            System.out.print("Chute um número: ");
            chute = read.nextInt();

            if (chute == x) {
                System.out.println("Parabéns! Você acertou.");
            } else if(chute < x) {
                System.out.println("Errou! Tente um valor mais alto.");
            } else {
                System.out.println("Errou! Tente um valor mais baixo.");
            }

        }while(chute != x);
    }
}
