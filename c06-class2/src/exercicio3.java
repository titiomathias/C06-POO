import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Digite sua NPA: ");
        float NPA = read.nextFloat();

        if(NPA >= 60) {
            System.out.println("Parabéns! Passou direto!");
        } else if(NPA < 60 && NPA >= 30) {
            System.out.println("Você terá de fazer NP3!");

            System.out.print("Digite a nota da sua NP3: ");
            float NP3 = read.nextFloat();

            float NFA = (NP3 + NPA)/2;

            if(NFA >= 50) {
                System.out.println("Parabéns, você conseguiu passar através da NP3!");
            } else {
                System.out.println("Você foi reprovado! Tente novamente no semestre que vem.");
            }
        } else {
            System.out.println("Você foi reprovado! Tente novamente no semestre que vem.");
        }
    }
}
