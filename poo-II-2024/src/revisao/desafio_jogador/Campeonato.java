package revisao.desafio_jogador;

import java.util.List;

public class Campeonato {
	public static Time getTimeComMaisGols(List<Time> times) {
		Time timeComMaisGols = times.get(0);
		for (Time time : times) {
			if(time.getTotalGols() > timeComMaisGols.getTotalGols()) {
				timeComMaisGols = time;
			}
		}
		return timeComMaisGols;
	}
	
	public static Jogador getArtilheiroCampeonato(List<Time> times) {
		Jogador artilheiro = new Jogador();
		for (Time time : times) {
			if(time.getArtilheiro().getGols() > artilheiro.getGols()) {
				artilheiro = time.getArtilheiro();
			}
		}
		return artilheiro;
	}
}
