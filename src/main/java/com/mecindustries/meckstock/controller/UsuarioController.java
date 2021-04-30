package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.UsuarioDao;
import com.mecindustries.meckstock.model.Usuario;

/**
 *
 * @author Fael
 */
public class UsuarioController {

    public static Usuario makeLogin(String login, String senha) {
        Usuario usuario = UsuarioDao.searchByLogin(login);

        return (usuario.getSenha().equals(senha)) ? usuario : null;
    }

}
