package POO.Jheranca.teste;

import POO.Jheranca.dominio.Endereco;
import POO.Jheranca.dominio.Funcionario;
import POO.Jheranca.dominio.Pessoa;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Jose");

        endereco.setNumero(69);
        endereco.setRua("Boca Do Acre");

        pessoa.setCpf("04753245284");
        pessoa.setEndereco(endereco);//ATENÇÃO AQUI!!! ESTOU PASSANDO O PRÓPRIO ENDEREÇO DO ENDEREÇO

        pessoa.imprime();

        System.out.println("###################");

        Funcionario funcionario = new Funcionario("Malaquias");
        funcionario.setSalario(20000);
        funcionario.setCpf("34567893");

        endereco.setNumero(67);
        endereco.setRua("Passagem miracy");
        funcionario.setEndereco(endereco);

        funcionario.imprime();
        funcionario.imprime2();
    }
}
