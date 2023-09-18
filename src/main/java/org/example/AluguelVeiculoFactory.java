package org.example;

public class AluguelVeiculoFactory {



    public static IAluguel obterAluguelVeiculo(String tipoVeiculo){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Aluguel" + tipoVeiculo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Servico de aluguel inexistente");
        }
        if (!(objeto instanceof IAluguel)) {
            throw new IllegalArgumentException("Servico de aluguel invalido");
        }
        return (IAluguel) objeto;
    }

}
