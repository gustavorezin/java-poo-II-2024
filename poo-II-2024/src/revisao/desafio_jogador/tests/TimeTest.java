package revisao.desafio_jogador.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revisao.desafio_jogador.Jogador;
import revisao.desafio_jogador.Time;

class TimeTest {

	Time t1;
	Time t2;
	
	@BeforeEach
	public void inicializarTimes() {
		List<Jogador> jogadores = new ArrayList<>();
		jogadores.add(new Jogador("Arrasca", 14, 8));
		jogadores.add(new Jogador("Gabigol", 10, 5));
		jogadores.add(new Jogador("Pedro", 9, 10));
		jogadores.add(new Jogador("Gerson", 8, 3));
		jogadores.add(new Jogador("Leo Pereira", 4, 4));
		
		t1 = new Time("Flamengo", jogadores);
		t2 = new Time();
	}
	
	@Test
	public void listarJogadoresTest() {
		assertEquals("Jogador [nome=Arrasca, numeroCamisa=14, gols=8]\nJogador [nome=Gabigol, numeroCamisa=10, gols=5]\nJogador [nome=Pedro, numeroCamisa=9, gols=10]\nJogador [nome=Gerson, numeroCamisa=8, gols=3]\nJogador [nome=Leo Pereira, numeroCamisa=4, gols=4]\n", t1.getListaJogadores());
		assertEquals("", t2.getListaJogadores());
	}
	
	@Test
	public void toStringTest() {
		assertEquals("Flamengo (5)", t1.toString());
		assertEquals(" (0)", t2.toString());
	}
	
	@Test 
	public void artilheitoTest() {
		assertEquals("Jogador [nome=Pedro, numeroCamisa=9, gols=10]", t1.getArtilheiro().toString());
		assertEquals("Jogador [nome=, numeroCamisa=999, gols=-1]", t2.getArtilheiro().toString());
	}
	
	@Test
	public void totalGolsTest() {
		assertEquals(30, t1.getTotalGols());
		assertEquals(0, t2.getTotalGols());
	}

}
