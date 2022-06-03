package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ContaCorrente {
	public int id;
	public double limite;
	public double saldo;
	public double valorLimite;
	
	ArrayList<Double> saques = new ArrayList<>();
	ArrayList<Double> depositos = new ArrayList<>();
	
	Random gerador = new Random();
	
	public void sacar(double valor) {
		try {
			if(valor < 0) throw new Exception ("Valor negativo!");
			
			this.saldo -= valor;
			
			
			this.id = gerador.nextInt(9999, 100000 - 1);

			saques.add(valor);
			
			System.out.println("Valor do saque: " + valor);
		} catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void depositar(double valor) {
		try {
			this.saldo += valor;
			
			this.id = gerador.nextInt(9999, 100000 - 1);
			depositos.add(this.id, valor);
			
		} catch(Exception e){
			System.out.println(e);{
			
			}
		}
	}
	
	public void setValorLimite(double valor) {
		this.valorLimite = valor;
	}
	
	public void cancelarSaque(int valor) {
		for(Double saque : saques) {
			System.out.println(saque);
		}
	}
	
	public void cancelarDeposito() {
		
	}
	
	public int qtdTransacoes() {
		return 0;
	}
	
}
