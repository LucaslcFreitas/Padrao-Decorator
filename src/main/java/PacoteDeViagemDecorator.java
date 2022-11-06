public abstract class PacoteDeViagemDecorator implements PacoteDeViagem{
    private PacoteDeViagem pacoteDeViagem;
    private String estrutura;

    public PacoteDeViagemDecorator(PacoteDeViagem pacoteDeViagem) {
        this.pacoteDeViagem = pacoteDeViagem;
    }

    public PacoteDeViagem getPacoteDeViagem() {
        return pacoteDeViagem;
    }

    public void setPacoteDeViagem(PacoteDeViagem pacoteDeViagem) {
        this.pacoteDeViagem = pacoteDeViagem;
    }

    public abstract float getCusto();

    public float getPreco() {
        return this.pacoteDeViagem.getPreco() + this.getCusto();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.pacoteDeViagem.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
