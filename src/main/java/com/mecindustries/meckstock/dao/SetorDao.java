package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.Setor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static int getLastInsertedId() {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT MAX(ID) AS LAST FROM SETOR";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("LAST");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return -1;
    }

    public static List<Setor> getAll() {
        List<Setor> setores = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM SETOR";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                setores.add(createSetorObjectByResultSet(rs));
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return setores;
        }
    }

    private static Setor createSetorObjectByResultSet(ResultSet rs) throws SQLException {
        return new Setor(rs.getInt("ID"), rs.getString("NOME"));
    }

}
