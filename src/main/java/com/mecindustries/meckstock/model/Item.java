package com.mecindustries.meckstock.model;

import com.mecindustries.meckstock.model.Enum.Estado;

/**
 *
 * @author Fael
 */
public class Item {

    private int id;
    private int idPatrimonio;
    private int idSetor;
    private Estado estado;

    public Item(int id, int idPatrimonio, int idSetor, Estado estado) {
        this.id = id;
        this.idPatrimonio = idPatrimonio;
        this.idSetor = idSetor;
        this.estado = estado;
    }

    public Item(int idPatrimonio, int idSetor, Estado estado) {
        this.idPatrimonio = idPatrimonio;
        this.idSetor = idSetor;
        this.estado = estado;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPatrimonio() {
        return idPatrimonio;
    }

    public void setIdPatrimonio(int idPatrimonio) {
        this.idPatrimonio = idPatrimonio;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final Item other = (Item) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", idPatrimonio=" + idPatrimonio + ", idSetor=" + idSetor + ", estado=" + estado + '}';
    }

}
