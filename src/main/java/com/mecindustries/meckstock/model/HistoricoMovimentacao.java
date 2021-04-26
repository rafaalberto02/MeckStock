package com.mecindustries.meckstock.model;

import java.time.LocalDateTime;

/**
 *
 * @author Fael
 */
public class HistoricoMovimentacao {

    private int id;
    private int idFuncionario;
    private int idSetor;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;

    public HistoricoMovimentacao(int id, int idFuncionario, int idSetor, LocalDateTime dataRetirada, LocalDateTime dataDevolucao) {
        this.id = id;
        this.idFuncionario = idFuncionario;
        this.idSetor = idSetor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public HistoricoMovimentacao(int idFuncionario, int idSetor, LocalDateTime dataRetirada, LocalDateTime dataDevolucao) {
        this.idFuncionario = idFuncionario;
        this.idSetor = idSetor;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public HistoricoMovimentacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
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
        return "HistoricoMovimentacao{" + "id=" + id + ", idFuncionario=" + idFuncionario + ", idSetor=" + idSetor + ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + '}';
    }

}
