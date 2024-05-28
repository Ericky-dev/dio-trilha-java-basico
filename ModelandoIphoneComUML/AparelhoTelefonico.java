package ModelandoIphoneComUML;

public class AparelhoTelefonico implements Telefone,ReprodutorMusical,NavegadornaInternet {
	
	

	public void ligar() {
		
		System.out.println("Ligando");
		
	}
	
	@Override
	public void atender() {
		System.out.println("Atendendo Ligação");
		
	}

	@Override
	public void selecionarCorreiodevoz() {
		System.out.println("Selecionando Correio de Voz  \n");
		
	}
	
	
	
	@Override
	public void tocar() {
		System.out.println("Tocando Música");
		
	}

	@Override
	public void pausar() {
	     System.out.println("Pausando Música ");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Música \n");
		
	}
	
	
	

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página ");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba no Navegador na Internet");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página ");
		
	}



	
}
