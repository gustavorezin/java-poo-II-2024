package file.desafio;

public class Resposta {
	private int id;
	private String pergunta;
	private String resultado;

	public Resposta() {
		super();
	}

	public Resposta(int id, String pergunta, String resultado) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.resultado = resultado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return getId() + ", " + getPergunta() + ", " + getResultado();
	}

}
