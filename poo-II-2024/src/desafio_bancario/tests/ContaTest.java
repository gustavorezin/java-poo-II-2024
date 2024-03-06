package desafio_bancario.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio_bancario.entity.Conta;

class ContaTest {
	
	Conta c1;
	Conta c2;
	
	@BeforeEach
	public void inicializar() {
		c1 = new Conta();
		c2 = new Conta(1, 500);
	}
	
	@Test
	void depositarTest() {
		c1.depositar(100);
		assertEquals(100, c1.getSaldo());
		
		c2.depositar(200);
		assertEquals(700,  c2.getSaldo());
	}
	
	@Test
	void sacarTest() {
		c1.sacar(100);
		assertEquals(0, c1.getSaldo());
		
		c2.sacar(150.75);
		assertEquals(349.25,  c2.getSaldo());
	}
	
	@Test
	void transferirTest() {
		c1.transferir(c2, 100);
		assertEquals(0, c1.getSaldo());
		assertEquals(500, c2.getSaldo());
		
		c2.transferir(c1, 100);
		assertEquals(100, c1.getSaldo());
		assertEquals(400, c2.getSaldo());
	}

}
