package RevisaoPOO.Fherancapolimorfismo.exercicio01.teste;

import RevisaoPOO.Fherancapolimorfismo.exercicio01.dominio.ContaBancaria;
import RevisaoPOO.Fherancapolimorfismo.exercicio01.dominio.ContaEspecial;
import RevisaoPOO.Fherancapolimorfismo.exercicio01.dominio.ContaPoupanca;

public class ContasTeste {
    public static void main(String[] args) {

        System.out.println("### Conta Bancaria simples ###");
        ContaBancaria contaBancaria = new ContaBancaria("Mkzinho", "123456");
        contaBancaria.setSaldo(0);
        contaBancaria.depositar(300);
        contaBancaria.sacar(100);
        System.out.println(contaBancaria);

        System.out.println("### Conta Poupança ###");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Barbio", "56789");
        contaPoupanca.setSaldo(2000);
        contaPoupanca.setDiaRendimento(200);
        contaPoupanca.calculaNovoSaldo();
        System.out.println(contaPoupanca);

        System.out.println("### Conta Especials ###");
        ContaEspecial contaEspecial = new ContaEspecial("KKKKKK", "567890");
        contaEspecial.setSaldo(5000);
        contaEspecial.setLimite(5000);
        contaEspecial.sacar(12000);
        System.out.println(contaEspecial);
    }
}
