/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.funcionario.Funcionario;

/**
 *
 * @author pedromoreira
 */
public class ControleFuncionario {
    //Cria o Mapa para armazenar os funcionários
    Map<String, Funcionario> funcionarios =
            new HashMap<String, Funcionario>();
    
    //Metodo para cadastrar os funcionários
    public boolean cadastrarFuncionario(String nome, String cpf, double salario) {
        if (!funcionarios.containsKey(cpf)) {
            funcionarios.put(cpf, new Funcionario(nome, cpf, salario));
            return true;
        } else {
           return false; 
        }
    }
    
    public String getRelatorioTodosFuncionarios() {
        String relatorio = "";
        for (Funcionario f : funcionarios.values()) {
            relatorio += f.getRelatorio() + "\n================";
        }
        return relatorio;
    }
    
    public String getRelatorioFuncionario(String cpf) {
        Funcionario f = this.funcionarios.get(cpf);
        if (f !=null) {
            return f.getRelatorio();
        } else {
            return null;
        }
     }
    
}
