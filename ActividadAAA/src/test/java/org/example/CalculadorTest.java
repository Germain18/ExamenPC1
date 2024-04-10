package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    public void Testrestar_PositiveNumbers_CorrectSubstracion(){
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;
        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }
    @Test

    public void TestMultiplicacion_PositiveNumbers_ShouldReturnCorrectProduct(){
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;
        // Act

        int resultado = calculador.multiplicacion(numeroA, numeroB);
        assertEquals(50, resultado, "10 * 5 deberia ser 50");
    }
    @Test
    public void TestMultiplicacion_NegativeNumbers_ShouldReturnCorrectMultiplicacion(){
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;
        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);
        assertEquals(50, resultado, "10 * 5 deberia ser 50");

    }
    @Test
    public void TestDivision_PositiveNumbers_ShouldReturnCorrectDivision(){
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;
        // Act

        double resultado = calculador.division(numeroA,numeroB);
        assertEquals(2, resultado, "10 / 5 deberia ser 2");
    }
    @Test
    public void testDivision_DivideByZero_ShouldThrowArithmeticExceptio() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 0;

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            calculador.division(numeroA, numeroB);
        });

    }


}
