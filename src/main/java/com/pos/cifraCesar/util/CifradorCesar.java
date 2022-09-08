package com.pos.cifraCesar.util;

public class CifradorCesar {
    static String vParte1 = "", vParte2 = "";
    static int vTamanho = 0, vNumero = 0, vDeslizante = 3;
    public static String encryptacao(String value) {
        vParte1 = value;
        vTamanho = vParte1.length();

        for (int i = 0; i < vTamanho; i++) {
            vNumero = vParte1.charAt(i) + vDeslizante;
            vParte2 += (char) vNumero;
        }
        return vParte2;
    }
    public static String decryptacao(String value) {
        vParte1 = value;
        vTamanho = vParte1.length();

        for (int i = 0; i < vTamanho; i++) {
            vNumero = vParte1.charAt(i) - vDeslizante;
            vParte2 += (char) vNumero;
        }
        return vParte2;
    }
}
