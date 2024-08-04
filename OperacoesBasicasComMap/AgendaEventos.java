package OperacoesBasicasComMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
	
	private Map<LocalDate ,Evento>eventosMap;
	
	public AgendaEventos() {this.eventosMap = new HashMap<>();}
	
	public void adicionarEvento(LocalDate data , String nome , String atracao) {
		//Evento evento = new Evento(nome,atracao);
		eventosMap.put(data,new Evento(nome, atracao));
	}
	
	public void exibirAgenta() {
		Map<LocalDate , Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
//		Set<LocalDate> dataSet = eventosMap.keySet();
//		Collection<Evento> values = eventosMap.values();
		
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate , Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
	      if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)) {
	    	System.out.println(" O Próximo evento: " + entry.getValue() + " Acontecerá na data " + entry.getKey());
	    	break;
	      }
			
		}
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST,  15),"Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022,  7,  9),"Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.NOVEMBER,  10),"Evento 3", "Atração 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST,  04),"Evento 4", "Atração 4");
		
		agendaEventos.exibirAgenta();
		agendaEventos.obterProximoEvento();
		
	}

}
