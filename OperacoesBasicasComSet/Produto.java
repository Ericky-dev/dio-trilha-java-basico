package OperacoesBasicasComSet;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private long cod;
	private int quantidade;
	private double preco;
	
	
	public Produto(String nome, long cod, int quantidade, double preco) {
		
		this.nome = nome;
		this.cod = cod;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
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
	public int hashCode() {
		return Objects.hash(cod);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
			
		if (obj == null)return false;
			
		if (getClass() != obj.getClass())return false;
			
		Produto other = (Produto) obj;
		return cod == other.cod;
	}


	@Override
	public String toString() {
		return "Produto [" + nome + 
				", cod = " + cod + 
				", quantidade = " + quantidade + 
				", preco = " + preco + "] \n";
	}
	
}	
	class ComparatorPorPreco implements Comparator<Produto>{

		@Override
		public int compare(Produto p1, Produto p2) {
			// TODO Auto-generated method stub
			return Double.compare(p1.getPreco(), p2.getPreco()) ;
		}
		
	}


