package contas;

public class Main {
    public static void main(String[] args) {
        
        Conta contaC = new ContaCorrente();

        Conta contaP = new ContaPoupanca();
        contaC.depositar(300);
        contaP.imprimirExtrato();
        contaC.imprimirExtrato();




    }
}
