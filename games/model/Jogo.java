package games.model;

public class Jogo extends Games{

    private String tipo;
    public Jogo(int id, String nome, int ano, String plataforma, float preco, String tipo) {
        super(id, nome, ano, plataforma, preco);

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tipo de Jogo: " + this.tipo);
    }
}
