public class Celular extends ItemLoja {

    // Atributos
    private String modelo;
    private String sistemaOperacional;
    private float tamanhoTela;

    // Construtor
    public Celular(String nomeProduto, int códigoAtendimento, String modelo, String sistemaOperacional, float tamanhoTela) {
        super(nomeProduto, códigoAtendimento); // Construtor da classe pai (ItemLoja)
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
    }
    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(Float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    // Método para mostrar os detalhes de celulares
    @Override
    public void mostrarDetalhes() {
        System.out.format("Celular %s com tela %.1f e SO %s\n", modelo, tamanhoTela, sistemaOperacional);
    } 
}
