package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.SetorDao;
import com.mecindustries.meckstock.model.Setor;
import java.util.List;

/**
 *
 * @author Fael
 */
public class SetorController {

    public static boolean create(Setor setor) {
        return SetorDao.insert(setor);
    }

    public static int getLastInsertedId() {
        return SetorDao.getLastInsertedId();
    }

    public static List<Setor> getAll() {
        return SetorDao.getAll();
    }

    public static Setor searchById(int id){
        return SetorDao.searchById(id);
    }
}
