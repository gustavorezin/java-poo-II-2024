package banco_dados.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import banco_dados.CidadeService;
import banco_dados.Conexao;
import banco_dados.model.Cidade;

class BancoDadosTest {

	@Test
	void conexaoTest() {
		assertNotNull(Conexao.conectaMySql());
	}

	@Test
	void insertCidadeTest() {
		Cidade cidade = new Cidade(0, "Araranguá", "SC");
		assertEquals(1, CidadeService.insertCidade(cidade));
	}

}
