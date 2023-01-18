package br.com.studies;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.depositar(500000);
		System.out.println(conta.saldo);
		
	}
}
