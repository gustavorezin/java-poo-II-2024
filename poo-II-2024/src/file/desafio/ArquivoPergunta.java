package file.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArquivoPergunta {
	private List<Pergunta> perguntas = new ArrayList<>();

	public ArquivoPergunta() {
	}

	public ArquivoPergunta(List<Pergunta> perguntas) {
		super();
		this.perguntas = perguntas;
	}

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public void lerArquivoPergunta() {
		try {
			List<Pergunta> perguntas = new ArrayList<>();
			FileReader fr = new FileReader("./src/file/desafio/perguntas.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while ((linha = br.readLine()) != null) {
				String[] partes = linha.split(", ");
				String pergunta = partes[0];
				String resposta = partes[1];

				Pergunta novaPergunta = new Pergunta(pergunta, resposta);
				perguntas.add(novaPergunta);
			}
			setPerguntas(perguntas);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Pergunta> sortearPerguntas() {
		int tamanhoLista = getPerguntas().size();
		if (tamanhoLista > 0) {
			List<Pergunta> perguntasSorteadas = new ArrayList<>();

			Collections.shuffle(getPerguntas());

			for (int i = 0; i < 10; i++) {
				perguntasSorteadas.add(getPerguntas().get(i));
			}

			return perguntasSorteadas;
		} else {
			System.out.println("arquivo sem perguntas");
		}
		return null;
	}
}
