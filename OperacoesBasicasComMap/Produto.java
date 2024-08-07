package OperacoesBasicasComMap;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	
	public Produto(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", quantidade = " + quantidade + ", preco = " + preco + "]";
	}
	
	
	
	

}
