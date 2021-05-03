package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.HistoricoMovimentacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fael
 */
public class HistoricoMovimentacaoDao {

    public static boolean insert(HistoricoMovimentacao movimentacao) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO HISTORICO_MOVIMENTACAO (ID_USUARIO, ID_SETOR, ID_ITEM, DATA_RETIRADA) "
                + "VALUES(?, ?, ?, now())";

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

    public static boolean devolver(int id) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "UPDATE HISTORICO_MOVIMENTACAO SET "
                + "DATA_DEVOLUCAO = now() "
                + "WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setInt(1, id);
            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean hasOpenMove(int idItem) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM HISTORICO_MOVIMENTACAO WHERE ID_ITEM = ? AND DATA_DEVOLUCAO IS NULL";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, idItem);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }

    public static List<HistoricoMovimentacao> getOpen() {
        List<HistoricoMovimentacao> movimentacoes = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM HISTORICO_MOVIMENTACAO WHERE DATA_DEVOLUCAO IS NULL";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                movimentacoes.add(createHistoricoMovimentacaoObjectByResultSet(rs));
            }

            return movimentacoes;

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return movimentacoes;
        }
    }

    public static List<HistoricoMovimentacao> getClosed() {
        List<HistoricoMovimentacao> movimentacoes = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM HISTORICO_MOVIMENTACAO WHERE DATA_DEVOLUCAO IS NOT NULL";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(createHistoricoMovimentacaoObjectByResultSet(rs));
                movimentacoes.add(createHistoricoMovimentacaoObjectByResultSet(rs));
            }

            return movimentacoes;

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return movimentacoes;
        }
    }

    private static HistoricoMovimentacao createHistoricoMovimentacaoObjectByResultSet(ResultSet rs) throws SQLException {
        System.out.println("cc");
        return new HistoricoMovimentacao(rs.getInt("ID"),
                rs.getInt("ID_USUARIO"),
                rs.getInt("ID_SETOR"),
                rs.getInt("ID_ITEM"),
                rs.getObject("DATA_RETIRADA", LocalDateTime.class),
                rs.getObject("DATA_DEVOLUCAO", LocalDateTime.class)
        );
    }

}
