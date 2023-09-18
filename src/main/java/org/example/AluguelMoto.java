package org.example;

public class AluguelMoto implements IAluguel {


    private static String MOTO_ALUGADA = "Moto foi alugada";

    private static String MOTO_RETORNADA = "Moto foi devolvida";

    @Override
    public String alugar() {
        return MOTO_ALUGADA;
    }

    @Override
    public String devolver() {
        return MOTO_RETORNADA;
    }
}
