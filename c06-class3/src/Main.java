// POO na prática

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.nome = "Matheus";
        conta.conta = 1;
        conta.saldo = 1000.0F;
        conta.limite = 10000.0F;

        System.out.println(conta.saldo);

        System.out.println(conta.depositar(500));

        System.out.println(conta.saldo);
    }
}