public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] clientes;

    public Conta(){
        Cliente cliente = new Cliente();
    }

    public void setSaldo(float quantia){
        if(quantia >= this.saldo){
            this.saldo -= quantia;
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
    }
}
