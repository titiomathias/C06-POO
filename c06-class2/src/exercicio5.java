// Exercício 5: Estruturas de repetição

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {
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
            } else {
                System.out.println("Errou! Tente de novo.");
            }

        }while(chute !=x );
    }
}
