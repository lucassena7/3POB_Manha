package br.edu.faeterj;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import java.util.*;

public class CamaMenu {
    private List<Cama> camas = new ArrayList<>();
    private Scanner sc;
    
    public void incluirCama(Cama cama) {
    	int id;
    	int codigoCama;
        boolean ehBeliche;
        int op;
        String posicao= "";
        String descricao= "";

        System.out.println("Digite o Id da Cama: ");
        id = sc.nextInt();
        
        System.out.println("Digite o Codigo da Cama: ");
        codigoCama = sc.nextInt();
        
        System.out.println("A cama eh beliche ? (1-SIM || 2-NAO): ");
        op = sc.nextInt();
        if (op == 1) {
        	ehBeliche = true;
        }
        else {
        	ehBeliche = false;
        }
        
        sc.nextLine();
        System.out.println("Digite a Posicao da cama: ");
        descricao = sc.nextLine();
        
        sc.nextLine();
        System.out.println("Digite a Descricao da cama: ");
        descricao = sc.nextLine();
        
        Cama kama = new Cama (id, codigoCama, ehBeliche, posicao, descricao);
        
        camas.add(kama);
        System.out.println("\nCama inserido com sucesso !");
    }
   
    public void AlterarCama(Cama cama) {
        int id, op;
        boolean encontrado = false;
        sc.nextLine();
        
        System.out.println("Digite o Id da cama que voce deseja alterar: ");
        id = sc.nextInt();
        
        for (Cama altCama : camas) {
            if (altCama.getId() == (id)) {
            	System.out.println("Digite o novo Codigo da Cama: ");
                int novoCodigoCama = sc.nextInt();
                altCama.setCodigoCama(novoCodigoCama);
                
                System.out.println("A cama eh Beliche? (1-SIM || 2-NAO): ");
                op = sc.nextInt();
                if (op == 1) {
                	altCama.setEhBeliche(true);
                }
                else {
                	altCama.setEhBeliche(false);
                }
                
                System.out.println("Digite a nova Posicao da cama: ");
                String novaPosicao = sc.nextLine();
                altCama.setPosicao(novaPosicao);
                
                System.out.println("Digite a nova Descricao da cama: ");
                String novaDescricao = sc.nextLine();
                altCama.setDescricao(novaDescricao);
                       
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar uma Cama com este numero de Id");
        }
    }

    public void excluirCama(Cama cama) {
    	int id;
    	boolean encontrado = false;
    	
   	 	System.out.println("Digite o Id da cama que voce deseja excluir: ");
   	 	id = sc.nextInt();

        for (int i = 0; i < camas.size(); i++) {
            Cama kama = camas.get(i);
            
            if (kama.getId() == (id)) {
                camas.remove(i); 
                System.out.println("Cama removida com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
       	 System.out.println("Nao foi possivel localizar uma Cama com este numero de Id");
        }
   }

    public void listarCamas() {
    	System.out.println("Camas: \n");
    	System.out.println(camas);
    }
}
