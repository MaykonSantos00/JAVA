package RevisaoPOO.Fherancapolimorfismo.exercicio02.dominio;

public class ReceitaFederal implements ImpostoContribuinte {
    private Contribuinte contribuinte;

    @Override
    public void calculaImposto(Contribuinte contribuinte) {
        if (contribuinte == null) return;
        if (contribuinte.getTipoContribuinte() == TipoContribuinte.PESSOA_JURIDICA) {
            System.out.println("Imposto a ser pago por " + contribuinte.getNome() + " é R$" + (contribuinte.getSalario() * 0.1));
        } else if (contribuinte.getTipoContribuinte() == TipoContribuinte.PESSOA_FISICA) {
            double salario = contribuinte.getSalario();
            if (salario >= 0 && salario <= 1400) {
                System.out.println("Aliquota = 0%, Parcela a deduzir = R$0");
            } else if (salario > 1400 && salario <= 2100) {
                System.out.println("Aliquota = 10%, Parcela a deduzir = R$" + (salario * 0.1));
            } else if (salario > 2100 && salario <= 2800) {
                System.out.println("Aliquota = 15%, Parcela a deduzir = R$" + (salario * 0.15));
            } else if (salario > 2800 && salario <= 3600) {
                System.out.println("Aliquota = 25%, Parcela a deduzir = R$" + (salario * 0.25));
            } else if (salario > 3600) {
                System.out.println("Aliquota = 30%, Parcela a deduzir = R$" + (salario * 0.3));
            } else {
                System.out.println("Salario Inválido");
            }
        }
    }

    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }
}
