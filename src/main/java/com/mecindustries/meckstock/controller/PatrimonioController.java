package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.PatrimonioDao;
import com.mecindustries.meckstock.model.Patrimonio;

/**
 *
 * @author Fael
 */
public class PatrimonioController {

    public static boolean create(Patrimonio patrimonio) {
        return PatrimonioDao.insert(patrimonio);
    }

    public static Patrimonio searchById(int id) {
        return PatrimonioDao.searchById(id);
    }

    public static boolean update(Patrimonio patrimnonioToEdit) {
        return PatrimonioDao.Update(patrimnonioToEdit);
    }

}
