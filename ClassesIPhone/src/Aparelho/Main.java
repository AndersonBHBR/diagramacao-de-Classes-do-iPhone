package Aparelho;

public class Main {
	public static void main(String[] args) {
		
		IPHone IPhone10 = new IPHone();
		
		IPhone10.selecionarMusica();
		IPhone10.tocar();
		IPhone10.pausar();
		
		IPhone10.iniciarCorreioVoz();
		
		IPhone10.adicionarNovaAba();
		IPhone10.exibirPagina();
		IPhone10.atualizarPagina();
		
		IPhone10.ligar();
		IPhone10.atender();
	}
}
