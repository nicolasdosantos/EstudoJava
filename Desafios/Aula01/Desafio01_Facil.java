package Desafios.Aula01;

/*
 * ===================================================================
 * DESAFIO 01 — 🟢 Fácil
 * Assunto: Sintaxe básica (Aula01)
 * Cenário: Recibo de Loja
 * ===================================================================
 *
 * # Objetivo
 * Uma lojinha quer um programinha simples que imprima o cabeçalho de
 * um recibo no console: nome da loja, um separador e uma mensagem de
 * agradecimento.
 *
 * # Requisitos obrigatórios
 * - Criar uma classe com método main.
 * - Imprimir, em linhas separadas: o nome da loja, uma linha de
 *   traços ("------------------------") e a mensagem
 *   "Obrigado pela preferência!".
 *
 * # Restrições
 * - Não usar variáveis, tipos, operadores ou qualquer estrutura além
 *   de System.out.println — é só fixação de estrutura de classe/main.
 *
 * # Dicas
 * - Cada println é uma linha nova.
 * - Não precisa de nenhum parâmetro em main além do String[] args padrão.
 *
 * # Aprendizado esperado
 * Fixa a estrutura mínima obrigatória de todo programa Java (classe
 * pública + main estático) — a base que todo o resto do curso usa.
 * ===================================================================
 */
public class Desafio01_Facil {
    public static void main(String[] args) {
        System.out.println("Loja Java");
        System.out.println("------------------------");
        System.out.println("Obrigado pela preferência!");
    }
}
