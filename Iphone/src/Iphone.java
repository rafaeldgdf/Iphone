package projetoIphone;

public class Iphone {
	
	private AparelhoTelefonico aparelhoTelefonico;
	private ReprodutorMusical reprodutorMusical;
	private NavegadorInternet navegadorInternet;
	
	
	public Iphone () {}

	public Iphone(AparelhoTelefonico aparelhoTelefonico, ReprodutorMusical reprodutorMusical,
			NavegadorInternet navegadorInternet) {
		this.aparelhoTelefonico = aparelhoTelefonico;
		this.reprodutorMusical = reprodutorMusical;
		this.navegadorInternet = navegadorInternet;
	}

	public AparelhoTelefonico getAparelhoTelefonico() {
		return aparelhoTelefonico;
	}

	public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
		this.aparelhoTelefonico = aparelhoTelefonico;
	}

	public ReprodutorMusical getReprodutorMusical() {
		return reprodutorMusical;
	}

	public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
		this.reprodutorMusical = reprodutorMusical;
	}

	public NavegadorInternet getNavegadorInternet() {
		return navegadorInternet;
	}

	public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
		this.navegadorInternet = navegadorInternet;
	}
	
	
}

   
