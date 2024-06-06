package OperacoesBasicas_List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa (String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefa i : tarefaList) {
			if(i.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(i);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotaldeTarejas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        ListaTarefa listaTarefa = new ListaTarefa();
        
        System.out.println("Número Total de elementos na lista é "
        		+ listaTarefa.obterNumeroTotaldeTarejas());
        
        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 02");
        System.out.println("Número Total de elementos na lista é "
        		+ listaTarefa.obterNumeroTotaldeTarejas());
        
        listaTarefa.removerTarefa("Tarefa 01");
        System.out.println("Número Total de elementos na lista é "
        		+ listaTarefa.obterNumeroTotaldeTarejas());
        
        listaTarefa.obterDescricoesTarefas();
	}
}
