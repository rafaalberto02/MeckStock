package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.ItemDao;
import com.mecindustries.meckstock.model.Item;

/**
 *
 * @author Fael
 */
public class ItemController {

    public static boolean create(Item item) {
        return ItemDao.insert(item);
    }

}
