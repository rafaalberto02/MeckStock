package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.Setor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fael
 */
public class SetorDao {

    public static boolean insert(Setor setor) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO SETOR (NOME) "
                + "VALUES(?)";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setString(1, setor.getNome());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    public static Setor searchById(int id) {
        Setor setorToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM SETOR WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                setorToReturn = createSetorObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return setorToReturn;
        }

    }

    public static boolean Update(Setor setor) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "UPDATE SETOR SET "
                + "NOME = ? "
                + "WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setString(1, setor.getNome());
            stmt.setInt(2, setor.getId());

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

        String sqlQuery = "DELETE FROM SETOR WHERE ID = ?";

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

    private static Setor createSetorObjectByResultSet(ResultSet rs) throws SQLException {
        return new Setor(rs.getInt("ID"), rs.getString("NOME"));
    }

}
