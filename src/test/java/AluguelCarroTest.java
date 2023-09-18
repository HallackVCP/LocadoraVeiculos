import org.example.AluguelVeiculoFactory;
import org.example.IAluguel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelCarroTest {

    static String RETORNO_CARRO_ALUGUEL = "Carro foi alugado";
    static String RETORNO_CARRO_DEVOLVER = "Carro foi devolvido";

    @Test
    void deveRetornarSucessoAlugarCarro(){
        IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Carro");
        assertEquals(RETORNO_CARRO_ALUGUEL, aluguel.alugar());
    }

    @Test
    void deveRetornarSucessoDevolverCarro(){
        IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Carro");
        assertEquals(RETORNO_CARRO_DEVOLVER, aluguel.devolver());
    }
}
