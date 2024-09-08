/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.fornecedor.Fornecedor;

/**
 *
 * @author pedromoreira
 */
public class ControleFornecedor {
    Map<String, Fornecedor> fornecedores =
            new HashMap<String, Fornecedor>();
    
    public boolean cadastrarFornecedor(String razaoSocial, String cnpj, String numero) {
        if (!fornecedores.containsKey(cnpj)) {
            fornecedores.put(cnpj, new Fornecedor(razaoSocial, cnpj, numero));
            return true;
        } else {
            return false;
        }
    }
    
    public String getRelatorioTodosFornecedores() {
        String relatorio = "";
        for (Fornecedor f : fornecedores.values()) {
            relatorio += f.getRelatorio() + "\n================";
        }
        return relatorio;
    }
    
    public String getRelatorioFornecedor(String cnpj) {
        return this.fornecedores.get(cnpj).getRelatorio();
    }
}
