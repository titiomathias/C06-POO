public class Zumbis {
    String nome;
    double vida;

    double mostrarVida(){
        return vida;
    }

    boolean transfereVida(Zumbis zumbiAlvo, double quantia){
        if(quantia >= vida){
            zumbiAlvo.vida+=quantia;
            vida-=quantia;
            return true;
        } else {
            return false;
        }
    }
}
