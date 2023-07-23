package iphone.reprodutor_musical;

public class Ipod implements PausaMusica, SelecionaMusica, TocaMusica {

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA");
    }

    @Override
    public void pausarMusica() {
        System.out.println("MÚSICA PAUSADA");
    }
}
