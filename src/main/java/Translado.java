public class Translado extends PacoteDeViagemDecorator{

    public Translado(PacoteDeViagem pacoteDeViagem) {
        super(pacoteDeViagem);
    }

    @Override
    public float getCusto() {
        return 200.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Translado";
    }
}
