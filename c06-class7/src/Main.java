// Array de arrays

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Campo campo = new Campo();

        System.out.print("Digite o tamanho o campo: ");
        campo.size = sc.nextInt();

        campo.criarCampo();

        campo.jogar();
    }
}