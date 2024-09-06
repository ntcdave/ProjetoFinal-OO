/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.produto.Produto;

/**
 *
 * @author pedromoreira
 */
public class ControleProduto {
    //Cria o mapa para armazenar os produtos
    Map<String, Produto> produtos = new HashMap<String, Produto>();
    
    public void cadastrarProduto(String nome, String codigo, int quantidade) {
        produtos.put(codigo, new Produto(nome, codigo, quantidade));
    }
    
    public String getRelatorioTodosProdutos() {
        String relatorio = "";
        for (Produto f : produtos.values()) {
            relatorio += f.getRelatorio() + "\n================";
        }
        return relatorio;
    }
    
    public String getRelatorioProduto(String codigo) {
        return this.produtos.get(codigo).getRelatorio();
}
}
