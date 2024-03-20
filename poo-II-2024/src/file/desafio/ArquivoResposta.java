package file.desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ArquivoResposta {
	private List<Resposta> respostas = new ArrayList<>();
	private String path;

	public ArquivoResposta() {
	}

	public ArquivoResposta(List<Resposta> respostas, String path) {
		super();
		this.respostas = respostas;
		this.path = path;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void escreverArquivoResposta() {
		try {
			FileWriter fw = new FileWriter("./src/file/desafio/respostas.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			int quantidadeAcertos = 0;
			for (Resposta resposta : getRespostas()) {
				bw.append(resposta + "\n");
				if (resposta.getResultado().equals("acerto")) {
					quantidadeAcertos++;
				}
			}
			bw.append("\nAcertos: " + quantidadeAcertos);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lerArquivoResposta() {
		try {
			// "./src/file/desafio/respostas.txt"
			FileReader fr = new FileReader(getPath());
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
}
