package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.CategoriaDao;
import com.mecindustries.meckstock.model.Categoria;

/**
 *
 * @author Fael
 */
public class CategoriaController {

    public static boolean create(Categoria categoria) {
        return CategoriaDao.insert(categoria);
    }

}
