package usuarios;

import iphone.aparelho.Iphone;

public class UsuarioFelipe {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        System.out.println("========= Ipod =========");
        String musica;
        musica = iphone.selecionarMusica("numb");
        System.out.println(musica);
        iphone.tocar();
        iphone.pausar();
        System.out.println("========================");

        System.out.println();

        System.out.println("======== Phone ========");
        String phoneNumber;
        phoneNumber = iphone.ligar("99999-9999");
        System.out.println(phoneNumber);
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("=======================");

        System.out.println();

        System.out.println("===== Internet =====");
        String url;
        url = iphone.exibirPagina("www.google.com");
        System.out.println(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("====================");

    }
}
