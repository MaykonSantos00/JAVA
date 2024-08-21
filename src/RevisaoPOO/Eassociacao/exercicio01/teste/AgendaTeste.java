package RevisaoPOO.Eassociacao.exercicio01.teste;

import RevisaoPOO.Eassociacao.exercicio01.dominio.Agenda;
import RevisaoPOO.Eassociacao.exercicio01.dominio.Contato;

public class AgendaTeste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda("Agenda Maykon", 3);

        Contato contato1 = new Contato();
        contato1.setNome("Lívyan ");
        contato1.setTelefone("919 8551-5969");
        contato1.setEmail("lia05@gmail.com");

        Contato contato2 = new Contato();
        contato2.setNome("Luan ");
        contato2.setTelefone("919 9999-9999");
        contato2.setEmail("luan05@gmail.com");

        Contato contato3 = new Contato();
        contato3.setNome("Mae ");
        contato3.setTelefone("919 8538-3394");
        contato3.setEmail("tania05@gmail.com");

        Contato[] contatos = new Contato[3];
        contatos[0] = contato1;
        contatos[1] = contato2;
        contatos[2] = contato3;
        agenda.setContados(contatos);

        agenda.imprimeContatos();


    }
}
