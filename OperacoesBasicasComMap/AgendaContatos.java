package OperacoesBasicasComMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	//atributos;
	
	private Map<String,Integer> agendaContatoMap;

	public AgendaContatos() {
		
		this.agendaContatoMap = new HashMap<>();
	}
	
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
		agendaContatoMap.remove(nome);
	}else {
		
			System.out.println("A Agenda Está Vazia \n");
		}
	}
	
	
	
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		System.out.println("Lista da Agenda de Contatos: \n");
		
		agendaContatos.adicionarContato("Ericky", 1234567812);
		agendaContatos.adicionarContato("Poliana", 234556787);
		agendaContatos.adicionarContato("Eishylla", 789456123);
		agendaContatos.adicionarContato("Ericky Santos", 45678913);
		
		agendaContatos.exibirContatos();
		
		
		
		System.out.println("==========================================");
		
		System.out.println("Adicionando Contato À Agenda: \n");
		
		agendaContatos.adicionarContato("Ericka",78946123);
		
		agendaContatos.exibirContatos();
		
		
		
		System.out.println("==========================================");
		
		System.out.println("Removendo Contato da Agenda: \n");
		
		agendaContatos.removerContato("Ericka");
		
		agendaContatos.exibirContatos();
		
		System.out.println("==========================================");
		
		
		System.out.println("Pesquisa Por Nome Mostrando o Número do Contato: \n");
		System.out.println(agendaContatos.pesquisarPorNome("Ericky"));
		
	    
		
		
	}
	
	
	
	
	
}
