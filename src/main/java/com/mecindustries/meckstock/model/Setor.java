package com.mecindustries.meckstock.model;

/**
 *
 * @author Fael
 */
public class Setor {

    private int id;
    private String nome;

    public Setor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Setor(String nome) {
        this.nome = nome;
    }

    public Setor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Setor other = (Setor) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Setor{" + "id=" + id + ", nome=" + nome + '}';
    }

}
