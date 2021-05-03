package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.CategoriaDao;
import com.mecindustries.meckstock.model.Categoria;
import java.util.List;

/**
 *
 * @author Fael
 */
public class CategoriaController {

    public static boolean create(Categoria categoria) {
        return CategoriaDao.insert(categoria);
    }

    public static List<Categoria> getAll() {
        return CategoriaDao.getAll();
    }

    public static Categoria searchById(int id) {
        return CategoriaDao.searchById(id);
    }

}
