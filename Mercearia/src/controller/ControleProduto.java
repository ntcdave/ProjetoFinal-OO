/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.produto.Produto;

/**
 *
 * @author pedromoreira
 */
public class ControleProduto {
    //Cria o mapa para armazenar os produtos
    Map<String, Produto> produtos =
            new HashMap<String, Produto>();
    
    public boolean cadastrarProduto(String nome, String codigo, double quantidade) {
        if (!produtos.containsKey(codigo)) {
            produtos.put(codigo, new Produto(nome, codigo, quantidade));
            return true;
        } else {
            return false;
        }
    }

    public String getRelatorioTodosProdutos() {
        String relatorio = "";
        for (Produto f : produtos.values()) {
            relatorio += f.getRelatorio() + "\n================";
        }
        return relatorio;
    }
    
    public String getRelatorioProduto(String codigo) {
        Produto produto = this.produtos.get(codigo);
        if (produto != null) {
            return produto.getRelatorio();
        } else {
            return null;
        }
}

    
}
