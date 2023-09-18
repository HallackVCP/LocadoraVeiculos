import org.example.AluguelVeiculoFactory;
import org.example.IAluguel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AluguelVeiculoFactoryTest {

    @Test
    void deveRetornarExcecaoServicoAluguelInexistente(){
        try{
            IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Kombi");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Servico de aluguel inexistente", e.getMessage());
        }

    }

    @Test
    void deveRetornarExcecaoServicoAluguelInvalido(){
        try{
            IAluguel aluguel = AluguelVeiculoFactory.obterAluguelVeiculo("Van");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Servico de aluguel invalido", e.getMessage());
        }

    }

}