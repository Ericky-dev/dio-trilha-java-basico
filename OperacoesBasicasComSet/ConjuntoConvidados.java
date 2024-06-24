package OperacoesBasicasComSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado>convidadoSet;

	public ConjuntoConvidados() {
		
		this.convidadoSet = new HashSet<>();
		
		
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		
		convidadoSet.add(new Convidado(nome,codigoConvite));
		
	}
	
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		
		Convidado convidadoParaRemover = null;
		if(!convidadoSet.isEmpty()) {
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() ==  codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
		
		}else {
		
			throw new RuntimeException("Não Existe Convidado Para Remover");
		}
		
	}
		
	public   int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void  exibirConvidados() {
		for(Convidado c: convidadoSet) {
			
		}
		System.out.println("Lista de Convidados: \n" + convidadoSet);
	}
	
	public static void main(String[] args) {
		 ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		//System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) No Set de Convidados ");
		
		conjuntoConvidados.adicionarConvidado("Ericky Gadelha",1205);
		conjuntoConvidados.adicionarConvidado("Poliana Santos",1983);
		conjuntoConvidados.adicionarConvidado("Ericky Gadelha Santos",1205);
		conjuntoConvidados.adicionarConvidado("Eishylla Cristhynny ",2007);
		
		System.out.println();
		
		//conjuntoConvidados.contarConvidados();
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) No Set de Convidados ");
		
		System.out.println();
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.println();
		
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(2007);
		
		conjuntoConvidados.exibirConvidados();
		
		
		
		
	}	
}

