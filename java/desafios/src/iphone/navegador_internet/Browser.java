package iphone.navegador_internet;

public class Browser implements AdicionaNovasAbas, ExibePaginas, AtualizaPagina{

    @Override
    public void exibirPaginas() {
        System.out.println("PÁGINA SENDO EXIBIDA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }
}
