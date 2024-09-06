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

    public Fornecedor(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    
    public String getRelatorio() {
        String relatorio = "\nRazão Social: " + this.razaoSocial +
                "\nCNPJ: " + this.cnpj;
        return relatorio;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }    
    
}
