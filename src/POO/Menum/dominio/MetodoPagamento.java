package POO.Menum.dominio;

public enum MetodoPagamento {
    DEBITO {
        @Override
        public double desconto(double valor) {
            return valor * 0.15;
        }
    }, A_VISTA {
        @Override
        public double desconto(double valor) {
            return valor * 0.15;
        }
    }, PARCELADO {
        @Override
        public double desconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double desconto(double valor);
}