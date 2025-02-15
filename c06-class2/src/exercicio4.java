// Exercício 4: Switch Case

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int numAlunos;

        System.out.print("Digite o número de alunos: ");
        numAlunos = read.nextInt();

        switch (numAlunos){
            case 10,20:
                System.out.println("Sala I-16");
            break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Sala I-5");
        }
    }
}
