package projetoIphone;

public class NavegadorInternet {
	private String url;
	
	public NavegadorInternet() {}

	public NavegadorInternet(String url) {
		this.url = url;
	}
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + this.getUrl());
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando...");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
