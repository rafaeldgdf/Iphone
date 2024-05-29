package projetoIphone;

public class AparelhoTelefonico {
	private String numero;
	
	public AparelhoTelefonico () {}

	public AparelhoTelefonico(String numero) {
		this.numero = numero;
	}
	
	public void ligar() {
		System.out.println("Ligando para: " + this.getNumero());
	}
	
	public void atender() {
		System.out.println("Atendendo ligação...");
	}
	
	
	public void iniciarCorreioVoz () {
		System.out.println("Iniciando correio de voz.");
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
