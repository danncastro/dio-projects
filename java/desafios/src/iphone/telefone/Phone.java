package iphone.telefone;

public class Phone implements CorreioDeVoz, FazLigacoes, RecebeLigacoes {

    @Override
    public void receberLigacoes() {
        System.out.println("RECEBENDO LIGAÇÃO");
    }

    @Override
    public void fazerLigacoes() {
        System.out.println("DISCANDO PARA O NÚMERO QUE LIGOU");
    }

    @Override
    public void receberCorreiosDeVoz() {
        System.out.println("NOVO CORREIO DE VOZ RECEBIDO");
    }
}
