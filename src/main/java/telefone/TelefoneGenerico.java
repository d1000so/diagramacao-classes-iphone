package src.main.java.telefone;

public class TelefoneGenerico implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Realizando chamada");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
