package contas;

public class Main {
    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        Conta contaC = new ContaCorrente(daniel);

        Conta contaP = new ContaPoupanca(felipe);
        contaC.depositar(300);

        contaP.imprimirExtrato();
        contaC.imprimirExtrato();




    }
}
