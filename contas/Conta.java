package contas;


public abstract class Conta implements IConta{
   
    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta (){

        agencia = Conta.AGENCIA_PADRAO;
        numero = SEQUENCIAL++;

    };

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirComuns (){
        System.out.println(String.format("Agencia %d", agencia));
        System.out.println(String.format("Conta %d", numero));
        System.out.println(String.format("Saldo %d", saldo));
            
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    
    
}
