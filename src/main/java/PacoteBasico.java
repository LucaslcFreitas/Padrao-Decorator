public class PacoteBasico implements PacoteDeViagem{
    float preco;
    String origem;
    String destino;

    public PacoteBasico(float preco, String origem, String destino) {
        this.preco = preco;
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getEstrutura() {
        return "Pacote Básico";
    }
}
