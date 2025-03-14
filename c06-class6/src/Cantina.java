public class Cantina {
    String nome;
    Salgado salgados[];

    void addSalgado(Salgado novoSalgado){
        System.out.println("Salgado adicionado:" + novoSalgado.nome);
    }

    void mostraInfo(){
        System.out.println("Lista de salgados: ");
        for (Salgado salgado : salgados){
            System.out.println(salgado.nome);
        }
    }
}
