package file.desafio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ArquivoPergunta arquivoPergunta = new ArquivoPergunta(null, "./src/file/desafio/perguntas.txt");
		arquivoPergunta.lerArquivoPergunta();
		ArquivoResposta arquivoResposta = new ArquivoResposta(null, "./src/file/desafio/respostas.txt");

		String menu = "1 - Rodada de perguntas | 2 - Score total | 3 - Sair";
		int op = 1;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: {
				rodadaDePerguntas(arquivoPergunta, arquivoResposta);
				break;
			}
			case 2: {
				arquivoResposta.lerArquivoResposta();
				break;
			}
			case 3:
				System.out.println("saindo...");
				break;
			default:
				System.out.println("opção inválida.");
			}
		} while (op != 3);
	}

	private static void rodadaDePerguntas(ArquivoPergunta arquivoPergunta, ArquivoResposta arquivoResposta) {
		List<Pergunta> perguntasSorteadas = arquivoPergunta.sortearPerguntas();
		List<Resposta> respostas = new ArrayList<>();
		int idResposta = 1;
		for (Pergunta pergunta : perguntasSorteadas) {
			Object[] opcoes = { "Verdadeiro", "Falso" };
			int escolha = JOptionPane.showOptionDialog(null, pergunta.getPergunta(), "Verdadeiro ou falso",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			String resultado = pergunta.conferirResposta(escolha);
			Resposta resposta = new Resposta(idResposta++, pergunta.getPergunta(), resultado);
			respostas.add(resposta);
		}
		arquivoResposta.setRespostas(respostas);
		arquivoResposta.escreverArquivoResposta();
	}

}
