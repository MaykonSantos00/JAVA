package POO.MenumAQUI.exerciciosEnum.exercicio01.dominio;

public class RetornaDiasMes {
    private Mes mes;

    public void retornaDiasMes(Mes mes) {
        for (Mes value : getMes().values()) {
            if (value.equals(mes)) {
                System.out.println(mes.getQtdDias());
                return;
            }
        }
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }
}
