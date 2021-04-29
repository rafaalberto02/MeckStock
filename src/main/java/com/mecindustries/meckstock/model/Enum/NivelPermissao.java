package com.mecindustries.meckstock.model.Enum;

/**
 *
 * @author Fael
 */
public enum NivelPermissao {

    PADRAO(1),
    GESTOR(2);

    private final int value;

    private NivelPermissao(int value) {
        this.value = value;
    }

    public int Value() {
        return this.value;
    }

    public static NivelPermissao getByField(int field) {
        for (NivelPermissao permissao : NivelPermissao.values()) {
            if (field == permissao.Value()) {
                return permissao;
            }
        }
        
        return null;
    }

}
