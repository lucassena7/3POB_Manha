package br.edu.faeterj;

import java.util.*;

public class QuartoMenu {
    public List<Quarto> quartos = new ArrayList<>();
    private Scanner sc; 
    private int opcao;
    
    public QuartoMenu(Scanner sc) {
		this.sc = sc;
	}

    public void Processamento() {
        do {
            System.out.println("Digite a opcao:");
            System.out.println("1- Incluir Quarto: ");
            System.out.println("2- Alterar Quarto: ");
            System.out.println("3- Excluir Quarto: ");
            System.out.println("4- Listar Quartos: ");
            System.out.println("5- Sair ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirQuarto(sc);
                    break;
                case 2:
                    alterarQuarto(sc);
                    break;
                case 3:
                    excluirQuarto(sc);
                    break;
                case 4:
                    listarQuartos();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 5);
        //sc.close();
    }
    
	public void incluirQuarto(Scanner sc) {
    	int id;
    	String nomeQuarto=  "";
        int qtdeCamas;
        boolean temBanheiro;
        int op;
        String descricao= "";
        
        System.out.println("Digite o Id do Quarto: ");
        id = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Digite o Nome do Quarto: ");
        nomeQuarto = sc.nextLine();
        
        System.out.println("Digite a Quantidade de Camas que o quarto possui: ");
        qtdeCamas = sc.nextInt();
        
        System.out.println("O quarto tem Banheiro ? (1-SIM || 2-NAO): ");
        op = sc.nextInt();
        if (op == 1) {
        	temBanheiro = true;
        }
        else {
        	temBanheiro = false;
        }
        
        sc.nextLine();
        System.out.println("Digite a Descricao do quarto: ");
        descricao = sc.nextLine();
        
        Quarto quar = new Quarto (id, nomeQuarto, qtdeCamas, temBanheiro, descricao);
        
        quartos.add(quar);
        System.out.println("\nQuarto inserido com sucesso !");
    }

    public void alterarQuarto(Scanner sc) {
        int id, op;
        boolean encontrado = false;
        sc.nextLine();
        
        System.out.println("Digite o Id do quarto que voce deseja alterar: ");
        id = sc.nextInt();
        
        for (Quarto altQuarto : quartos) {
            if (altQuarto.getId() == (id)) {
            	sc.nextLine();
            	System.out.println("Digite o novo Nome do Quarto: ");
                String novoNomeQuarto = sc.nextLine();
                altQuarto.setNomeQuarto(novoNomeQuarto);
                  
                System.out.println("Digite a nova Quantidade de Camas do quarto: ");
                int novaQtdeCamas = sc.nextInt();
                altQuarto.setQtdeCamas(novaQtdeCamas);
                            
                System.out.println("O quarto tem Banheiro ? (1-SIM || 2-NAO): ");
                op = sc.nextInt();
                if (op == 1) {
                	altQuarto.setTemBanheiro(true);
                }
                else {
                	altQuarto.setTemBanheiro(false);
                }
                
                sc.nextLine();
                System.out.println("Digite a nova Descricao do quarto: ");
                String novaDescricao = sc.nextLine();
                altQuarto.setDescricao(novaDescricao);
                
                System.out.println("\nQuarto alterado com sucesso !");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar um Quarto com este numero de Id");
        }
    }
    
    public void excluirQuarto(Scanner sc) {
    	int id;
    	boolean encontrado = false;
    	
   	 	System.out.println("Digite o Id do quarto que voce deseja excluir: ");
   	 	id = sc.nextInt();

        for (int i = 0; i < quartos.size(); i++) {
            Quarto quar = quartos.get(i);
            
            if (quar.getId() == (id)) {
                quartos.remove(i); 
                System.out.println("Quarto removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
       	 System.out.println("Nao foi possivel localizar um Quarto com este numero de Id");
        }
   }

    public void listarQuartos() {
    	System.out.println("Quartos: \n");
    	System.out.println(quartos.toString());
    }
}
