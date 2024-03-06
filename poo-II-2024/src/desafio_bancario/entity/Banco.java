package desafio_bancario.entity;

import java.util.ArrayList;
import java.util.List;


public class Banco {
	private List<Conta> contas = new ArrayList<>();

	public Banco() {
	}

	public Banco(List<Conta> contas) {
		super();
		this.contas = contas;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return "Banco [contas=" + contas.size() + "]";
	}
	
	public String getListaContas() {
		String listaContas = "";
		for (Conta conta : contas) {
			listaContas += conta + "\n";
		}
		return listaContas;
	}
}
