import org.example.AluguelVeiculoFactory;
import org.example.IAluguel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelMotoTest {
    static String RETORNO_MOTO_ALUGUEL = "Moto foi alugada";
    static String RETORNO_MOTO_DEVOLVER = "Moto foi devolvida";


    @Test
    void deveRetornarSucessoAlugarCarro(){
        IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Moto");
        assertEquals(RETORNO_MOTO_ALUGUEL, aluguel.alugar());
    }

    @Test
    void deveRetornarSucessoDevolverCarro(){
        IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Moto");
        assertEquals(RETORNO_MOTO_DEVOLVER, aluguel.devolver());
    }
}
