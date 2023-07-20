import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner contabanco = new Scanner(System.in);

        int conta;
        String agencia,nomeCliente;
        Double saldo=237.48;

        System.out.println("Digite o número de sua Conta: ");
        conta=contabanco.nextInt();

        System.out.println("Digite o número da Agência: ");
        agencia=contabanco.next();

        System.out.println("Digite seu nome: ");
        nomeCliente=contabanco.next().concat(" ").concat(contabanco.next());

        System.out.println("Olá Sr(a) " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência: [" + agencia + "] conta: [" + conta + "] saldo: R$[" + saldo + "] já está disponível para saque");
    }
}