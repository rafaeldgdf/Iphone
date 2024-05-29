classDiagram
    class ReprodutorMusical {
	- musisa: String 
        +tocar()
        +selecionarMusica(String musica)
	    +pausar()
    }

    class AparelhoTelefonico {
        - numero: String
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        - url: String
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
        - aparelhoTelefonico: AparelhoTelefonico
        - reprodutorMusical: ReprodutorMusical
        - navegadorInternet: NavegadorInternet
        +Iphone(aparelhoTelefonico: AparelhoTelefonico, reprodutorMusical: ReprodutorMusical, navegadorInternet: NavegadorInternet)
        +getAparelhoTelefonico(): AparelhoTelefonico
        +getReprodutorMusical(): ReprodutorMusical
        +getNavegadorInternet(): NavegadorInternet
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet