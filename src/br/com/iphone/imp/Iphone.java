package br.com.iphone.imp;

import br.com.iphone.interfac.AparelhoTelefonico;
import br.com.iphone.interfac.PlayerMusica;
import br.com.iphone.interfac.NavegadorInternet;

public class Iphone implements PlayerMusica, NavegadorInternet, AparelhoTelefonico {

	private static Iphone iphone;
	
	private Iphone() {
	}
	
	public static Iphone getIphone() {		
		if(iphone == null) 
			iphone = new Iphone();	
		return iphone;
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligado!");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Chamada!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz iniciado!");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir página da Web");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrir nova Aba!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página!");
	}

	@Override
	public void tocar() {
		System.out.println("Tocar musica!");
	}

	@Override
	public void pausa() {
		System.out.println("Pausar musica!");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar Musica!");
	}


}
