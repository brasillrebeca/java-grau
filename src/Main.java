import java.util.Scanner;

// ponto de entrada (entry point) para implementar a execução da lógica da aplicação loja
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar uma instância de Loja
        Loja loja = new Loja("Centro", "1234-5678", 1);

        // Adicionar itens predefinidos à loja
        adicionarItensPredefinidos(loja);

        // Criar menu interativo
        while (true) {

            // Menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Celular");
            System.out.println("2. Cadastrar Notebook");
            System.out.println("3. Cadastrar Serviço de Assistência");
            System.out.println("4. Mostrar Itens da Loja");
            System.out.println("5. Sair");

            // Entrada do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            // O switch irá executar os códigos referentes à opção do usuário
            switch (opcao) {
                case 1:
                    // Cadastrar Celular
                    System.out.print("Nome do Produto: ");
                    String nomeCelular = scanner.nextLine();
                    System.out.print("Código de Atendimento: ");
                    int codigoCelular = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Modelo: ");
                    String modeloCelular = scanner.nextLine();
                    System.out.print("Sistema Operacional: ");
                    String sistemaCelular = scanner.nextLine();
                    System.out.print("Tamanho da Tela: ");
                    float tamanhoTelaCelular = scanner.nextFloat();

                    Celular celular = new Celular(nomeCelular, codigoCelular, modeloCelular, sistemaCelular, tamanhoTelaCelular);
                    loja.adicionarItem(celular);  // Método adicionarItem na instância loja, definido no arquivo Loja
                    break; // Interrompendo o while

                case 2:
                    // Cadastrar Notebook
                    System.out.print("Nome do Produto: ");
                    String nomeNotebook = scanner.nextLine();
                    System.out.print("Código de Atendimento: ");
                    int codigoNotebook = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    System.out.print("Modelo: ");
                    String modeloNotebook = scanner.nextLine();
                    System.out.print("Sistema Operacional: ");
                    String sistemaNotebook = scanner.nextLine();
                    System.out.print("Tamanho da Tela: ");
                    float tamanhoTelaNotebook = scanner.nextFloat();
                    System.out.print("Memória RAM: ");
                    int memoriaRAMNotebook = scanner.nextInt();
                    System.out.print("Armazenamento: ");
                    int armazenamentoNotebook = scanner.nextInt();

                    Notebook notebook = new Notebook(nomeNotebook, codigoNotebook, modeloNotebook, sistemaNotebook, tamanhoTelaNotebook, memoriaRAMNotebook, armazenamentoNotebook);
                    loja.adicionarItem(notebook); 
                    break;

                case 3:
                    // Cadastrar Serviço de Assistência
                    System.out.print("Nome do Serviço: ");
                    String nomeServico = scanner.nextLine();
                    System.out.print("Código de Atendimento: ");
                    int codigoServico = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Descrição: ");
                    String descricaoServico = scanner.nextLine();
                    System.out.print("Preço: ");
                    float precoServico = scanner.nextFloat();
                    System.out.print("Tempo Estimado (horas): ");
                    int tempoEstimadoServico = scanner.nextInt();

                    ServicoAssistencia servico = new ServicoAssistencia(nomeServico, codigoServico, descricaoServico, precoServico, tempoEstimadoServico);
                    loja.adicionarItem(servico);
                    break;

                case 4:
                    // Mostrar Itens da Loja
                    loja.mostrarItens();
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Detalhes da loja e dos itens cadastrados:");
            loja.mostrarDetalhes();
            loja.mostrarItens();
        }
    }

    private static void adicionarItensPredefinidos(Loja loja) {
        // Criar instâncias de Celular
        Celular celular1 = new Celular("iPhone 13", 201, "iPhone 13", "iOS", 6.1f);
        Celular celular2 = new Celular("Samsung Galaxy S21", 202, "Galaxy S21", "Android", 6.2f);
        Celular celular3 = new Celular("Google Pixel 6", 203, "Pixel 6", "Android", 6.4f);
        Celular celular4 = new Celular("OnePlus 9", 204, "OnePlus 9", "Android", 6.55f);
        Celular celular5 = new Celular("Xiaomi Mi 11", 205, "Mi 11", "Android", 6.81f);
        Celular celular6 = new Celular("Huawei P40 Pro", 206, "P40 Pro", "Android", 6.58f);
        Celular celular7 = new Celular("Sony Xperia 1 III", 207, "Xperia 1 III", "Android", 6.5f);
        Celular celular8 = new Celular("LG Velvet", 208, "Velvet", "Android", 6.8f);
        Celular celular9 = new Celular("Nokia 8.3 5G", 209, "8.3 5G", "Android", 6.81f);
        Celular celular10 = new Celular("Motorola Edge+", 210, "Edge+", "Android", 6.7f);

        // Criar instâncias de Notebook
        Notebook notebook1 = new Notebook("Dell XPS 13", 301, "XPS 13", "Windows", 13.3f, 16, 512);
        Notebook notebook2 = new Notebook("MacBook Pro 16", 302, "MacBook Pro 16", "macOS", 16.0f, 32, 1024);
        Notebook notebook3 = new Notebook("HP Spectre x360", 303, "Spectre x360", "Windows", 13.3f, 16, 512);
        Notebook notebook4 = new Notebook("Lenovo ThinkPad X1 Carbon", 304, "ThinkPad X1 Carbon", "Windows", 14.0f, 16, 512);
        Notebook notebook5 = new Notebook("ASUS ROG Zephyrus G14", 305, "ROG Zephyrus G14", "Windows", 14.0f, 16, 1024);
        Notebook notebook6 = new Notebook("Microsoft Surface Laptop 4", 306, "Surface Laptop 4", "Windows", 13.5f, 16, 512);
        Notebook notebook7 = new Notebook("Acer Swift 3", 307, "Swift 3", "Windows", 14.0f, 8, 512);
        Notebook notebook8 = new Notebook("Razer Blade 15", 308, "Blade 15", "Windows", 15.6f, 16, 1024);
        Notebook notebook9 = new Notebook("Samsung Galaxy Book Pro", 309, "Galaxy Book Pro", "Windows", 15.6f, 16, 512);
        Notebook notebook10 = new Notebook("LG Gram 17", 310, "Gram 17", "Windows", 17.0f, 16, 1024);

        // Criar instâncias de ServicoAssistencia
        ServicoAssistencia servico1 = new ServicoAssistencia("Troca de Tela", 401, "Substituição de tela quebrada", 500.00f, 2);
        ServicoAssistencia servico2 = new ServicoAssistencia("Reparo de Bateria", 402, "Troca de bateria com defeito", 300.00f, 1);
        ServicoAssistencia servico3 = new ServicoAssistencia("Atualização de Software", 403, "Atualização para a versão mais recente do sistema operacional", 150.00f, 1);
        ServicoAssistencia servico4 = new ServicoAssistencia("Limpeza Interna", 404, "Limpeza de componentes internos para remoção de poeira", 200.00f, 1);
        ServicoAssistencia servico5 = new ServicoAssistencia("Reparo de Placa-Mãe", 405, "Conserto ou substituição da placa-mãe danificada", 800.00f, 3);
        ServicoAssistencia servico6 = new ServicoAssistencia("Troca de Teclado", 406, "Substituição de teclado danificado ou com defeito", 250.00f, 1);
        ServicoAssistencia servico7 = new ServicoAssistencia("Troca de Conector de Carregamento", 407, "Substituição do conector de carregamento defeituoso", 200.00f, 1);
        ServicoAssistencia servico8 = new ServicoAssistencia("Instalação de Antivírus", 408, "Instalação e configuração de software antivírus", 100.00f, 1);
        ServicoAssistencia servico9 = new ServicoAssistencia("Expansão de Memória RAM", 409, "Instalação de memória RAM adicional", 400.00f, 1);
        ServicoAssistencia servico10 = new ServicoAssistencia("Substituição de HD por SSD", 410, "Troca de disco rígido por unidade de estado sólido", 600.00f, 2);

        // Adicionar os itens à loja
        loja.adicionarItem(celular1);
        loja.adicionarItem(celular2);
        loja.adicionarItem(celular3);
        loja.adicionarItem(celular4);
        loja.adicionarItem(celular5);
        loja.adicionarItem(celular6);
        loja.adicionarItem(celular7);
        loja.adicionarItem(celular8);
        loja.adicionarItem(celular9);
        loja.adicionarItem(celular10);

        loja.adicionarItem(notebook1);
        loja.adicionarItem(notebook2);
        loja.adicionarItem(notebook3);
        loja.adicionarItem(notebook4);
        loja.adicionarItem(notebook5);
        loja.adicionarItem(notebook6);
        loja.adicionarItem(notebook7);
        loja.adicionarItem(notebook8);
        loja.adicionarItem(notebook9);
        loja.adicionarItem(notebook10);

        loja.adicionarItem(servico1);
        loja.adicionarItem(servico2);
        loja.adicionarItem(servico3);
        loja.adicionarItem(servico4);
        loja.adicionarItem(servico5);
        loja.adicionarItem(servico6);
        loja.adicionarItem(servico7);
        loja.adicionarItem(servico8);
        loja.adicionarItem(servico9);
        loja.adicionarItem(servico10);
    }
}
