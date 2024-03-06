package desafio_bancario.entity;

import desafio_bancario.constants.TipoConta;

public class ContaPoupanca extends Conta {
	private static int limiteOperacoesSaque = 5;

	public ContaPoupanca() {
		this.tipo = TipoConta.POUPANCA;
	}

	public ContaPoupanca(int numero, double saldo) {
		super(numero, saldo);
		this.tipo = TipoConta.POUPANCA;
	}
	
	public int getLimiteOperacoesSaque() {
		return limiteOperacoesSaque;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor && limiteOperacoesSaque > 0) {
			saldo -= valor;
			limiteOperacoesSaque--;
		}
	}
}
