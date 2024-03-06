package desafio_bancario.entity;

import desafio_bancario.constants.TipoConta;

public class Conta {
	protected int numero = 0;
	protected double saldo = 0;
	protected TipoConta tipo = TipoConta.CORRENTE;
	
	public Conta() {
	}

	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}

	public void transferir(Conta contaDestino, double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			contaDestino.saldo += valor;
		}
	}
}
