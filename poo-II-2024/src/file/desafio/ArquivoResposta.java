package file.desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ArquivoResposta {
	private List<Resposta> respostas = new ArrayList<>();

	public ArquivoResposta() {
	}

	public ArquivoResposta(List<Resposta> respostas) {
		super();
		this.respostas = respostas;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public void escreverArquivoResposta() {
		try {
			FileWriter fw = new FileWriter("./src/file/desafio/respostas.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			int quantidadeAcertos = 0;
			int numeroLinha = 1;
			for (Resposta resposta : getRespostas()) {
				bw.append(numeroLinha + ", " + resposta + "\n");
				if (resposta.getResultado().equals("acerto")) {
					quantidadeAcertos++;
				}
				numeroLinha++;
			}
			bw.append("\nAcertos: " + quantidadeAcertos);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lerArquivoResposta() {
		try {
			FileReader fr = new FileReader("./src/file/desafio/respostas.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = "";

			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rodadaDePerguntas(ArquivoPergunta arquivoPergunta) {
		/*
		 * List<Pergunta> perguntasSorteadas = arquivoPergunta.sortearPerguntas();
		 * List<Resposta> respostas = new ArrayList<>(); for (Pergunta pergunta :
		 * perguntasSorteadas) { Object[] opcoes = { "Verdadeiro", "Falso" }; int
		 * escolha = JOptionPane.showOptionDialog(null, pergunta.getTitulo(),
		 * "Verdadeiro ou falso", JOptionPane.YES_NO_OPTION,
		 * JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]); String resultado =
		 * pergunta.conferirResposta(escolha); Resposta resposta = new
		 * Resposta(pergunta, resultado); respostas.add(resposta); }
		 * setRespostas(respostas); escreverArquivoResposta();
		 */
	}
}
