// Exercício 2: Trailer do Zé -> Com entrada de dados

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Digite quantos lanches foram consumidos na primeira hora: ");
        int firstHour = read.nextInt();
        System.out.print("Digite quantos lanches foram consumidos na segunda hora: ");
        int secondHour = read.nextInt();
        System.out.print("Digite quantos lanches foram consumidos na segunda hora: ");
        int thirdHour = read.nextInt();

        int total = firstHour + secondHour + thirdHour;

        float media = (float) total/3;

        System.out.println("Número total de lanches consumidos: " + total);
        System.out.printf("Média dos lanches consumidos por hora: %.2f lanches", media);

        read.close();
    }
}
