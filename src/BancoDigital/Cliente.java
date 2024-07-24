package BancoDigital;

import java.util.Random;

public class Cliente {

	private String nome;
	private int senha;
	private int numConta;

	

	public Cliente() {
		Random random = new Random();
        int number = random.nextInt(50000);
		this.numConta = number;
	}

	public String getNome() {
		return nome;
	}

	public int getSenha() {
		return senha;
	}

	public double getNumConta() {
		return numConta;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente: [Nome = " + nome + ", senha=" + senha + ", numConta=" + numConta + "]";
	}



	

	




	

}