import org.example.AluguelVeiculoFactory;
import org.example.IAluguel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelOnibusTest {

    static String RETORNO_ONIBUS_ALUGUEL = "Onibus foi alugado";
    static String RETORNO_ONIBUS_DEVOLVER = "Onibus foi devolvido";

    @Test
    void deveRetornarSucessoAlugarCarro(){
        IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Onibus");
        assertEquals(RETORNO_ONIBUS_ALUGUEL, aluguel.alugar());
    }

    @Test
    void deveRetornarSucessoDevolverCarro(){
        IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Onibus");
        assertEquals(RETORNO_ONIBUS_DEVOLVER, aluguel.devolver());
    }
}
