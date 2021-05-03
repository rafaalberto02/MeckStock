package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.SetorDao;
import com.mecindustries.meckstock.model.Setor;

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

}
