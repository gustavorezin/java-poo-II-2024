package banco_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;

import banco_dados.model.Cidade;

public class CidadeService {
	public static int insertCidade(Cidade cidade) {
		try {
			Connection conn = Conexao.conectaMySql();
			String sql = "INSERT INTO cidade (nome, uf) VALUES (?, ?)";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cidade.getNome());
			ps.setString(2, cidade.getUf());
			int total = ps.executeUpdate();

			conn.close();
			return total;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
