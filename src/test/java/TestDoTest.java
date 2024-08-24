import dio.mayran.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestDoTest{
    @Test
    public void testarSoma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(1,2);

        Assertions.assertEquals(3, resultado);
    }
}
