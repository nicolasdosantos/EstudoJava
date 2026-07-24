package Desafios.ModificadoresEstatico;

public class Conta {
    /*
     * DESAFIO 01 — 🟡 Médio — Modificador static
     * Cenário: Banco — Contador de Contas
     *
     * Crie Conta (titular de instância) com static int
     * totalContasAbertas incrementado a cada new, static final double
     * TAXA_MANUTENCAO, bloco static { } que imprime "Banco iniciado" e
     * static int getTotalContasAbertas(). No main, crie 3 contas e
     * imprima o total pelo método estático (nunca pelo objeto).
     */

    private String titular;
    // static faz esse contador pertencer a classe, nao a cada Conta - existe uma unica
    // copia na memoria, compartilhada entre todas as contas criadas
    private static int totalContasAbertas;
    // aqui deveria ser static final (como o enunciado pede) pra virar constante de
    // verdade - sem o final, esse valor fica em 0.0 (default de double) ate alguem
    // atribuir manualmente, e nada impede um new Conta(...) de mudar ele depois
    public static double TAXA_MANUTENCAO;

    // bloco static roda uma unica vez, quando a classe Conta e carregada pela JVM -
    // antes de qualquer new Conta(...). Diferente do bloco de inicializacao sem
    // static, que roda a cada objeto criado
    static{
        System.out.println("Banco iniciado!: ");
    }

    public Conta(String titular){
        this.titular = titular;
        // incrementa a copia static, entao todo objeto Conta ve o mesmo valor
        // atualizado - e por isso que getTotalContasAbertas() nao precisa de
        // instancia pra saber o total
        totalContasAbertas++;
    }

    public String getTitular() {
        return titular;
    }

    // metodo static so pode acessar atributo static (totalContasAbertas) - nao
    // teria acesso a titular, por exemplo, porque titular so existe depois que
    // uma Conta especifica for criada
    public static int getTotalContasAbertas() {
        return totalContasAbertas;
    }

}
