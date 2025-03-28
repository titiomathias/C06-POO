package br.com.pcmania;

public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriausb;
    SistemaOperacional sistema;
    HardwareBasico[] hardwares;

    public Computador(String marca, float preco, String nomeSistema, int tipoSistema, HardwareBasico[]  hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = new SistemaOperacional(nomeSistema, tipoSistema);
        this.hardwares = hardwares;
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardware básico:");
        for (HardwareBasico hardware: hardwares){
            System.out.println(hardware.nome + " - " + hardware.capacidade);
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");
        if(memoriausb != null){
            System.out.println("Acompanha " + memoriausb.nome + " (" + memoriausb.capacidade + ")");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriausb = musb;
    }
}
