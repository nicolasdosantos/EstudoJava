package Desafios.Aula05;

/*
 * DESAFIO 01 — 🟡 Médio — Condicionais (Aula05)
 * Cenário: Cinema
 *
 * Classifique o cliente pela idade (if/else if/else: Infantil,
 * Adolescente, Adulto), defina o preço base pelo tipo de sessão
 * ('N', 'P', 'V') com switch, e aplique 10% de desconto pra
 * Adolescente com ternário. Sem laços/arrays.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        int idade = 16;
        char tipoSessao = 'P';

        String categoria;
        double precoBase = 0;

        // Classificação por idade
        if (idade <= 12) {
            categoria = "Infantil";
        } else if (idade <= 17) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto";
        }

        // Definindo o preço pela sessão
        switch (tipoSessao) {
            case 'N':
                precoBase = 20.0;
                break;
            case 'P':
                precoBase = 30.0;
                break;
            case 'V':
                precoBase = 40.0;
                break;
            default:
                System.out.println("Tipo de sessão inválido.");
                break;
        }

        // Aplicando desconto com operador ternário
        double precoFinal = categoria.equals("Adolescente")
                ? precoBase * 0.9
                : precoBase;

        System.out.println("Categoria: " + categoria);
        System.out.println("Tipo da sessão: " + tipoSessao);
        System.out.println("Preço final: R$ " + precoFinal);

    }
}
