package file.desafio;

public class Pergunta {
	private String pergunta;
	private boolean resposta;

	public Pergunta() {
		super();
	}

	public Pergunta(String pergunta, String resposta) {
		this.pergunta = pergunta;
		this.resposta = resposta.equalsIgnoreCase("Verdadeiro");
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public boolean isResposta() {
		return resposta;
	}

	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}

	public String conferirResposta(int resposta) {
		boolean respostaEscolhida = resposta == 0 ? true : false;
		return isResposta() == respostaEscolhida ? "acerto" : "erro";
	}

}
