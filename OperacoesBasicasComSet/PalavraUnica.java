package OperacoesBasicasComSet;

import java.util.HashSet;

import java.util.Set;


public class PalavraUnica {
	
	private Set <String> palavraSet;

	public PalavraUnica() {
		
		this.palavraSet = new HashSet<>();
	}
	
	
	public void adicionarPalavra(String palavra) {
		palavraSet.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		PalavraUnica palavraParaRemover = null;
		if(!palavraSet.isEmpty()) {
				if(palavraSet.contains(palavra)) {
					palavraSet.remove(palavra);
			}else {
				System.out.println("Palavra não Existe no Conjunto");
			}
		}else {
				System.out.println("O Conjunto está Vazio");
			}
		}
	
	public boolean verificarPalavra(String palavra) {
	    return palavraSet.contains(palavra);
	  }

	  public void exibirPalavrasUnicas() {
	    if(!palavraSet.isEmpty()) {
	      System.out.println(palavraSet);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }

	  public static void main(String[] args) {
	    // Criando uma instância da classe ConjuntoPalavrasUnicas
	    
		  PalavraUnica conjuntoLinguagens = new PalavraUnica();

	    // Adicionando linguagens únicas ao conjunto
	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    // Exibindo as linguagens únicas no conjunto
	    System.out.println("Conjunto das Palavras : ");
	    conjuntoLinguagens.exibirPalavrasUnicas();
	    
	    System.out.println();
	    
	    System.out.println("Removendo palavra  no Conjunto");
	    // Removendo uma linguagem do conjunto
	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();
	    
	    System.out.println();

	    // Removendo uma linguagem inexistente
	    System.out.println("Removendo uma Palavra (Swift)  Inexistente ");
	    conjuntoLinguagens.removerPalavra("Swift");
	    
	    System.out.println();

	    // Verificando se uma linguagem está no conjunto
	    System.out.println("Verificando se uma palavra está no conjunto: ");
	    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
	    System.out.println("Verificando se uma linguagem está no conjunto. A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
	    
	    System.out.println();

	    // Exibindo as linguagens únicas atualizadas no conjunto
	    System.out.println("Exibindo as linguagens únicas atualizadas no conjunto");
	    conjuntoLinguagens.exibirPalavrasUnicas();
	  }
	
	
	
	
	
	
	

}
