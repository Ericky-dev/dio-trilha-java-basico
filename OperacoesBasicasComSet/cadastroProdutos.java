package OperacoesBasicasComSet;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;


public class cadastroProdutos {

	//atributo;
	private Set<Produto> produtoSet;

	public cadastroProdutos() {
		
		this.produtoSet = new HashSet<>();
		
	}
	
	public void adicionarProduto(String nome,long cod, int quantidade ,double preco) {
		
		produtoSet.add(new Produto(nome,cod,quantidade,preco));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		
		Set<Produto>produtoPorNome = new TreeSet<>(produtoSet);
		
		if(produtoSet.isEmpty()) {
			System.out.println("Lista de Produtos Vazia!!! ");
		}
		return produtoPorNome;	
	}
	
	public Set<Produto>exibirProdutosPorPreco() {
		
		Set<Produto>ProdutoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		
		ProdutoPorPreco.addAll(produtoSet);
		
		return ProdutoPorPreco;
	}
	
	public static void main(String[] args) {
		cadastroProdutos cadastroProdutos = new cadastroProdutos();
		
		
		System.out.println("Produtos Na Lista: \n");
		
		cadastroProdutos.adicionarProduto("Sabão", 01, 3, 7.50);
		cadastroProdutos.adicionarProduto("Biscoito", 02, 30, 1.15);
		cadastroProdutos.adicionarProduto("Feijão", 03, 10, 8.05);
		cadastroProdutos.adicionarProduto("Açúcar", 04, 20, 4.19);
		
		System.out.println(cadastroProdutos.produtoSet);
		System.out.println("=====================================");
		
		System.out.println("Produto Adicionado À Lista: \n");
		cadastroProdutos.adicionarProduto("Shampoo", 05, 35, 19.99);
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println("======================================");
		
		System.out.println("Produtos Listados Por Nome: \n");
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println("======================================");
		System.out.println("Produtos Listados Por Preço: \n");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}
		
		
}
	
