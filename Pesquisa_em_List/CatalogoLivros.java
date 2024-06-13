package Pesquisa_em_List;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class CatalogoLivros {
	
	private List<Livros> livrosList;
	
	public CatalogoLivros() {
	    this.livrosList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo,String autor, int anoDePublicacao) {
		Livros livro = new Livros(titulo,autor,anoDePublicacao);
		livrosList.add(livro);
		
	}
	
	public void exibirLivros() {
		for(Livros livro : livrosList) {
			System.out.println(livro);
		}
	}
	
	public void pesquisarPorAutor(String autor) {
		
		Scanner ler = new Scanner(System.in);
		
		boolean encontrado = false;
		
	 
		for(Livros livro: livrosList) {
			if(livro.getAutor().equalsIgnoreCase(autor)) {
				
			System.out.println("Livro do Autor: " + autor + "\n");
			encontrado = true;
			return;
			}
		}
		
		 if(!encontrado) {
	  System.out.println("Autor: " + autor + " Não Encontrado, Digite o nome do Autor Completo \n");
	  System.out.println("Digite a opção 1 novamente caso queira pesquisar o Livro pelo autor ");
		 }
	}
	
	
	public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		
		        List<Livros> livrosEncontrados = new ArrayList<>();
		        
		        if(!livrosList.isEmpty()) {

		        for (Livros livro : livrosList) {
		            if (livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
		                livrosEncontrados.add(livro);
		            }
		        }

		        return livrosEncontrados;
		    }else {
		    	throw new RuntimeException("A Lista está Vazia!");
		    }
		}
	
	public void pesquisarPorTitulo(String titulo) {
	      boolean encontrado = false;
	        
	        for (Livros livro : livrosList) {
	            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
	                System.out.println("Título: " + livro.getTitulo());
	                System.out.println("Autor: " + livro.getAutor());
	                System.out.println("Ano de Publicação: " + livro.getAnoDePublicacao());
	                encontrado = true;
	                break;
	            }
	        }
	        
	        if (!encontrado) {
	            System.out.println("Título: " + titulo + " não encontrado.");
	        }
	    }
	

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		
		
	    CatalogoLivros catalogoLivros = new CatalogoLivros();
	    
	
	    catalogoLivros.adicionarLivro("Dia de Glória","Ericky Gadelha Mendes", 2024);
	    catalogoLivros.adicionarLivro("Vencendo a Tribulação","João Ferreira", 1998);
	    catalogoLivros.adicionarLivro("Aventuras na Floresta","Maria Silva", 2010);
	    catalogoLivros.adicionarLivro("Quebrando Barreiras","Bruno Almeida", 1997);    
	    
	    
	    catalogoLivros.pesquisarPorIntervaloAnos(0, 0);
	    
	   
	    
	    System.out.println("Digite 1-Para Pesquisar por Autor \n");
	    System.out.println("Digite 2-Para Pesquisar por Ano de Publicação \n");
	    System.out.println("Digite 3-Para Pesquisar por Título \n");
	    System.out.println("Digite 4-Para Sair \n");
	    
	    while(true) {
	    
	      int x = 0;
	      
	      x = ler.nextInt();
	      ler.nextLine();
	      
	      switch(x) {
	       
	      case 1:{
	    	 
	    	  //Pesquisa po Autor;
	           String autor;
		       System.out.println("Digite o nome Completo do Autor do Livro ");
		       autor = ler.nextLine().trim();
		       
		       if (!autor.trim().isEmpty()) {
                   catalogoLivros.pesquisarPorAutor(autor);
               } else {
                   System.out.println("Nome do autor não pode estar vazio!");
               }
	    	    //catalogoLivros.pesquisarPorAutor(autor);
	    	    break;
	      
	      }
	      
	      case 2:{
	    	  String anoInicial,anoFinal;
				//Pesquisa por Intervalos de Ano;
	    	    //Integer anoFinal;
	    	    
	    	    System.out.print("Digite o Ano Inicial da Publicação:");
	    	    anoInicial = ler.next();
	    	    
	    	    System.out.print("Digite o Ano Final da Publicação:");
	    	    anoFinal = ler.next();
	    	    System.out.println();
	    	    
	    	    System.out.println("Livros Publicados Entre: " + anoInicial +  " - "  + anoFinal + "\n");
	    	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(Integer.parseInt(anoInicial), Integer.parseInt(anoFinal))+"\n");
	    	    
	    	    break;
	      }
	      
	      case 3:{
	    	  //Pesquisa por Título;
	    	    String titulo,autor = null; 
	    	    
	    	    System.out.println("Digite o Título do Livro ");
	    	    titulo = ler.nextLine();
	    	    catalogoLivros.pesquisarPorTitulo(titulo);;
	    	     break;
	      		}
	      
	      case 4:{
	    	  System.out.println("Encerrando o Sistema!!!");
	    	  return;
	      }
	      		
	          default:
	        	  System.out.println("Opção Inválida !!!!");
	      	}
           
        }
	
	 } 
}




