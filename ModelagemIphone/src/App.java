
import com.aparelhotelefonico.Telefone;
import com.navegadorinternet.Laptop;
import com.reprodutormusica.Ipod;
import com.smartphone.Iphone;

public class App {

    public static void main(String[] args) throws Exception {

        Ipod ipod = new Ipod();
        Telefone telefone = new Telefone();
        Laptop laptop = new Laptop();
        Iphone iphone = new Iphone();

        System.out.println("--- Iniciando Teste do Ipod ----\n");
        ipod.selecionarAlbum("The Dark Side of the Moon");
        ipod.selecionarMusica("Money");
        ipod.tocar();
        ipod.pausar();
        System.out.println("\n--- Fim do Teste do Ipod ----\n\n");
        System.out.println("--- Iniciando Teste do Telefone ----\n");
        telefone.ligar("+55 (00) 12345-6789");
        System.out.println("Seu telefone está tocando...");
        telefone.atender(false);
        System.out.println("Seu telefone está tocando novamente...");
        telefone.atender(true);
        telefone.enviaMensagemDeTexto("+55 (00) 12345-6789", "Olá, tudo bem?");
        telefone.iniciarCorreioVoz();
        System.out.println("\n--- Fim do Teste do Telefone ----\n\n");
        System.out.println("--- Iniciando Teste do Laptop ----\n");
        laptop.adicionarNovaAba();
        laptop.abrirPagina("www.google.com");
        laptop.atualizarPagina();
        laptop.fecharAba();
        System.out.println("\n--- Fim do Teste do Laptop ----\n\n");
        System.out.println("--- Iniciando Teste do Iphone ----\n");
        iphone.ligar("+55 (00) 12345-6789");
        System.out.println("Seu telefone está tocando...");
        iphone.atender(false);
        System.out.println("Seu telefone está tocando novamente...");
        iphone.atender(true);
        iphone.enviaMensagemDeTexto("+55 (00) 12345-6789", "Olá, tudo bem?");
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.abrirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.fecharAba();
        iphone.selecionarAlbum("American Idiot");
        iphone.selecionarMusica("Holiday");
        iphone.tocar();
        iphone.pausar();
        System.out.println("\n--- Fim do Teste do Iphone ----");
    }
}
