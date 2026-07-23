package Desafios.BlocosInicializacao;

/*
 * DESAFIO 01 — 🟡 Médio — Bloco de inicialização de instância
 * Cenário: Estoque — Auditoria de Produto
 *
 * Crie Produto (nome, preco) com um bloco de instância { } que
 * imprime "Auditoria: novo produto sendo criado..." e um construtor
 * que imprime "Produto cadastrado: " + nome. Crie 2 produtos no main
 * e observe a ordem das mensagens. Sem static ainda.
 */
public class Desafio01_Medio {
    public static void main(String[] args) {
        // cada "new Produto(...)" repete o bloco de auditoria + o construtor - da pra ver no
        // console que a ordem e sempre auditoria -> cadastro, pros dois produtos
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse", 120.00);

        produto1.imprime();
        produto2.imprime();
    }
}
