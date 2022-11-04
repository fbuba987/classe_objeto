package funcionario.model;

public class Funcionario {

    private int id;
    private String nome;
    private String cidade;
    private int cargo;
    private float salario;

    public Funcionario(int id, String nome, String cidade, int cargo, float salario) {
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

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void visualizar(){

        String cargo = "";
        switch (this.cargo){
            case 1:
                cargo = "Gerente";
                break;
            case 2:
                cargo = "Vendedor";
        }

        System.out.println("***********************************" );
        System.out.println("\nO ID: " + this.id);
        System.out.println("\nO nome de cliente: " + getNome());
        System.out.println("\nCidade: " + getCidade());
        System.out.println("\nSalario: " + getSalario());
    }
}
