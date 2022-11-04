package cliente;

import cliente.model.Cliente;
import cliente.model.PessoaFisica;
import cliente.model.PessoaJuridica;

public class TestaCliente {

    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica("Filipe", 123, "Sao Paulo", 1, "45700000", "708.453.654-19");
        PessoaFisica p2 = new PessoaFisica("Buba", 456, "Porto", 1, "42300000", "705.653.654-19");
        PessoaJuridica pj1 = new PessoaJuridica("Armando", 321, "Mala", 2, "43900000", "808.453/654-19");
        PessoaJuridica pj2 = new PessoaJuridica("Matu", 325, "Santo", 2, "43900000", "808.453/654-18");

        p1.visualizar();
        p2.visualizar();
        pj1.visualizar();
        pj2.visualizar();
    }
}
