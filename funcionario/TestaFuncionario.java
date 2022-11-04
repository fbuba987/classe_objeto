package funcionario;

import funcionario.model.Funcionario;
import funcionario.model.Gerente;
import funcionario.model.Vendedor;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(456, "Fonde", "Bahia", 1, 8000);
        Funcionario f2 = new Funcionario(678, "Roberto", "Bahia", 2, 4000);

        Gerente g1 = new Gerente(123, "Fato", "Catio", 1, 10000.0f, "Financeiro");
        Gerente g2 = new Gerente(123, "Paulo", "Rio de Janeiro", 1, 10000.0f, "Markting");

        Vendedor v1 = new Vendedor(321, "Busna", "Sao Paulo", 2, 5000, 987653423);
        Vendedor v2 = new Vendedor(321, "Soraia", "Sao Paulo", 2, 5000, 997653423);

        g1.visualizar();
        v1.visualizar();
        g2.visualizar();
        v2.visualizar();
        f1.visualizar();
        f2.visualizar();


    }
}
