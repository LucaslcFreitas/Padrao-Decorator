public class AluguelAutomovel extends PacoteDeViagemDecorator{

    public AluguelAutomovel(PacoteDeViagem pacoteDeViagem) {
        super(pacoteDeViagem);
    }

    @Override
    public float getCusto() {
        return 500.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Aluguel Automovel";
    }
}
