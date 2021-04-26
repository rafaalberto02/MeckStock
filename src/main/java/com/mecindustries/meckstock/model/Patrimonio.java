package com.mecindustries.meckstock.model;

/**
 *
 * @author Fael
 */
public class Patrimonio {

    private int id;
    private int idCategoria;
    private String nome;
    private double quantidade;

    public Patrimonio(int id, int idCategoria, String nome, double quantidade) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Patrimonio(int idCategoria, String nome, double quantidade) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Patrimonio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Patrimonio other = (Patrimonio) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Patrimonio{" + "id=" + id + ", idCategoria=" + idCategoria + ", nome=" + nome + ", quantidade=" + quantidade + '}';
    }

}
