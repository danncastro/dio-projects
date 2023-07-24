package banco;

public class Cliente {

	private String nome;
	private int numeroAleatorioDeConta;

	public int getNumeroAleatorioDeConta() {
		return numeroAleatorioDeConta;
	}

	public void setNumeroAleatorioDeConta(int numeroAleatorioDeConta) {
		this.numeroAleatorioDeConta = numeroAleatorioDeConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}