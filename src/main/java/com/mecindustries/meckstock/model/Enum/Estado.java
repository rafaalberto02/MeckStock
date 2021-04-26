package com.mecindustries.meckstock.model.Enum;

/**
 *
 * @author Rafael
 */
public enum Estado {

    NOVO(1),
    USADO(2),
    DANIFICADO(3);

    private int value;

    private Estado(int value) {
        this.value = value;
    }

    public int Value() {
        return value;
    }

}
