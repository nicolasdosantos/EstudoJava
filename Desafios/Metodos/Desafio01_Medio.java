package Desafios.Metodos;

/*
 * DESAFIO 01 — 🟡 Médio — Métodos (varargs)
 * Cenário: Banco — Calculadora de Depósitos
 *
 * Crie CalculadoraBanco com double somarDepositos(double... valores)
 * e void relatorio(String cliente, double total). No main, chame
 * somarDepositos com 0, 2 e 5 valores diferentes. Sem array manual —
 * o ponto é usar varargs.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        CalculadoraBanco calculadoraBanco = new CalculadoraBanco();

        double total1 = calculadoraBanco.somarDepositos(0);
        calculadoraBanco.relatorio("Nicolas", total1);

        double total2 = calculadoraBanco.somarDepositos(100, 50);
        calculadoraBanco.relatorio("Nicolas", total2);
        
        double total3 = calculadoraBanco.somarDepositos(70, 50, 88, 35, 15);
        calculadoraBanco.relatorio("Nicolas", total3);
    }
}
