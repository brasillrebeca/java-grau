import java.util.ArrayList;

// Atributos
public class Loja {
    private String bairro;
    private String contato;
    private int unidade;
    private final ArrayList<ItemLoja> itens;

// Construtor
public Loja(String bairro, String contato, int unidade) {
    this.bairro = bairro;
    this.contato = contato;
    this.unidade = unidade;
    this.itens = new ArrayList<>();
}

    // Getters e Setters
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        if (unidade > 0) {
            this.unidade = unidade;
        } else {
            System.out.println("Filial não encontrada. Revise a unidade informada.");
        }
    }

    // Método para adicionar itens à loja
    public void adicionarItem(ItemLoja item) {
        itens.add(item);
    }

    // Método para mostrar todos os itens da loja
    public void mostrarItens() {
        for (ItemLoja item : itens) {
            item.mostrarDetalhes();
        }
    }

    // Implementação do método mostrarDetalhes
    public void mostrarDetalhes() {
        System.out.format("Loja no bairro %s, contato: %s, unidade: %d\n", getBairro(), getContato(), getUnidade());
    }
}
