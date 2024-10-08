package controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.cliente.Cliente;
import model.cliente.PessoaFisica;
import model.cliente.PessoaJuridica;

public class ControleCliente {
    Map<String, Cliente> clientes = new HashMap<>();
    
    public boolean cadastrarCliente(String nome, String doc, String telefone, String tipo) {
        if (clientes.get(doc) == null) {
            if (tipo.equals("pf")) {
                clientes.put(doc, new PessoaFisica(nome, doc, telefone));
            } else {
                clientes.put(doc, new PessoaJuridica(nome, doc, telefone));
            }
            return true;
        }
        return false;
    }

    public String getRelatorioTodosClientes() {
        String relatorio = "\n";
        for (Cliente c : clientes.values()) {
            relatorio += c.getRelatorio() + "\n";
        }

        return relatorio;
    }

    public String getRelatorioUmCliente(String chave){
            return this.clientes.get(chave).getRelatorio();
    }

}
