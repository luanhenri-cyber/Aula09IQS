package br.com.iqs.aula09;

// Atividade 3 - Code Review Simulado.
// Versão original (exemplo ruim): "return a / b;" sem tratar divisão por zero.
// Versão refatorada com tratamento adequado:
public class Calculadora {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");  // Fail fast
        }
        return a / b;
    }
}
