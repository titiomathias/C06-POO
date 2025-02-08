// Pratica 1 - Tipos de Variávies

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args){
        String name;
        String function;
        int experience;
        double salary_base = 2600.00;
        double salary_final;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        name = sc.nextLine();

        System.out.print("Digite a sua especialidade: ");
        function = sc.nextLine();

        System.out.print("Digite quantos anos você tem experiência: ");
        experience = sc.nextInt();

        salary_final = salary_base;

         if (experience >= 1 && experience <=5) {
            salary_final += salary_final*(experience*0.2);
        } else if (experience > 5){
            salary_final += salary_final*(experience*0.4);
        }

         System.out.println("\nFuncionário Contratado: "+ name + ".\nFunção: " + function + ".\nSalário: R$" + salary_final + ".");
    }
}
