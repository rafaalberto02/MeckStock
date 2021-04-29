package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.Enum.NivelPermissao;
import com.mecindustries.meckstock.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fael
 */
public class UsuarioDao {

    public static boolean insert(Usuario usuario) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, TELEFONE, EMAIL, NIVEL_PERMISSAO) "
                + "VALUES(?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getEmail());
            stmt.setInt(6, usuario.getNivelPermissao().Value());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    public static Usuario searchById(int id) {
        Usuario usuarioToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM USUARIO WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioToReturn = createUsuarioObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return usuarioToReturn;
        }

    }

    public static Usuario searchByLogin(String login) {
        Usuario usuarioToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM USUARIO WHERE LOGIN = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setString(1, login);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioToReturn = createUsuarioObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return usuarioToReturn;
        }

    }

    public static boolean Update(Usuario usuario) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "UPDATE USUARIO SET "
                + "NOME = ?, LOGIN = ?, SENHA = ?, TELEFONE = ?, EMAIL = ?, NIVEL_PERMISSAO = ? "
                + "WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getEmail());
            stmt.setInt(6, usuario.getNivelPermissao().Value());
            stmt.setInt(7, usuario.getId());

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

        String sqlQuery = "DELETE FROM USUARIO WHERE ID = ?";

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

    private static Usuario createUsuarioObjectByResultSet(ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt("ID"),
                rs.getString("NOME"),
                rs.getString("LOGIN"),
                rs.getString("SENHA"),
                rs.getString("TELEFONE"),
                rs.getString("EMAIL"),
                NivelPermissao.getByField(rs.getInt("NIVEL_PERMISSAO")));
    }

}
