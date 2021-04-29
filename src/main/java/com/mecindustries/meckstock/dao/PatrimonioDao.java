package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.Patrimonio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fael
 */
public class PatrimonioDao {

    public static boolean insert(Patrimonio patrimonio) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO PATRIMONIO (NOME, ID_CATEGORIA, QUANTIDADE) "
                + "VALUES(?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setString(1, patrimonio.getNome());
            stmt.setInt(2, patrimonio.getIdCategoria());
            stmt.setDouble(3, patrimonio.getQuantidade());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    public static Patrimonio searchById(int id) {
        Patrimonio patrimonioToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM PATRIMONIO WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                patrimonioToReturn = createPatrimonioObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return patrimonioToReturn;
        }

    }

    public static boolean Update(Patrimonio patrimonio) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "UPDATE PATRIMONIO SET "
                + "ID_CATEGORIA = ?, NOME = ?, QUANTIDADE = ? "
                + "WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setInt(1, patrimonio.getIdCategoria());
            stmt.setString(2, patrimonio.getNome());
            stmt.setDouble(3, patrimonio.getQuantidade());

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

        String sqlQuery = "DELETE FROM PATRIMONIO WHERE ID = ?";

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

    private static Patrimonio createPatrimonioObjectByResultSet(ResultSet rs) throws SQLException {
        return new Patrimonio(rs.getInt("ID"),
                rs.getInt("ID_CATEGORIA"),
                rs.getString("NOME"),
                rs.getDouble("QUANTIDADE"));
    }

}
