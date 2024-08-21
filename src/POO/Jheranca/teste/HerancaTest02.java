package POO.Jheranca.teste;

import POO.Jheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar classe mae
    // 1 - Bloco de inicialização estatico da sub classe classe é executado quando a JVM carregar classe filho
    // 2 - Alocado espaco em memória pro objeto da classe pai
    // 3 - Cada atributo de super classe pai é criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização da classe pai é executado na ordem que aparece
    // 5 - Construtor da classe pai é executado
    // 6 - Alocado espaco em memória pro objeto da classe filho
    // 7 - Cada atributo da classe filho é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da classe filho é executado na ordem que aparece
    // 9 - Construtor da classe filho é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kasisi");
    }
}
