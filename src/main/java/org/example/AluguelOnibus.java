package org.example;

public class AluguelOnibus implements IAluguel {


    private static String ONIBUS_ALUGADO = "Onibus foi alugado";

    private static String ONIBUS_RETORNADO = "Onibus foi devolvido";



    @Override
    public String alugar() {
        return ONIBUS_ALUGADO;
    }

    @Override
    public String devolver() {
        return ONIBUS_RETORNADO;
    }
}