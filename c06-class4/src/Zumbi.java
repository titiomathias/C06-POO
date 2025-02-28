public class Zumbi {
    String nome;
    int vida;
    int forca;
    int destreza;

    int agredir(){
        return forca*5;
    }

    int infectar(){
        return (destreza+forca)*2;
    }

    int correr(){
        return destreza*3;
    }

    void devorar(int pessoas){
        vida = vida+2;
    }
}
