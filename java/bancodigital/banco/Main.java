package banco;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente Danniel = new Cliente();
		Danniel.setNome("Danniel");
		
		Conta cc = new ContaCorrente(Danniel);
		Conta poupanca = new ContaPoupanca(Danniel);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}