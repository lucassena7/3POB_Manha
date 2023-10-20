package br.edu.faeterj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
	private ArrayList<ItemCarrinho> itens = new ArrayList<>();
    private double valorTotal = 0.0;
    private Scanner sc;
    
	public Carrinho(Scanner sc) {
		this.sc = sc;
	}
	
	public void Processamento() {
	    List<Produto> listaProdutos = new ArrayList<>();
	    Carrinho carrinho = new Carrinho(sc);
	    
	    //Adicionando os produtos de venda
	    listaProdutos.add(new Produto(1, "Banana", 2.5));
        listaProdutos.add(new Produto(2, "Maca", 1.75));
        listaProdutos.add(new Produto(3, "Pera", 3.0));
        listaProdutos.add(new Produto(4, "Uva", 5.0));
        listaProdutos.add(new Produto(5, "Salada de Frutas", 8.0));
        
        boolean continuarComprando = true;
        
        System.out.println("Bem vindo ao Hortifruti !! Abaixo voce ira ver os produtos disponiveis: \n");
        
        while (continuarComprando) {
            for (Produto produto : listaProdutos) {
                System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preco: " + produto.getPreco());
            }
            System.out.print("Escolha o produto que deseja comprar colocando seu numero de ID: \n");
            int idProduto = sc.nextInt();
            
            System.out.print("Digite a quantidade desejada: \n");
            int quantidade = sc.nextInt();
            
            carrinho.adicionarItem(idProduto, quantidade, listaProdutos);
            
            System.out.print("Deseja adicionar mais produtos ao carrinho? (1- SIM  / 2- NAO): \n");
            int resposta = sc.nextInt();
          
            if (resposta == 2) {
                 	continuarComprando = false;
            }
        }
           carrinho.ListarItensCarrinho(listaProdutos);
	}
	
    public ArrayList<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemCarrinho> itens) {
		this.itens = itens;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void adicionarItem(int idProduto, int quantidade, List<Produto> listaProdutos) {
		for (Produto produto : listaProdutos) {
            if (produto.getId() == idProduto) {
            	ItemCarrinho item = new ItemCarrinho(idProduto, quantidade);
            	itens.add(item);
                valorTotal += produto.getPreco() * quantidade;
            }
		}  
    }
	
	public void ListarItensCarrinho(List<Produto> listaProdutos) {
		System.out.println("\nProdutos no carrinho:");
        for (ItemCarrinho item : itens) {
            int idProduto = item.getIdProduto();
            int quantidade = item.getQuantidade();
            for (Produto produto : listaProdutos) {
                if (produto.getId() == idProduto) {
                    System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + quantidade + ", Valor Unitario: " + produto.getPreco() + ", Valor Total de " + produto.getNome() + ": " +  produto.getPreco() * quantidade);
                }
            }
        }
        System.out.println("\nValor total do carrinho: " + valorTotal + "\n");
    }
}
