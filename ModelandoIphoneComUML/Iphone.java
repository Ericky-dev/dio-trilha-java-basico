package ModelandoIphoneComUML;

public class Iphone {
	public static void main(String[] args) {
		
		AparelhoTelefonico at = new AparelhoTelefonico();
			
		
	    at.ligar();
	    at.atender();
	    at.selecionarCorreiodevoz();
	    
		
		at.tocar();
		at.pausar();
		at.selecionarMusica();
		
		at.exibirPagina();
		at.adicionarNovaAba();
		at.atualizarPagina();
	}

}
