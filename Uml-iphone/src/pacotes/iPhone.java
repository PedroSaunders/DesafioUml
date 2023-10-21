package pacotes;
import pacotes.AparelhoTelefonico;
import pacotes.NavegadorInternet;
import pacotes.ReprodutorMusical;
public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    private String cor;
    private int modelo;
    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        
        meuiPhone.reprodutorMusical.tocar();
        meuiPhone.aparelhoTelefonico.ligar();
        meuiPhone.navegadorInternet.exibirPagina();
    }
}