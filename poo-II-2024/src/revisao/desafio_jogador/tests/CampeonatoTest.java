package revisao.desafio_jogador.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revisao.desafio_jogador.Campeonato;
import revisao.desafio_jogador.Jogador;
import revisao.desafio_jogador.Time;

class CampeonatoTest {

	List<Time> times = new ArrayList<>();
	
	@BeforeEach
	public void inicializarTimes() {
		List<Jogador> jogadoresT1 = new ArrayList<>();
		jogadoresT1.add(new Jogador("Arrasca", 14, 8));
		jogadoresT1.add(new Jogador("Gabigol", 10, 5));
		jogadoresT1.add(new Jogador("Pedro", 9, 10));
		jogadoresT1.add(new Jogador("Gerson", 8, 3));
		jogadoresT1.add(new Jogador("Leo Pereira", 4, 4));
		
		Time t1 = new Time("Flamengo", jogadoresT1);
		
		List<Jogador> jogadoresT2 = new ArrayList<>();
		jogadoresT2.add(new Jogador("Felipe Vizeu", 9, 7));
		jogadoresT2.add(new Jogador("Kayser", 14, 4));
		jogadoresT2.add(new Jogador("Eder", 23, 6));
		jogadoresT2.add(new Jogador("Gustavo", 1, 0));
		jogadoresT2.add(new Jogador("Cleber", 4, 3));
		
		Time t2 = new Time("Criciuma", jogadoresT2);
		
		List<Jogador> jogadoresT3 = new ArrayList<>();
		jogadoresT3.add(new Jogador("Cano", 9, 9));
		jogadoresT3.add(new Jogador("Ganso", 10, 6));
		jogadoresT3.add(new Jogador("Marcelo", 12, 3));
		
		Time t3 = new Time("Fluminense", jogadoresT3);
		
		times.add(t1);
		times.add(t2);
		times.add(t3);
	}
	
	@Test
	public void timeComMaisGolsTest() {
		assertEquals("Flamengo (5)", Campeonato.getTimeComMaisGols(times).toString());
	}
	
	@Test
	public void artilheiroCampeonatoTest() {
		assertEquals("Jogador [nome=Pedro, numeroCamisa=9, gols=10]", Campeonato.getArtilheiroCampeonato(times).toString());
	}
}
