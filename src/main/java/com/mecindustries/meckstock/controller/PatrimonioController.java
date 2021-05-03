package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.PatrimonioDao;
import com.mecindustries.meckstock.model.Patrimonio;
import java.util.List;

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

    public static boolean delete(int id) {
        return PatrimonioDao.Delete(id);
    }

    public static List<Patrimonio> getAll() {
        return PatrimonioDao.getAll();
    }

}
