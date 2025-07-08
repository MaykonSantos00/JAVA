package BPOO.Ppolimorfismo.teste;

import BPOO.Ppolimorfismo.repositorio.Repositorio;
import BPOO.Ppolimorfismo.servico.RepositorioArquivo;
import BPOO.Ppolimorfismo.servico.RepositorioBancoDeDados;
import BPOO.Ppolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio rep1 = new RepositorioArquivo();
        Repositorio rep2 = new RepositorioBancoDeDados();
        Repositorio rep3 = new RepositorioMemoria();

        rep1.salvar();
        rep2.salvar();
        rep3.salvar();
    }
}
