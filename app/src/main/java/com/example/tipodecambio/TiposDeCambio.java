package com.example.tipodecambio;

public class TiposDeCambio {

    public static Double pesoMexDolar(Double pesosMex) {
        return pesosMex / 20;
    }

    public static Double pesoMexYen(Double pesosMex) {
        return pesosMex * 5;
    }

    public static Double pesoMexPesoCh(Double pesosMex) {
        return pesosMex * 40;
    }

    public static Double pesoMexLibra(Double pesosMex) {
        return pesosMex / 27;
    }
}
