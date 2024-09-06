/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.funcionario;

/**
 *
 * @author pedromoreira
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getRelatorio() {
        String relatorio = "\nNome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nSalario: " + this.salario;
        return relatorio;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    
}
