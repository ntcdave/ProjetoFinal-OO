package model.cliente;

public abstract class Cliente {
    protected String nome;
    protected String numero;

    // Construtor da classe
    public Cliente(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    public abstract String getRelatorio();

    public String getNome() {
        return nome;
    }
    
}

