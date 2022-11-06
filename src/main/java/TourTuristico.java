public class TourTuristico extends PacoteDeViagemDecorator{

    public TourTuristico(PacoteDeViagem pacoteDeViagem) {
        super(pacoteDeViagem);
    }

    @Override
    public float getCusto() {
        return 400.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Tour Turistico";
    }
}
