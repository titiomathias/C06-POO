// Exercício 3

public class Main {
    public static void main(String[] args){
        Zumbis z1 = new Zumbis();
        Zumbis z2 = new Zumbis();

        z1.nome = "Estalador";
        z1.vida = 50.0;

        z2.nome = "Espreitador";
        z2.vida = 30.0;

        System.out.println("Zumbi 1:\nNome: " + z1.nome + "\nVida: " + z1.vida);
        System.out.println("\n\nZumbi 2:\nNome: " + z2.nome + "\nVida: " + z2.vida + "\n\n");

        z1 = z2;

        z1.vida = 400;
        z2.vida = 200;

        System.out.println("Zumbi 1:\nNome: " + z1.nome + "\nVida: " + z1.vida);
        System.out.println("\n\nZumbi 2:\nNome: " + z2.nome + "\nVida: " + z2.vida);
    }
}

