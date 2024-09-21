package POO.MenumAQUI.exerciciosEnum.exercicio02.dominio;

public enum OperacaoMatematica {
    ADICAO {
        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    }, SUBTRACAO {
        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    }, MULTIPLICACAO {
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    }, DIVISAO {
        @Override
        public double calcular(double a, double b) {
            if (b == 0) return 0;

            return a / b;
        }
    };

    public abstract double calcular(double a, double b);
}
