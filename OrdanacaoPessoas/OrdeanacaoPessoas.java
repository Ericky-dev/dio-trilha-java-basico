package OrdanacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdeanacaoPessoas {

	private List<Pessoa> pessoaList;

	public OrdeanacaoPessoas(List<Pessoa> pessoasList) {
		
		this.pessoaList = new ArrayList<>();
	}
	
	
	public void adicionarPessoas(String nome, int idade, double altura) {
	   pessoaList.add(new Pessoa(nome,idade,altura));
	}
	
	public List<Pessoa>OrdenarPorIdade(){
		 List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		 Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
		
	}
	
	public List<Pessoa>OrdenarPorAltura(){
		
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		
		if(!pessoaList.isEmpty()) {
			
		
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		
		return pessoasPorAltura;
	}else {
		throw new RuntimeException("A Lista Está Vazia");
	}
	
	}
	
	
	public static void main(String[] args) {
      OrdeanacaoPessoas ordenacaoPessoas = new OrdeanacaoPessoas(null);
      
      ordenacaoPessoas.adicionarPessoas("Alice", 20, 1.56);
      ordenacaoPessoas.adicionarPessoas("Bob", 30, 1.80);
      ordenacaoPessoas.adicionarPessoas("Charlie", 25, 1.70);
      ordenacaoPessoas.adicionarPessoas("David", 17, 1.56);

      // Exibindo a lista de pessoas adicionadas
      System.out.println("Lista das Pessoas Adicionadas \n");
      System.out.println(ordenacaoPessoas.pessoaList +"\n");
      
      
      System.out.println("Lista Ordenada Por Idade \n");
      // Ordenando e exibindo por idade
      System.out.println(ordenacaoPessoas.OrdenarPorIdade());
      
      
      System.out.println("Lista Ordenada Por Altura \n");
      // Ordenando e exibindo por altura
      System.out.println(ordenacaoPessoas.OrdenarPorAltura());
    }
      
	}

