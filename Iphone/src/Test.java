package projetoIphone;

public class Test {
    public static void main(String[] args) {
      
        Iphone iphone = new Iphone(
            new AparelhoTelefonico("(12) 3456-7890"), 
            new ReprodutorMusical("Arctic Monkeys - I wanna be yours"), 
            new NavegadorInternet("https://www.google.com")
        );

        
        iphone.getAparelhoTelefonico().ligar();
        iphone.getAparelhoTelefonico().atender();
        iphone.getAparelhoTelefonico().iniciarCorreioVoz();
        
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().selecionarMusica();
        iphone.getReprodutorMusical().pausar();
        
        iphone.getNavegadorInternet().exibirPagina("https://www.example.com");
        iphone.getNavegadorInternet().adicionarNovaAba();
        iphone.getNavegadorInternet().atualizarPagina();
    }
}
