package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fael
 */
public class CategoriaDao {

    public static boolean insert(Categoria categoria) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO CATEGORIA (NOME) "
                + "VALUES(?)";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setString(1, categoria.getNome());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    public static Categoria searchById(int id) {
        Categoria categoriaToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM CATEGORIA WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                categoriaToReturn = createCategoriaObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return categoriaToReturn;
        }

    }

    public static boolean delete(int id) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "DELETE FROM CATEGORIA WHERE ID = ?";

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

    private static Categoria createCategoriaObjectByResultSet(ResultSet rs) throws SQLException {
        return new Categoria(rs.getInt("ID"),
                rs.getString("NOME"));
    }

}
