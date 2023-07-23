package iphone.telefone;

public class Phone implements CorreioDeVoz, FazLigacoes, RecebeLigacoes {

    @Override
    public void receberLigacoes() {
        System.out.println("RECEBENDO LIGAÇÃO");
    }

    @Override
    public void fazerLigacoes() {
        System.out.println("DISCANDO");
    }

    @Override
    public void receberCorreiosDeVoz() {
        System.out.println("NOVO CORREIO DE VOZ RECEBIDO");
    }
}
