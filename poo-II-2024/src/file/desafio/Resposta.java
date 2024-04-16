package file.desafio;

public class Resposta {
	private Pergunta pergunta;
	private String resultado;

	public Resposta() {
		super();
	}

	public Resposta(Pergunta pergunta, String resultado) {
		super();
		this.pergunta = pergunta;
		this.resultado = resultado;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
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
		return getPergunta().getTitulo() + ", " + getResultado();
	}

	public String conferirResposta(int resposta) {
		boolean respostaEscolhida = resposta == 0 ? true : false;
		return getPergunta().isRespostaCorreta() == respostaEscolhida ? "acerto" : "erro";
	}

}
