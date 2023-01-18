package br.com.studies;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 7;
		
		conta.depositar(7);
		System.out.println(conta.saldo);
		
        boolean conseguiuRetirar = conta.saca(7);
        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);
		
        Conta conta2 = new Conta();
        
        conta2.depositar(1000);
        
        if(conta2.transferir(3000, conta)) {
        	System.out.println("Tranferencia realizada com sucesso");
        }else {
        	System.out.println("faltou dinheiro");
        }
        System.out.println(conta2.saldo);
        System.out.println(conta.saldo);
	}
}
