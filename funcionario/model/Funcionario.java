package funcionario.model;

public class Funcionario {

    private int id;
    private String nome;
    private String cidade;
    private String cargo;
    private float salario;

    public Funcionario(int id, String nome, String cidade, String cargo, float salario) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void visualizar(){
        System.out.println("***********************************" );
        System.out.println("O ID: " + this.id);
        System.out.println("***********************************");
        System.out.println("O nome de cliente: " + getNome());
        System.out.println("***********************************");
        System.out.println("Cidade: " + getCidade());
        System.out.println("***********************************");
        System.out.println("Cargo: " + getCargo());
        System.out.println("***********************************");
        System.out.println("Salario: " + getSalario());
    }
}
