package funcionario;

import funcionario.model.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(123, "Buba", "São Paulo", "CEO", 500000);
        Funcionario f2 = new Funcionario(456, "Eduardo", "São Paulo", "Diretor", 300000);

        f1.visualizar();
        f2.visualizar();

    }
}
