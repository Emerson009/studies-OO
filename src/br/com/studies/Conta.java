package br.com.studies;

import java.util.Scanner;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	Scanner scanner = new Scanner(System.in);
	
	public void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
    }
    
    public boolean transferir(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saldo -=  valor;
    		destino.depositar(valor);
    		return true;
    	}else {
    		return false;
    	}
    	
    }

}
