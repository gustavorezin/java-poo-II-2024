package leitura_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import desafio_bancario.entity.Conta;
import desafio_bancario.entity.ContaEspecial;
import desafio_bancario.entity.ContaPoupanca;

public class ArquivoContas {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("contas.txt"); // encontra o arquivo
			BufferedReader br = new BufferedReader(fr); // le o arquivo
			
			List<Conta> contas = new ArrayList<>();
			
			String linha = "";
			while((linha = br.readLine()) != null) {
				String v[] = linha.split(",");
				int nr = Integer.parseInt(v[1]);
				double saldo = Double.parseDouble(v[2]);
				if(v[0].equals("0")) {
					contas.add(new Conta(nr, saldo));
				}
				if(v[0].equals("1")) {
					contas.add(new ContaPoupanca(nr, saldo));
				}
				if(v[0].equals("2")) {
					double limite = Double.parseDouble(v[3]);
					contas.add(new ContaEspecial(nr, saldo, limite));
				}
			}
			
			br.close();
			fr.close();
			
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
