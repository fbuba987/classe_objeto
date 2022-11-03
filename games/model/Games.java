package games.model;

public class Games {

    private int id;
    private String nome;
    private int ano;
    private String plataforma;
    private float preco;

    public Games(int id, String nome, int ano, String plataforma, float preco) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.plataforma = plataforma;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void visualizar(){
        System.out.println("***********************************" );
        System.out.println("O ID: " + this.id);
        System.out.println("***********************************");
        System.out.println("O nome de cliente: " + getNome());
        System.out.println("***********************************");
        System.out.println("Cidade: " + getAno());
        System.out.println("***********************************");
        System.out.println("Cargo: " + getPlataforma());
        System.out.println("***********************************");
        System.out.println("Salario: " + getPreco());
    }
}
