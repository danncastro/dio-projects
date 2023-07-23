package iphone.smartphone;

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
        AtualizaPagina addPagina = new Browser();
        ExibePaginas exibePaginas = new Browser();

        PausaMusica pauseMusica = new Ipod();
        SelecionaMusica selecioneMusica = new Ipod();
        TocaMusica toqueMusica = new Ipod();

        CorreioDeVoz correioDeVoz = new Phone();
        FazLigacoes fazLigacoes = new Phone();
        RecebeLigacoes recebeLigacoes = new Phone();

        addAbas.adicionarNovaAba();
        addPagina.atualizarPagina();
        exibePaginas.exibirPaginas();

        pauseMusica.pausarMusica();
        selecioneMusica.selecionarMusica();
        toqueMusica.tocarMusica();

        correioDeVoz.receberCorreiosDeVoz();
        fazLigacoes.fazerLigacoes();
        recebeLigacoes.receberLigacoes();
    }
}
