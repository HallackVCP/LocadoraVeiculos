package org.example;

public class AluguelVan{


    private static String VAN_ALUGADA = "Van foi alugada";

    private static String VAN_RETORNADA = "Van foi devolvida";



    public String alugar() {
        return VAN_ALUGADA;
    }


    public String devolver() {
        return VAN_RETORNADA;
    }
}