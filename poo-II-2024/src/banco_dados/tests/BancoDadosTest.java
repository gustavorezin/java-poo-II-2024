package banco_dados.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import banco_dados.Conexao;

class BancoDadosTest {

	@Test
	void conexaoTest() {
		assertNotNull(Conexao.conectaMySql());
	}

}
