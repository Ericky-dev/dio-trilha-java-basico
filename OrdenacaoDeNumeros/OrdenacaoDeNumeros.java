package OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros {
	
	
	//atributos;
	private List<Integer> numerosList;
	
	
	//construtor;
	public OrdenacaoDeNumeros()
	{
		this.numerosList = new ArrayList<>();
	}
	
	
	//Método Adicina Números;
	public void adicionarNumero(int numero) {
		  
		numerosList.add(numero);
	}
	
	//Método Ordarnar Ascendente;
	public List<Integer> OrdenarAscendente() {
	  List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
	  if(!numerosList.isEmpty()) {
		  Collections.sort(numerosAscendente);
		  return numerosAscendente;
	  }else {
		  throw new RuntimeException("A Lista Está Vazia!!!" );
	  }
		
	}
	
	
	//Método Ordenar Decrescente;
	public List<Integer> OrdernarDecrescente() {
	  List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
	  if(!numerosList.isEmpty()) {
		  numerosAscendente.sort(Collections.reverseOrder());
		  return numerosAscendente;
	  }else
		  throw new RuntimeException("A Lista Está Vazia!!!" );
	}
	

public void exibirNumeros() {
    if (!numerosList.isEmpty()) {
      System.out.println(this.numerosList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoDeNumeros numeros = new OrdenacaoDeNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    System.out.println("Números Adicionados a Lista: ");
    numeros.exibirNumeros();
    
    System.out.println();

    // Ordenando e exibindo em ordem ascendente
    System.out.println("Números em Ordem Crescente: " + numeros.OrdenarAscendente());
    
    System.out.println();

    // Exibindo a lista
    System.out.println("Números Adicionados a Lista ");
    numeros.exibirNumeros();
    
    System.out.println();

    // Ordenando e exibindo em ordem descendente
    System.out.println("Números em Ordem Decrescente: " + numeros.OrdernarDecrescente());

      }
	
	
}
