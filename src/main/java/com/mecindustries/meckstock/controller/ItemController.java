package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.ItemDao;
import com.mecindustries.meckstock.model.Item;
import java.util.List;

/**
 *
 * @author Fael
 */
public class ItemController {

    public static boolean create(Item item) {
        return ItemDao.insert(item);
    }

    public static List<Item> getBySetor(int id) {
        return ItemDao.searchBySetor(id);
    }

    public static Item getById(int id) {
        return ItemDao.searchById(id);
    }

    public static boolean update(Item item) {
        return ItemDao.Update(item);
    }

}
