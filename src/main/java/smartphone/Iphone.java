package src.main.java.smartphone;

import src.main.java.internet.NavegadorInternet;
import src.main.java.musica.ReprodutorMusical;
import src.main.java.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando página no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no iTunes");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iTunes");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no iTunes");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação telefônica");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação telefônica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz");
    }
}