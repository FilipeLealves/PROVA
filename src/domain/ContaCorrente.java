package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class ContaCorrente {
	public int id;
	public double limite;
	public double saldo;
	public double valorLimite;
	
	ArrayList<String> saques = new ArrayList<>();
	ArrayList<String> depositos = new ArrayList<>();
	
	
	Random gerador = new Random();
	
	public void sacar(double valor) {
		try {
			if(valor < 0) throw new Exception ("Valor negativo!");
			if(valor > limite) throw new Exception("Limite indisponível!");
			
			this.saldo -= valor;
			this.id = gerador.nextInt(9999, 100000 - 1);
			
			
			
			System.out.println("ID: " + "Valor do saque: " + valor);
		} catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void depositar(double valor) {
		try {
			if(valor < 0) throw new Exception ("Valor negativo!");
			this.saldo += valor;
			
			this.id = gerador.nextInt(9999, 100000 - 1);
			
		} catch(Exception e){
			System.out.println(e);{
			
			}
		}
	}
	
	public void setValorLimite(double valor) {
		try {
			if(valor < 0) throw new Exception ("Valor negativo!");
			this.valorLimite = valor;
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void cancelarSaque(int valor) {
		for(String saque : saques) {
			System.out.println(saque);
		}
	}
	
	public void cancelarDeposito() {
		
	}
	
	public int qtdTransacoes() {
		return 0;
	}
	
}
