package desafio_bancario.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio_bancario.entity.ContaPoupanca;

class ContaPoupancaTest {
	
	ContaPoupanca c1;
	ContaPoupanca c2;
	
	@BeforeEach
	public void inicializar() {
		c1 = new ContaPoupanca();
		c2 = new ContaPoupanca(2, 500);
	}
	
	@Test
	void sacarTest() {
		c1.sacar(300);
		assertEquals(5, c1.getLimiteOperacoesSaque());
		
		c2.sacar(50);
		assertEquals(4,  c2.getLimiteOperacoesSaque());
		c2.sacar(50);
		c2.sacar(50);
		c2.sacar(50);
		assertEquals(1,  c2.getLimiteOperacoesSaque());
		assertEquals(300,  c2.getSaldo());
		c2.sacar(50);
		c2.sacar(50);
		assertEquals(0,  c2.getLimiteOperacoesSaque());
		assertEquals(250,  c2.getSaldo());
	}

}
