public class ServicoAssistencia extends ItemLoja {

    // Atributos
    private String descricao;
    private float preco;
    private int tempoEstimado; // em horas

    // Construtor
    public ServicoAssistencia(String nomeServico, int codigoAtendimento, String descricao, float preco, int tempoEstimado) {
        super(nomeServico, codigoAtendimento); // Construtor da classe pai (ItemLoja)
        this.descricao = descricao;
        this.preco = preco;
        this.tempoEstimado = tempoEstimado;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    // Método para mostrar os detalhes do serviço de assistência técnica
    @Override
    public void mostrarDetalhes() {
        System.out.format("Serviço: %s\nDescrição: %s\nPreço: %.2f\nTempo Estimado: %d horas\n", getNomeProduto(), descricao, preco, tempoEstimado);
    }
}
