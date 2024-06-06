package OperacoesBasicas_List;

public class Carrinho {
   
	private String nome;
	private Double preco;
	private int quantidade;
	
	
	public Carrinho(String nome, Double preco, int quantidade) {
	
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	private int Itens() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Carrinho [nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + "]";
	}
	
	
	

	
}
