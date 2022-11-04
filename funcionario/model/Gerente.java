package funcionario.model;

public class Gerente extends Funcionario{

    private String setor;

    public Gerente(int id, String nome, String cidade, int cargo, float salario, String setor) {
        super(id, nome, cidade, cargo, salario);

        this.setor = setor;

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\nSetor: " + this.setor);
    }
}
