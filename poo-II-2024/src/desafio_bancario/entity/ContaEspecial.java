package desafio_bancario.entity;

import desafio_bancario.constants.TipoConta;

public class ContaEspecial extends Conta {
	private double limiteNegativo = 0;
	

	public ContaEspecial() {
		setTipo(TipoConta.ESPECIAL);
	}
	
	public ContaEspecial(int numero, double saldo, double limiteNegativo) {
		super(numero, saldo);
		setTipo(TipoConta.ESPECIAL);
		this.limiteNegativo = limiteNegativo;
	}

	public double getLimiteNegativo() {
		return limiteNegativo;
	}

	public void setLimiteNegativo(double limiteNegativo) {
		this.limiteNegativo = limiteNegativo;
	}

	@Override
	public void sacar(double valor) {
		if (getSaldo() + limiteNegativo >= valor) {
			setSaldo(getSaldo() - valor);
		}
	}
	
	
}
