package br.edu.faeterj;

import java.util.*;

public class QuartoMenu {
    private List<Quarto> quartos = new ArrayList<>();
    private Scanner sc;

    public void incluirQuarto(Quarto quarto) {
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

    public void AlterarQuarto(Quarto quarto) {
        int id, op;
        boolean encontrado = false;
        sc.nextLine();
        
        System.out.println("Digite o Id do quarto que voce deseja alterar: ");
        id = sc.nextInt();
        
        for (Quarto altQuarto : quartos) {
            if (altQuarto.getId() == (id)) {
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
                
                System.out.println("Digite a nova Descricao do quarto: ");
                String novaDescricao = sc.nextLine();
                altQuarto.setDescricao(novaDescricao);
                       
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar um Quarto com este numero de Id");
        }
    }
    
    public void excluirQuarto(Quarto quarto) {
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

    public void ListarQuartos() {
    	System.out.println("Quartos: \n");
    	System.out.println(quartos);
    }
}
