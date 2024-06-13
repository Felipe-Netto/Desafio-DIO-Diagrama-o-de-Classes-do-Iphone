package iphone.aparelho;

import iphone.apps.AparelhoTelefonico;
import iphone.apps.NavegadorInternet;
import iphone.apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Pausando a música");
    }

    public String selecionarMusica(String musica){
        return "Música selecionada: " + musica;
    }

    public String ligar(String numero){
        return("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz(){
        System.err.println("Deixe seu recado...");
    }

    public String exibirPagina(String url){
        return "URL: " + url;
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
}
