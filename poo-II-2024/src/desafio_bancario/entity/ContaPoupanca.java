package desafio_bancario.entity;

import desafio_bancario.constants.TipoConta;

public class ContaPoupanca extends Conta {
	private static int limiteOperacoesSaque = 5;

	public ContaPoupanca() {
		setTipo(TipoConta.POUPANCA);
	}

	public ContaPoupanca(int numero, double saldo) {
		super(numero, saldo);
		setTipo(TipoConta.POUPANCA);
	}
	
	public int getLimiteOperacoesSaque() {
		return limiteOperacoesSaque;
	}

	@Override
	public void sacar(double valor) {
		if (getSaldo() >= valor && limiteOperacoesSaque > 0) {
			setSaldo(getSaldo() - valor);
			limiteOperacoesSaque--;
		}
	}
}
