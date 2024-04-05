import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSumaPositivos() {

        assertEquals(8,Calculadora.calculadora(5, 3, Calculadora.SUMA));
    }
    @Test
    public void testSumaNegativos() {

        assertEquals(-8,Calculadora.calculadora(-5, -3, Calculadora.SUMA));
    }
    @Test
    public void testSumaPositivosCero(){
        assertEquals(5,Calculadora.calculadora(5, 0, Calculadora.SUMA));
    }

    @Test
    public void testRestaPositivos() {

        assertEquals(2, Calculadora.calculadora(5, 3, Calculadora.RESTA));
    }
    @Test
    public void testRestaNegativos() {

        assertEquals(-2, Calculadora.calculadora(-5, -3, Calculadora.RESTA));
    }
    @Test
    public void testRestaNegativosCero() {

        assertEquals(3, Calculadora.calculadora(0, -3, Calculadora.RESTA));
    }
    @Test
    public void testMultiplicacionPositivos() {
        assertEquals(15, Calculadora.calculadora(5, 3, Calculadora.MULTIPLICACION));
    }
    @Test
    public void testMultiplicacionNegativos() {
        assertEquals(15, Calculadora.calculadora(-5, -3, Calculadora.MULTIPLICACION));
    }
    @Test
    public void testMultiplicacionPositivoCero() {
        assertEquals(0, Calculadora.calculadora(5, 0, Calculadora.MULTIPLICACION));
    }
    @Test
    public void testDivisionPositivos() {
        assertEquals(2, Calculadora.calculadora(6, 3, Calculadora.DIVISION));
    }
    @Test
    public void testDivisionNegativos() {
        assertEquals(2, Calculadora.calculadora(-6, -3, Calculadora.DIVISION));
    }
    @Test
    public void testDivisionPositivoCero() {
        assertEquals(0, Calculadora.calculadora(0, 5, Calculadora.DIVISION));
    }

    @Test
    public void testRaizPositivos() {
        assertEquals(3, Calculadora.calculadora(9, 2, Calculadora.RAIZ));
    }
    @Test
    public void testRaizCero() {
        assertEquals(0, Calculadora.calculadora(0, 2, Calculadora.RAIZ));
    }

}