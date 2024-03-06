package revisao.desafio_jogador;

public class Jogador {
	private String nome = "";
	private int numeroCamisa = 999;
	private int gols = -1;
	
	public Jogador() {
	}

	public Jogador(String nome, int numeroCamisa, int gols) {
		super();
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.gols = gols;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", numeroCamisa=" + numeroCamisa + ", gols=" + gols + "]";
	}
}
