package br.edu.faeterj;

public class itemCarrinho {
	private int idProduto;
    private int quantidade;
    
	public itemCarrinho(int idProduto, int quantidade) {
		this.idProduto = idProduto;
		this.quantidade = quantidade;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
    
    
}
