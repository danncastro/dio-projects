package iphone.reprodutor_musical;

public class Ipod implements PausaMusica, SelecionaMusica, TocaMusica {

    @Override
    public void tocarMusica() {
        System.out.println("Música selecionada será tocada");
        System.out.println("TOCANDO MÚSICA");
        System.out.println("");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Usuário selecionou música");
        System.out.println("MÚSICA SELECIONADA");
        System.out.println("");
    }

    @Override
    public void pausarMusica() {
        System.out.println("MÚSICA PAUSADA");
        System.out.println("");
    }
}
