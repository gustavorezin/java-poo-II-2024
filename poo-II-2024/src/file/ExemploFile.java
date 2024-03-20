package file;

import java.io.File;

import javax.swing.JOptionPane;

public class ExemploFile {
	public static void main(String[] args) {
		String menu = "1 - Listar | 2 - Apagar todos | 3 - Sair";
		int op = 1;
		File[] arquivos = null;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) {
				String path = JOptionPane.showInputDialog("Path: ");
				File diretorio = new File(path);
				if(diretorio.isDirectory()) {
					arquivos = diretorio.listFiles();
					for (File arquivo : arquivos) {
						System.out.println(arquivo.getName() + ": " + (arquivo.length()/1024) + "KB");
					}
				} else {
					System.out.println("caminho inválido");
				}
			} else if (op == 2) {
				for (File arquivo : arquivos) {
					arquivo.delete();
				}
			}
		} while (op != 3);
	}
}
