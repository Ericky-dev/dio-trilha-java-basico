package SomaNumeros;

import java.util.*;



public class SomaNumeros {
	
	private List<Integer>  numerosList;
	
	public SomaNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
	  
		numerosList.add(numero);
	}
	
	public int CalcularSoma() {
		
		int soma = 0;
	  for(int num : numerosList) {
		  soma += num;
	  }
		return soma;
	}
	
	
	public void encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE ;
		for(int num : numerosList) {
			if(num > maior) {
				maior = num;
				
			}
		}
		System.out.println("O número maior é " + maior);
	}
	
	
	public void encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE ;
		for(int num : numerosList) {
			if(num < menor) {
				menor = num;
				
			}
		}
		System.out.println("O número menor é " + menor);
	}
	
	
	
	
	public void exibirNumeros() {
		
		System.out.println("Números Adicionados na Lista ");
		
		for(int num: numerosList) {
			
			System.out.print(" ");
			System.out.print(num + " - ");
			
		}
		
		
	}

	
	public static void main(String[]args) {
		
		SomaNumeros numero = new SomaNumeros();
		
		Scanner ler = new Scanner(System.in);
		
		String entrada;
		
		while(true) {
		System.out.print("Digite o número para adicionar a lista, ou S para Sair : ");
			 
		 entrada = ler.next();
         
         if(entrada.equalsIgnoreCase("S")) // Se o usuário digitar "S" (maiúsculo ou minúsculo), encerra o loop
             break;
         
         try {
             int x = Integer.parseInt(entrada); // Tenta converter a entrada para inteiro
             numero.adicionarNumero(x);
         } catch(NumberFormatException e) {
             System.out.println("Entrada inválida. Digite um número inteiro ou 'S' para sair. \n");
             ler.nextLine(); // Limpar o buffer do scanner
         }
		 

		
		}
		System.out.println(" ");
		
		//numero.adicionarNumeros(x);
		numero.exibirNumeros();
		
		System.out.println(" ");
		
		System.out.println("Soma dos Números Adicionados na Lista: " + numero.CalcularSoma());
		
		numero.encontrarMaiorNumero();
		
		numero.encontrarMenorNumero();
		
		
	}
	
	
	
	
}
