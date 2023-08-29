package org.example;

public class CalculadoraSalarioApp {
    final double SALARIO_PRIMEIRA_FAIXA = 1320;
    final double SALARIO_SEGUNDA_FAIXA = 2571.29;
    final double SALARIO_TERCEIRA_FAIXA = 3856.94;
    final double SALARIO_QUARTA_FAIXA = 7507.49;

    final double PORCENTAGEM_PRIMEIRA_FAIXA = 0.075;
    final double PORCENTAGEM_SEGUNDA_FAIXA = 0.09;
    final double PORCENTAGEM_TERCEIRA_FAIXA = 0.12;
    final double PORCENTAGEM_QUARTA_FAIXA = 0.14;

    final double MAXIMO_IMPOSTO_PRIMEIRA_FAIXA = 99;
    final double MAXIMO_IMPOSTO_SEGUNDA_FAIXA = 112.61;
    final double MAXIMO_IMPOSTO_TERCEIRA_FAIXA = 154.28;

    final double MAXIMO_IMPOSTO = 876.97;


    public double calcularINSS(double salarioBruto) {

        if (salarioBruto <= SALARIO_PRIMEIRA_FAIXA) {
            return calcPrimeiraFaixa(salarioBruto);
        } else if (salarioBruto > SALARIO_PRIMEIRA_FAIXA && salarioBruto <= SALARIO_SEGUNDA_FAIXA) {
            return calcSegundaFaixa(salarioBruto);
        } else if (salarioBruto > SALARIO_SEGUNDA_FAIXA && salarioBruto <= SALARIO_TERCEIRA_FAIXA) {
            return calcTerceiraFaixa(salarioBruto);
        } else if (salarioBruto > SALARIO_TERCEIRA_FAIXA && salarioBruto <= SALARIO_QUARTA_FAIXA) {
            return calcQuartaFaixa(salarioBruto);
        } else {
            return MAXIMO_IMPOSTO;
        }
    }

    private double calcPrimeiraFaixa(double salarioBruto) {
        return salarioBruto * PORCENTAGEM_PRIMEIRA_FAIXA;
    }

    private double calcSegundaFaixa(double salarioBruto) {
        double calcSegundaFaixa = (salarioBruto - SALARIO_PRIMEIRA_FAIXA) * PORCENTAGEM_SEGUNDA_FAIXA;
        return calcSegundaFaixa + MAXIMO_IMPOSTO_PRIMEIRA_FAIXA;
    }

    private double calcTerceiraFaixa(double salarioBruto) {
        double calcTerceiraFaixa = (salarioBruto - SALARIO_SEGUNDA_FAIXA) * PORCENTAGEM_TERCEIRA_FAIXA;
        return calcTerceiraFaixa + MAXIMO_IMPOSTO_PRIMEIRA_FAIXA + MAXIMO_IMPOSTO_SEGUNDA_FAIXA;
    }

    private double calcQuartaFaixa(double salarioBruto) {
        double calcQuartaFaixa =  (salarioBruto - SALARIO_TERCEIRA_FAIXA) * PORCENTAGEM_QUARTA_FAIXA;
        return calcQuartaFaixa + MAXIMO_IMPOSTO_PRIMEIRA_FAIXA + MAXIMO_IMPOSTO_SEGUNDA_FAIXA + MAXIMO_IMPOSTO_TERCEIRA_FAIXA;
    }
}
