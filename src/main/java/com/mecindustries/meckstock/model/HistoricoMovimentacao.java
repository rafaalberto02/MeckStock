package com.mecindustries.meckstock.model;

import java.time.LocalDateTime;

/**
 *
 * @author Fael
 */
public class HistoricoMovimentacao {

    private int id;
    private int idUsuario;
    private int idSetor;
    private int idItem;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;

    public HistoricoMovimentacao(int id, int idUsuario, int idSetor, int idItem, LocalDateTime dataRetirada, LocalDateTime dataDevolucao) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idSetor = idSetor;
        this.idItem = idItem;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public HistoricoMovimentacao(int idUsuario, int idSetor, int idItem, LocalDateTime dataRetirada, LocalDateTime dataDevolucao) {
        this.idUsuario = idUsuario;
        this.idSetor = idSetor;
        this.idItem = idItem;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public HistoricoMovimentacao(int idUsuario, int idSetor, int idItem) {
        this.idUsuario = idUsuario;
        this.idSetor = idSetor;
        this.idItem = idItem;
    }

    public HistoricoMovimentacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public LocalDateTime getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDateTime dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HistoricoMovimentacao other = (HistoricoMovimentacao) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "HistoricoMovimentacao{" + "id=" + id + ", idUsuario=" + idUsuario + ", idSetor=" + idSetor + ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + '}';
    }

}
