package desafio_bancario.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio_bancario.entity.ContaEspecial;

class ContaEspecialTest {
	
	ContaEspecial c1;
	ContaEspecial c2;
	
	@BeforeEach
	public void inicializar() {
		c1 = new ContaEspecial();
		c1.setLimiteNegativo(1000);
		
		c2 = new ContaEspecial(2, 500, 1000);
	}
	
	@Test
	void sacarTest() {
		c1.sacar(300);
		assertEquals(-300, c1.getSaldo());
		
		c2.sacar(1200);
		assertEquals(-700,  c2.getSaldo());
		c2.sacar(400);
		assertEquals(-700,  c2.getSaldo());
	}

}
