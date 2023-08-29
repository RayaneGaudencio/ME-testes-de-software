package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioAppTest {

    CalculadoraSalarioApp calcSalario = new CalculadoraSalarioApp();

    @DisplayName("Deveria retornar R$97,50")
    @Test
    void testeCalculoDescontoPrimeiraFaixa() {
        assertEquals( 97.50, calcSalario.calcularINSS(1300),0.01);
    }

    @DisplayName("Deveria retornar R$115,20")
    @Test
    void testeCalculoDescontoSegundaFaixa() {
        assertEquals(115.20, calcSalario.calcularINSS(1500), 0.01);
    }

    @DisplayName("Deveria retornar R$263,06")
    @Test
    void testeCalculoDescontoTerceiraFaixa() {
        assertEquals(263.06, calcSalario.calcularINSS(3000), 0.01);
    }

    @DisplayName("Deveria retornar R$665,92")
    @Test
    void testeCalculoDescontoQuartaFaixa() {
        assertEquals(665.92, calcSalario.calcularINSS(6000), 0.01);
    }

    @DisplayName("Deveria retornar R$876,97")
    @Test
    void testeCalculoDescontoAcimaQuartaFaixa() {
        assertEquals(876.97, calcSalario.calcularINSS(10000), 0.01);
    }
}