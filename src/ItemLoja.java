// Classe modelo para as demais que herdarão dela
public abstract class ItemLoja {

    // Atributos
    private String nomeProduto;
    private int códigoAtendimento;

    // Construtor
    public ItemLoja(String nomeProduto, int códigoAtendimento) {
        this.nomeProduto = nomeProduto;
        this.códigoAtendimento = códigoAtendimento;
    }

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCódigoAtendimento() {
        return códigoAtendimento;
    }

    public void setCódigoAtendimento(int códigoAtendimento) {
        this.códigoAtendimento = códigoAtendimento;
    }

    // Método mostrarDetalhes a ser sobrescrito nas subclasses
    public void mostrarDetalhes() {
        System.out.println("Produto ou serviço: " + nomeProduto + ", Código do atendimento: " + códigoAtendimento);
    }
}