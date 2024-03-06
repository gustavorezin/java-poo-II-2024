package desafio_bancario.constants;

public enum TipoConta {
	CORRENTE("CORRENTE"), ESPECIAL("ESPECIAL"), POUPANCA("POUPANCA");
	
	private String tipoConta;
	
	private TipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
}
