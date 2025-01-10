package POO.Nclassesabstratas.teste;

import POO.Nclassesabstratas.dominio.Desenvolvedor;
import POO.Nclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maykon", 200000);
        Gerente gerente = new Gerente("Maykon", 500000);

        System.out.println(desenvolvedor);
        System.out.println(gerente);

        gerente.imprime();
        desenvolvedor.imprime();
    }

}
