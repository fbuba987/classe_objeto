package cliente.model;

public class Cliente {

    private String nome;
    private int id;
    private String cidade;
    private int numero;
    private String cep;


    public Cliente(String nome, int id, String cidade, int numero, String cep) {
        this.nome = nome;
        this.id = id;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void visualizar(){

        String numero = "";

        switch (this.numero) {
            case 1:
                numero = "Pessoa Física";
                break;
            case 2:
                numero = "Pessoa jurídica";
                break;
        }

        System.out.println("***********************************" );
        System.out.println("O nome: " + getNome());
        System.out.println("***********************************");
        System.out.println("O numero cep: " + getCep());
        System.out.println("***********************************");
        System.out.println("O ID: " + getId());
        System.out.println("***********************************");
        System.out.println("A sua cidade: " + getCidade());
    }
}
