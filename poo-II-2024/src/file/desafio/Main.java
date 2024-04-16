package file.desafio;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ArquivoPergunta arquivoPergunta = new ArquivoPergunta();
		ArquivoResposta arquivoResposta = new ArquivoResposta();

		arquivoPergunta.lerArquivoPergunta();

		String menu = "1 - Rodada de perguntas | 2 - Score total | 3 - Sair";
		int op = 1;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: {
				arquivoResposta.rodadaDePerguntas(arquivoPergunta);
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

}
