package iphone;

import iphone.navegador_internet.AdicionaNovasAbas;
import iphone.navegador_internet.AtualizaPagina;
import iphone.navegador_internet.Browser;
import iphone.navegador_internet.ExibePaginas;
import iphone.reprodutor_musical.Ipod;
import iphone.reprodutor_musical.PausaMusica;
import iphone.reprodutor_musical.SelecionaMusica;
import iphone.reprodutor_musical.TocaMusica;
import iphone.telefone.CorreioDeVoz;
import iphone.telefone.FazLigacoes;
import iphone.telefone.Phone;
import iphone.telefone.RecebeLigacoes;

public class Smartphone{
    public static void main(String[] args) {
        AdicionaNovasAbas addAbas = new Browser();
        AtualizaPagina attPagina = new Browser();
        ExibePaginas exibePaginas = new Browser();

        SelecionaMusica selecioneMusica = new Ipod();
        TocaMusica toqueMusica = new Ipod();
        PausaMusica pauseMusica = new Ipod();

        CorreioDeVoz correioDeVoz = new Phone();
        FazLigacoes fazLigacoes = new Phone();
        RecebeLigacoes recebeLigacoes = new Phone();

        addAbas.adicionarNovaAba();
        attPagina.atualizarPagina();
        exibePaginas.exibirPaginas();

        selecioneMusica.selecionarMusica();
        toqueMusica.tocarMusica();
        recebeLigacoes.receberLigacoes();
        pauseMusica.pausarMusica();

        correioDeVoz.receberCorreiosDeVoz();
        fazLigacoes.fazerLigacoes();
    }
}
