package desafio_bancario.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio_bancario.entity.Banco;
import desafio_bancario.entity.Conta;
import desafio_bancario.entity.ContaEspecial;
import desafio_bancario.entity.ContaPoupanca;

class BancoTest {
	
	Banco b1;
	Banco b2 = new Banco();
	
	@BeforeEach
	void inicializar() {
		List<Conta> contas = new ArrayList<>();
		Conta c1 = new Conta(1, 1000);
		ContaPoupanca c2 = new ContaPoupanca(2, 2500);
		ContaEspecial c3 = new ContaEspecial(3, 700.5, 1000);
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		b1 = new Banco(contas);
	}

	@Test
	void listaContasTest() {
		assertEquals("Conta [numero=1, saldo=1000.0, tipo=CORRENTE]\nConta [numero=2, saldo=2500.0, tipo=POUPANCA]\nConta [numero=3, saldo=700.5, tipo=ESPECIAL]\n", b1.getListaContas());
		assertEquals("", b2.getListaContas());
	}

}
