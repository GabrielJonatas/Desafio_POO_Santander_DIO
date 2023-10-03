package produto;

public class Iphone implements AparelhoTelefonico,NavegadorNaInternet,ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.print("Musica tocando");	
	}

	@Override
	public void pausar() {
		System.out.print("Musica pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.print("Selecionando música");
	}

	@Override
	public void exibirPagina() {
		System.out.print("Exibindo pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.print("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.print("Atualizando pagina");
	}

	@Override
	public void ligar() {
		System.out.print("Ligando para o telefone indicado");
	}

	@Override
	public void atender() {
		System.out.print("Atendendo telefone");
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.print("Iniciando correio de voz");
	}

}
