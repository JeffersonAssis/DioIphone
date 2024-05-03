package br.com.iphone;

import br.com.iphone.imp.Iphone;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Iphone iphone = Iphone.getIphone();
		
		iphone.adicionarNovaAba();
		
		iphone.atender();
		
		iphone.atualizarPagina();
		
		iphone.exibirPagina();
		
		iphone.iniciarCorreioVoz();
		
		iphone.ligar();
		
		iphone.pausa();
		
		iphone.selecionarMusica();
		
		iphone.tocar();
	}
}
