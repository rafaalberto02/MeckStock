package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.HistoricoMovimentacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author Fael
 */
public class HistoricoMovimentacaoDao {

    public static boolean insert(HistoricoMovimentacao movimentacao) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO HISTORICO_MOVIMENTACAO (ID_USUARIO, ID_SETOR, ID_ITEM, DATA_RETIRADA) "
                + "VALUES(?, ?, ?, now(), ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setInt(1, movimentacao.getIdUsuario());
            stmt.setInt(2, movimentacao.getIdSetor());
            stmt.setInt(3, movimentacao.getIdItem());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    public static HistoricoMovimentacao searchById(int id) {
        HistoricoMovimentacao historicoToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM HISTORICO_MOVIMENTACAO WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                historicoToReturn = createHistoricoMovimentacaoObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return historicoToReturn;
        }

    }

    public static boolean Update(HistoricoMovimentacao movimentacao) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "UPDATE HISTORICO_MOVIMENTACAO SET "
                + "ID_USUARIO = ?, ID_SETOR = ?, ID_ITEM = ?, DATA_RETIRADA = ?, DATA_DEVOLUCAO = ? "
                + "WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setInt(1, movimentacao.getIdUsuario());
            stmt.setInt(2, movimentacao.getIdSetor());
            stmt.setInt(3, movimentacao.getIdItem());
            stmt.setTimestamp(4, Timestamp.valueOf(movimentacao.getDataRetirada()));
            stmt.setTimestamp(5, Timestamp.valueOf(movimentacao.getDataDevolucao()));
            stmt.setInt(6, movimentacao.getId());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean Delete(int id) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "DELETE FROM HISTORICO_MOVIMENTACAO WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            stmt.execute();

            stmt.close();
            connection.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    private static HistoricoMovimentacao createHistoricoMovimentacaoObjectByResultSet(ResultSet rs) throws SQLException {
        return new HistoricoMovimentacao(rs.getInt("ID"),
                rs.getInt("ID_USUARIO"),
                rs.getInt("ID_SETOR"),
                rs.getInt("ID_ITEM"),
                rs.getTimestamp("DATA_RETIRADA").toLocalDateTime(),
                rs.getTimestamp("DATA_DEVOLUCAO").toLocalDateTime()
        );
    }

}
