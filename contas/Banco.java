package contas;

import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> clientes;

    public String getNome() {
        return nome;
    }

    public void setClientes(List<Conta> clientes) {
        this.clientes = clientes;
    }
}
