package com.mecindustries.meckstock.dao;

import com.mecindustries.meckstock.factory.ConnectionFactory;
import com.mecindustries.meckstock.model.Enum.Estado;
import com.mecindustries.meckstock.model.Item;
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
public class ItemDao {

    public static boolean insert(Item item) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "INSERT INTO ITEM (ID_PATRIMONIO, ID_SETOR, ESTADO) "
                + "VALUES(?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setInt(1, item.getIdPatrimonio());
            stmt.setInt(2, item.getIdSetor());
            stmt.setInt(3, item.getEstado().Value());

            stmt.execute();

            connection.close();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    public static Item searchById(int id) {
        Item itemToReturn = null;
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM ITEM WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                itemToReturn = createItemObjectByResultSet(rs);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return itemToReturn;
        }

    }

    public static List<Item> searchBySetor(int id) {
        List<Item> itens = new ArrayList();
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "SELECT * FROM ITEM WHERE ID_SETOR = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                itens.add(createItemObjectByResultSet(rs));
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            return itens;
        }

    }

    public static boolean Update(Item item) {
        Connection connection = ConnectionFactory.getConnection();

        String sqlQuery = "UPDATE ITEM SET "
                + "ID_PATRIMONIO = ?, ID_SETOR = ?, ESTADO = ? "
                + "WHERE ID = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

            stmt.setInt(1, item.getIdPatrimonio());
            stmt.setInt(2, item.getIdSetor());
            stmt.setInt(3, item.getEstado().Value());
            stmt.setInt(4, item.getId());

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

        String sqlQuery = "DELETE FROM ITEM WHERE ID = ?";

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

    private static Item createItemObjectByResultSet(ResultSet rs) throws SQLException {
        return new Item(rs.getInt("ID"),
                rs.getInt("ID_PATRIMONIO"),
                rs.getInt("ID_SETOR"),
                Estado.getByField(rs.getInt("ESTADO")));
    }

}
