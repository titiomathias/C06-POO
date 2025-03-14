// Arrays

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina da Neide";
        cantina.salgados = new Salgado[3];

        for(int i = 0; i < 3; i++) {
            Salgado salgado = new Salgado();
            System.out.print("Digite o nome do novo salgado: ");
            salgado.nome = sc.nextLine();
            cantina.salgados[i] = salgado;
        }

        cantina.mostraInfo();
    }
}