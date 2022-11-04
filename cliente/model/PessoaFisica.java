package cliente.model;

public class PessoaFisica extends Cliente{

    private String cpf;
    public PessoaFisica(String nome, int id, String cidade, int numero, String cep, String cpf) {
        super(nome, id, cidade, numero, cep);

        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void visualizar() {
        super.visualizar();
        System.out.println("\n seu CPF: " + this.cpf);
    }
}
