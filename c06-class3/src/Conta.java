public class Conta {
    String nome;
    float saldo;
    int conta;
    float limite;

    float sacar(float valor){
        if (saldo > valor){
            saldo -= valor;
        } else {
            return 0;
        }

        return valor;
    }

    float depositar(float valor){
        saldo += valor;
        return saldo;
    }
}
