package cliente.model;

public class Cliente {

    private String nome;
    private int id;
    private String cpf;
    private String numero;
    private String cep;


    public Cliente(String nome, int id, String cpf, String numero, String cep) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.numero = numero;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void visualizar(){
        System.out.println("***********************************" );
        System.out.println("O nome: " + getNome());
        System.out.println("***********************************");
        System.out.println("O numero de celular: " + getNumero());
        System.out.println("***********************************");
        System.out.println("O numero cep: " + getCep());
        System.out.println("***********************************");
        System.out.println("O numero CPF: " + getCpf());
        System.out.println("***********************************");
        System.out.println("O ID: " + getId());
    }
}
