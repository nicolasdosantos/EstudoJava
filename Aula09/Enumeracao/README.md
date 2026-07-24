# ☕ Aula09 — Enumerações (`enum`)

> `TipoCliente` como `enum` com valores fixos e construtor associando um código numérico a cada constante; `TipoPagamento` como `enum` aninhado dentro de `Cliente`.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Esta aula estuda `enum`, o tipo usado quando um atributo só pode assumir um conjunto fixo e conhecido de valores. Em vez de representar o tipo de cliente com uma `String` solta (e correr o risco de digitar um valor inválido sem o compilador avisar), `TipoCliente` é declarado como `enum`, com `pessoa_fisica` e `pessoa_juridica` como únicos valores possíveis. A aula evolui ainda para dois pontos além do enum básico: um enum pode ter construtor, carregando um dado extra junto de cada constante (aqui, um código `int`), e pode ser declarado aninhado dentro de outra classe, quando o tipo só faz sentido naquele contexto específico (`TipoPagamento` dentro de `Cliente`).

## 🎯 Objetivos de Aprendizagem

- Declarar um `enum` com um conjunto fixo de constantes
- Usar um `enum` como tipo de atributo de uma classe de domínio, em vez de `String`
- Dar um construtor ao `enum`, associando um valor extra a cada constante
- Declarar um `enum` aninhado dentro de outra classe, quando o tipo é específico dela

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `enum` | Tipo que representa um conjunto fixo de valores possíveis, validado pelo compilador |
| Atributo tipado por `enum` | `Cliente.tipoCliente` só aceita um dos valores definidos em `TipoCliente` |
| Acesso a constante de `enum` | `TipoCliente.pessoa_fisica` — pelo nome da classe, igual constante `static`, sem `new` |
| Construtor de `enum` | Cada constante roda o construtor uma única vez, no carregamento da classe — sem modificador de acesso, porque não dá pra chamar `new TipoCliente(1)` de fora |
| `enum` aninhado | `Cliente.TipoPagamento` só existe dentro do contexto de `Cliente`; acesso de fora exige o nome da classe externa também: `Cliente.TipoPagamento.debito` |

## 📂 Estrutura da Aula

```text
Aula09/Enumeracao/
├── dominio/
│   ├── Cliente.java
│   └── TipoCliente.java
└── teste/
    └── ClienteTeste01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [TipoCliente.java](dominio/TipoCliente.java) | `enum` com os valores possíveis de tipo de cliente, cada um com um construtor associando um código `int` |
| [Cliente.java](dominio/Cliente.java) | Classe de domínio com atributo `tipoCliente` tipado pelo `enum`; declara também o `enum` aninhado `TipoPagamento` e sobrescreve `toString()` |
| [ClienteTeste01.java](teste/ClienteTeste01.java) | Instancia `Cliente` passando `TipoCliente.pessoa_fisica` e `Cliente.TipoPagamento.debito`, e imprime o objeto |

## 💻 Trechos de Código Importantes

```java
public enum TipoCliente {
    pessoa_fisica(1),
    pessoa_juridica(2);

    public final int valor;

    TipoCliente(int valor){
        this.valor = valor;
    }
}
```

Diferente de uma constante `String`/`int`, aqui o compilador garante que `tipoCliente` só pode ser um desses dois valores — não existe "pesoa_fisica" digitado errado passando reto até dar problema em produção. Com o construtor, cada constante ainda carrega um código numérico próprio (`pessoa_fisica.valor == 1`), útil para representar o mesmo dado que hoje seria salvo como `int` numa coluna de banco.

## ⚠️ Erros Comuns

- Escrever os valores do `enum` dentro de `public class` (`pessoa_fisica, pessoa_juridica` soltos, sem `enum`) não compila — essa sintaxe de lista de constantes só é válida dentro de `enum` (erro real encontrado e corrigido em `TipoCliente.java` durante esta sessão).
- Depois de corrigir o `enum`, apareceu um segundo erro encadeado: o construtor de `Cliente` ainda esperava `String tipo`, mas `ClienteTeste01` já passava `TipoCliente.pessoa_fisica` — tipagem estática do Java não converte um enum pra `String` implicitamente. A correção foi tipar o construtor/atributo como `TipoCliente`, removendo o campo `String` duplicado que sobrou de uma versão anterior da classe.

## ✅ Boas Práticas

- Usar `enum` sempre que o domínio tiver um conjunto fixo e conhecido de valores, em vez de constantes `String`/`int` soltas.
- Não misturar duas representações do mesmo dado na mesma classe (aqui, `String tipo` e `TipoCliente tipoCliente` coexistiam) — deixa ambíguo qual campo é a fonte da verdade.
- Dar construtor ao `enum` quando cada constante precisa carregar um dado extra junto (código, descrição, etc.), em vez de espalhar esse mapeamento em `if`/`switch` pelo resto do código.
- Aninhar um `enum` dentro da classe que o usa quando o tipo só faz sentido naquele contexto — evita criar um arquivo `.java` a mais para um tipo que não é reutilizado em nenhum outro lugar.

## 📌 Resumo

Nesta aula, o autor aprendeu a usar `enum` para representar um conjunto fixo de valores e a tipar um atributo de classe de domínio por ele, em vez de depender de constantes `String` soltas e sujeitas a erro de digitação. Avançou também para enum com construtor, associando um código `int` a cada constante, e para enum aninhado dentro de outra classe (`Cliente.TipoPagamento`), quando o tipo é específico daquele contexto.

## 📚 Referências

- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- Curso Java — DevDojo

## 📈 Evolução

```
Java Core

███████████████░░░░░ 75%
```

## 🔗 Próximo Conteúdo

➡️ Polimorfismo
