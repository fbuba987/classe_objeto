package cliente.model;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(String nome, int id, String cidade, int numero, String cep, String cnpj) {
        super(nome, id, cidade, numero, cep);

        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void visualizar() {
        super.visualizar();
        System.out.println("Seu CNPJ é: " + this.cnpj);
    }
}
