package file.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArquivoPergunta {
	private List<Pergunta> perguntas = new ArrayList<>();
	private String path;

	public ArquivoPergunta() {
	}

	public ArquivoPergunta(List<Pergunta> perguntas, String path) {
		super();
		this.perguntas = perguntas;
		this.path = path;
	}

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void lerArquivoPergunta() {
		try {
			List<Pergunta> perguntas = new ArrayList<>();
			FileReader fr = new FileReader(getPath());
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
		// "./src/file/desafio/perguntas.txt"
		int tamanhoLista = getPerguntas().size();
		if (tamanhoLista > 0) {
			List<Pergunta> perguntasSorteadas = new ArrayList<>();
			Random random = new Random();

			for (int i = 0; i < 10; i++) {
				int indiceSorteado = random.nextInt(tamanhoLista);
				perguntasSorteadas.add(getPerguntas().get(indiceSorteado));
			}

			return perguntasSorteadas;
		} else {
			System.out.println("arquivo sem perguntas");
		}
		return null;
	}
}
