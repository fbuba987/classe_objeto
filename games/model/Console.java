package games.model;

public class Console extends Games{

    private String console;

    public Console(int id, String nome, int ano, String plataforma, float preco, String console) {
        super(id, nome, ano, plataforma, preco);

        this.console = console;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("\nConsole: " + this.console);
    }
}
