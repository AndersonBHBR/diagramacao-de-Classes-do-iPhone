package Aparelho;

import Interfaces.ReprodutorMusical;
import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;

public class IPHone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	String modelo;
	
	public void Modelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void tocar() {
		System.out.println("Tocando a música!");	
	}

	public void pausar() {
		System.out.println("Pausando a música!");
	}

	public void selecionarMusica() {
		System.out.println("Selecionar a música");
	}

	public void exibirPagina() {
		System.out.println("Exibindo a página!");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba!");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando a página!");
	}

	public void ligar() {
		System.out.println("Ligando o telefone!");
	}

	public void atender() {
		System.out.println("Atender o telefone!");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de Voz!");
	}

}
