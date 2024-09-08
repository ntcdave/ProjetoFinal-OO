package model.cliente;

public class PessoaJuridica extends Cliente {
    
    private String cnpj;
    
    public PessoaJuridica(String nome, String cnpj, String numero) {
        super(nome, numero);
        this.cnpj = cnpj;
    }

    @Override
    public String getRelatorio() {
        String relatorio = "DADOS DA PESSOA JURÍDICA\n" +
                "RAZÃO SOCIAL: " + this.nome + "\n" +
                "NÚMERO: " + this.numero + "\n" +
                "CPF: " + this.cnpj + "\n";
        return relatorio;
    }
}
