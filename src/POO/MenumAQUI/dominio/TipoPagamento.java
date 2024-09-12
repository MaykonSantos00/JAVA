package POO.MenumAQUI.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calculaValorPagamento(double valorPagamento) {
            return valorPagamento * 0.30;
        }
    },
    CREDITO {
        @Override
        public double calculaValorPagamento(double valorPagamento) {
            return valorPagamento * 0.30;
        }
    };

    public abstract double calculaValorPagamento(double valorPagamento);
}
