package Aula09.Enumeracao.dominio;

// enum - usado quando o conjunto de valores possiveis e fixo e conhecido (aqui, cliente
// so pode ser pessoa_fisica OU pessoa_juridica, nunca outra coisa). Diferente de usar
// String/int como constante (jeito que eu tentava fazer antes), o compilador nao deixa
// passar valor invalido - se eu digitar errado, da erro de compilacao, nao um bug
// silencioso em tempo de execucao. Em projetos Spring Boot isso aparece muito mapeado
// pra coluna do banco com @Enumerated
public enum TipoCliente {
    // enum tambem pode ter construtor - aqui cada constante carrega um valor int
    // junto (pessoa_fisica = 1, pessoa_juridica = 2), tipo um "codigo" pra cada uma.
    // por isso a lista de constantes termina com ";" agora, senao o Java nao sabe
    // onde comeca o corpo da classe do enum (atributo/construtor/metodo)
    pessoa_fisica(1),
    pessoa_juridica(2);

    public final int valor;

    // esse construtor roda uma vez pra cada constante, no momento em que o enum e
    // carregado - nao dá pra chamar "new TipoCliente(1)" de fora, por isso nem tem
    // modificador de acesso (fica implicitamente privado)
    TipoCliente(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
