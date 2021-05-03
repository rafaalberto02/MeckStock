package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.HistoricoMovimentacaoDao;
import com.mecindustries.meckstock.model.HistoricoMovimentacao;
import java.util.List;

/**
 *
 * @author Fael
 */
public class MovimentacaoController {

    public static boolean create(HistoricoMovimentacao movimentacao) {
        return HistoricoMovimentacaoDao.insert(movimentacao);
    }

    public static boolean hasOpenMove(int idItem) {
        return HistoricoMovimentacaoDao.hasOpenMove(idItem);
    }

    public static List<HistoricoMovimentacao> getOpen() {
        System.out.println("aaa");
        return HistoricoMovimentacaoDao.getOpen();
    }

    public static List<HistoricoMovimentacao> getClosed() {
        System.out.println("aaa");
        return HistoricoMovimentacaoDao.getClosed();
    }

    public static boolean devolver(int id) {
        return HistoricoMovimentacaoDao.devolver(id);
    }

}
