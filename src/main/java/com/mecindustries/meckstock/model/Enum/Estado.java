package com.mecindustries.meckstock.model.Enum;

/**
 *
 * @author Rafael
 */
public enum Estado {

    NOVO(1),
    USADO(2),
    DANIFICADO(3);

    private final int value;

    private Estado(int value) {
        this.value = value;
    }

    public int Value() {
        return this.value;
    }

    public static Estado getByField(int field) {
        for (Estado estado : Estado.values()) {
            if (field == estado.Value()) {
                return estado;
            }
        }

        return null;
    }

}
