package POO.Menum.teste;

import POO.Menum.dominio.Cliente;
import POO.Menum.dominio.TipoCliente;
import POO.Menum.dominio.TipoPagamento;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maykon", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Irineu", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

        TipoCliente tipoCliente = TipoCliente.getTipoCliente("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
