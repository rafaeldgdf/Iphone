package projetoIphone;

public class ReprodutorMusical {
	private String musica;
	
	public ReprodutorMusical () {}

	public ReprodutorMusical(String musica) {
		this.musica = musica;
		
	}

	public void tocar() {
		System.out.println("Tocando música...");
	}
	
	public void selecionarMusica() {
		System.out.println("Música selecionada: " + this.getMusica());
	}
	
	public void pausar() {
		System.out.println("Pause.");
	}
	
	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	
	
	

}
