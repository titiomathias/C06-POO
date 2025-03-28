package br.com.pcmania;

public class Cliente {
    String nome;
    Long cpf;
    Computador[] computadores;

    public Cliente(String nome, Long cpf){
        this.nome = nome;
        this.cpf = cpf;
        computadores = new Computador[20];
    }

    public float calculaTotalCompra(){
        float total = 0f;

        for (Computador computador : computadores) {
            if (computador != null){
                total += computador.preco;
            }
        }

        return total;
    }

    public void getInformationClient(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    public void getInformationPc(){
        for(Computador computador : computadores){
            if (computador != null){
                System.out.println("--------------------------------------");
                computador.mostraPCConfigs();
            }
        }
    }

    public void addComputador(Computador computador){
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] == null){
                computadores[i] = computador;
                break;
            }
        }

        System.out.println("Computador " + computador.marca + " adicionado ao seu carrinho!");
    }
}
