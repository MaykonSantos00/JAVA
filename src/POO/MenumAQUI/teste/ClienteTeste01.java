package POO.MenumAQUI.teste;

import POO.MenumAQUI.dominio.Cliente;
import POO.MenumAQUI.dominio.MetodoPagamento;
import POO.MenumAQUI.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maykon", TipoCliente.PESSOA_FISICA, MetodoPagamento.A_VISTA);
        Cliente cliente2 = new Cliente("Maykon", TipoCliente.PESSOA_JURIDICA, MetodoPagamento.PARCELADO);
        Cliente cliente3 = new Cliente("Maykon", TipoCliente.PESSOA_FISICA, MetodoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Maykon", TipoCliente.PESSOA_JURIDICA, MetodoPagamento.PARCELADO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println(MetodoPagamento.PARCELADO.desconto(20000));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente.getRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);
    }
}
