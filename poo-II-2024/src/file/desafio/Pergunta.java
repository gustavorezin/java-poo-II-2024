package file.desafio;

public class Pergunta {
	private String titulo;
	private boolean respostaCorreta;

	public Pergunta() {
		super();
	}

	public Pergunta(String titulo, String resposta) {
		this.titulo = titulo;
		this.respostaCorreta = resposta.equalsIgnoreCase("Verdadeiro");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(boolean respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}
}
