package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class ContaCorrente {
	private int id;
	private double limite;
	private double saldo;
	private double valorLimite;
	private int qtdSaques;
	private int qtdDepositos;
	
	
	Random gerador = new Random();
	
	public void sacar(double valor) {
		try {
			if(valor < 0) throw new Exception ("Valor negativo!");
			if(valor > valorLimite) throw new Exception("Limite indisponível!");
			
			this.saldo -= valor;
			this.id = gerador.nextInt(9999, 100000 - 1);

			this.qtdSaques += 1;
			
			System.out.println("ID: "+this.id + " | Valor do saque: " + valor);
		} catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void depositar(double valor) {
		try {
			if(valor < 0) throw new Exception ("Valor negativo!");
			this.saldo += valor;
			
			this.id = gerador.nextInt(9999, 100000 - 1);
			
			this.qtdDepositos += 1;
			
			System.out.println("ID: "+this.id + " | Valor do deposito: " + valor);
			
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

	}
	
	public void cancelarDeposito() {
		
	}
	
	public void qtdTransacoes() {
		System.out.println("Quantidade de Saques: " + qtdSaques);
		System.out.println("Quantidade de Depositos: " + qtdDepositos);
	}
	
}
