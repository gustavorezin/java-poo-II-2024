package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class LeituraEscrita {
	public static void main(String[] args) {
		String menu = "1 - Escrever | 2 - Ler | 3 - Sair";
		int op = 1;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) {
				escrever();
			} else if (op == 2) {
				ler();
			}
		} while (op != 3);
	}
	
	private static void escrever() {
		try {
			FileWriter fw = new FileWriter("sorteio.txt");			
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 1; i <= 10; i++) {
				Random r = new Random();
				bw.append(r.nextInt(1000) + "\n");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private static void ler() {
		try {
			FileReader fr = new FileReader("sorteio.txt");			
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
