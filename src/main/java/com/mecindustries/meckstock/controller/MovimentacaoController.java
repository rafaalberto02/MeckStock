package com.mecindustries.meckstock.controller;

import com.mecindustries.meckstock.dao.HistoricoMovimentacaoDao;
import com.mecindustries.meckstock.model.HistoricoMovimentacao;

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
    
}
