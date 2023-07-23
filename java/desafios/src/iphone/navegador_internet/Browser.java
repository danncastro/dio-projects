package iphone.navegador_internet;

public class Browser implements AdicionaNovasAbas, ExibePaginas, AtualizaPagina{

    @Override
    public void exibirPaginas() {
        System.out.println("PÁGINA SENDO EXIBIDA");
        System.out.println("");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Usuário solicitou atualização da página atual");
        System.out.println("ATUALIZANDO PÁGINA");
        System.out.println("");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Usuário solicitou abertura de nova aba");
        System.out.println("NOVA ABA ADICIONADA");
        System.out.println("");
    }
}
