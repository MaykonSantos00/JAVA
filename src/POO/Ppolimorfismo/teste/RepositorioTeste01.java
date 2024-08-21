package POO.Ppolimorfismo.teste;

import POO.Ppolimorfismo.repositorio.Repositorio;
import POO.Ppolimorfismo.servico.RepositorioArquivo;
import POO.Ppolimorfismo.servico.RepositorioBancoDeDados;
import POO.Ppolimorfismo.servico.RepositorioMemoria;

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
