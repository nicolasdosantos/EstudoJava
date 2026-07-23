package Desafios.BlocosInicializacao;

public class Produto {
    private String nome;
    private double preco;

    // bloco de inicializacao de instancia - roda toda vez que um "new Produto(...)" e chamado,
    // sempre ANTES do corpo do construtor, mesmo sem nenhum atributo sendo setado aqui ainda
    {
        System.out.println("Auditoria: novo produto sendo criado...");
    }

    // por isso o print de auditoria sempre aparece antes do "Produto cadastrado" - o bloco acima
    // ja rodou quando a execucao chega aqui dentro do construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

        System.out.println("Produto cadastrado: " + nome);
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("------------------------");
    }
}
