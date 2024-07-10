public class Notebook extends ItemLoja {

    // Atributos
    private String modelo;
    private String sistemaOperacional;
    private float tamanhoTela;
    private int memoriaRAM;
    private int armazenamento;

    // Construtor
    public Notebook(String nomeProduto, int codigoAtendimento, String modelo, String sistemaOperacional, float tamanhoTela, int memoriaRAM, int armazenamento) {
        super(nomeProduto, codigoAtendimento); // Construtor da classe pai (ItemLoja)
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
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

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    // Método para mostrar os detalhes do notebook
    @Override
    public void mostrarDetalhes() {
        System.out.format("Notebook %s com tela %.1f\", SO %s, RAM %dGB e armazenamento %dGB\n", modelo, tamanhoTela, sistemaOperacional, memoriaRAM, armazenamento);
    }
}

