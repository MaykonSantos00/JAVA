package JavaCore.EstruturasCondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;

        // String resultado = (coondicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro dev dojo" : "Eu nao vou doar 500 pro dev dojo";
        System.out.println(resultado);
    }
}
