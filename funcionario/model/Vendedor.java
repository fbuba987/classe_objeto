package funcionario.model;

public class Vendedor extends Funcionario {

    private int celular;


    public Vendedor(int id, String nome, String cidade, int cargo, float salario, int celular) {
        super(id, nome, cidade, cargo, salario);

        this.celular = celular;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\nO celular é: " + getCelular());
    }
}
