package cliente;

import cliente.model.Cliente;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Filipe", 123, "706.640.532-18", "(11) 97744-3333", "08690-732" );
        Cliente c2 = new Cliente("Armando", 456, "706.640.532-16", "(11) 97744-4444", "08690-732" );

        c1.visualizar();
        c2.visualizar();
    }
}
