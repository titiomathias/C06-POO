public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart() {
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pular!");
    }

    void soltarTurbo(){
        System.out.println("Soltando turbo!");
    }

    void fazerDrift(){
        System.out.println("Driftando!");
    }
}
