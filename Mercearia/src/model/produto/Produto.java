/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.produto;

/**
 *
 * @author pedromoreira
 */
public class Produto {
    private String nome;
    private String codigo;
    private double quantidade;

    public Produto(String nome, String codigo, double quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    
    public String getRelatorio() {
        String relatorio = "\nNome: " + this.nome +
                "\nCódigo: " + this.codigo +
                "\nQuantidade: " + this.quantidade;
        return relatorio;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }
    
}
