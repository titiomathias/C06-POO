// Prática 0 de Java - Autodidata

import java.util.Scanner;

public class Practice0 {
    public static void main(String[] args){
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Olá, Java! Meu nome é "+nome+".");
    }
}
