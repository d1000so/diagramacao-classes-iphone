package src.main.java.estabelecimento;

import src.main.java.musica.Ipod;
import src.main.java.smartphone.Iphone;

public class loja {
    public static void main(String[] args) {
        Iphone myIPhone = new Iphone();

        myIPhone.ligar();
        myIPhone.atender();
        myIPhone.iniciarCorreioVoz();
        myIPhone.tocar();
        myIPhone.pausar();
        myIPhone.selecionarMusica();
        myIPhone.adicionarNovaAba();
        myIPhone.exibirPagina();
        myIPhone.atualizarPagina();

        Ipod myIpod = new Ipod();

        myIpod.tocar();
        myIpod.pausar();
        myIpod.selecionarMusica();

    }
}
