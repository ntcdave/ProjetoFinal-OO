/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

public class PessoaFisica extends Cliente {
    
    private String cpf;
    
    // Construtor
    public PessoaFisica(String nome, String cpf, String numero) {
        super(nome, numero);
        this.cpf = cpf;
    }
    
    @Override
    public String getRelatorio() {
        String relatorio = "DADOS DA PESSOA FÍSICA\n" +
                "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n";
        return relatorio;
    }
}
