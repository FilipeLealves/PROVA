package domain;

public class Programm {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.setValorLimite(1000);
		conta.depositar(600);
		conta.sacar(250);
		conta.sacar(100);
		conta.depositar(200);
		conta.depositar(1040);
		conta.qtdTransacoes();
		
		//conta.cancelarSaque();
	}

}
