package org.example;

public class AluguelCarro implements IAluguel {

    private static String CARRO_ALUGADO = "Carro foi alugado";

    private static String CARRO_DEVOLVIDO = "Carro foi devolvido";

    @Override
    public String alugar() {
        return CARRO_ALUGADO;
    }

    @Override
    public String devolver() {
        return CARRO_DEVOLVIDO;
    }
}
