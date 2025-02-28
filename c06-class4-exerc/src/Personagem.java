public class Personagem {
    String nome;
    int pontos;

    void usarArma(Arma arma){
        arma.resistencia-=2;
    }

    void tomarDano(){
        pontos-=5;
    }
}
