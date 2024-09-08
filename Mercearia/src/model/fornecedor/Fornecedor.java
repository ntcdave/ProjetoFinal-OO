/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fornecedor;

/**
 *
 * @author pedromoreira
 */
public class Fornecedor {
    private String razaoSocial;
    private String cnpj;
    private String numero;

    public Fornecedor(String razaoSocial, String cnpj, String numero) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.numero = numero;
    }

    public Fornecedor(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    
    
    public String getRelatorio() {
        String relatorio = "\nRazão Social: " + this.razaoSocial +
                "\nCNPJ: " + this.cnpj +
                "\nNúmero: " + this.numero;
        return relatorio;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    } 

    public String getNumero() {
        return numero;
    }
    
}
