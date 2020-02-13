package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {

    private static Connection conexao;

    public static Connection getConexao()
            throws DadosException {
        if (conexao == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection(
                        "jdbc:mysql://localhost/cadastro",
                        "root",
                        "");
            } catch (ClassNotFoundException ex) {
                throw new DadosException("Erro ao carregar JDBC!");
            } catch (SQLException ex) {
                throw new DadosException("Erro ao conectar MySQL!");
            }
        }
        return conexao;
    }
}
