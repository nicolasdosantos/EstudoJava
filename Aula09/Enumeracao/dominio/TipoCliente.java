package Aula09.Enumeracao.dominio;

// enum - usado quando o conjunto de valores possiveis e fixo e conhecido (aqui, cliente
// so pode ser pessoa_fisica OU pessoa_juridica, nunca outra coisa). Diferente de usar
// String/int como constante (jeito que eu tentava fazer antes), o compilador nao deixa
// passar valor invalido - se eu digitar errado, da erro de compilacao, nao um bug
// silencioso em tempo de execucao. Em projetos Spring Boot isso aparece muito mapeado
// pra coluna do banco com @Enumerated
public enum TipoCliente {
    pessoa_fisica,
    pessoa_juridica
}
