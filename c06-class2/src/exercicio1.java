// Exercício 1: Zé do Lanche

public class exercicio1 {
    public static void main(String[] args) {
        int first = 10;
        int second = 4;
        int third = 2;

        int total = first + second + third;

        float media = (float)(total)/3;

        System.out.println("Número de lanches consumidos: " + total);
        System.out.printf("A média de lanches consumidos nas últimas 3 horas é de: %.2f lanches.", media);
    }
}
