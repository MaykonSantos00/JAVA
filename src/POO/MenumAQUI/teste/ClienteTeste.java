package POO.MenumAQUI.teste;

import POO.MenumAQUI.dominio.Cliente;
import POO.MenumAQUI.dominio.TipoCliente;
import POO.MenumAQUI.dominio.TipoPagamento;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maykon", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Irineu", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
