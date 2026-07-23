# ☕ Aula09 — Enumerações (`enum`)

> `TipoCliente` como `enum` com valores fixos, usado como tipo de atributo em `Cliente`.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Esta aula estuda `enum`, o tipo usado quando um atributo só pode assumir um conjunto fixo e conhecido de valores. Em vez de representar o tipo de cliente com uma `String` solta (e correr o risco de digitar um valor inválido sem o compilador avisar), `TipoCliente` é declarado como `enum`, com `pessoa_fisica` e `pessoa_juridica` como únicos valores possíveis.

## 🎯 Objetivos de Aprendizagem

- Declarar um `enum` com um conjunto fixo de constantes
- Usar um `enum` como tipo de atributo de uma classe de domínio, em vez de `String`

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `enum` | Tipo que representa um conjunto fixo de valores possíveis, validado pelo compilador |
| Atributo tipado por `enum` | `Cliente.tipoCliente` só aceita um dos valores definidos em `TipoCliente` |
| Acesso a constante de `enum` | `TipoCliente.pessoa_fisica` — pelo nome da classe, igual constante `static`, sem `new` |

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
| [TipoCliente.java](dominio/TipoCliente.java) | `enum` com os valores possíveis de tipo de cliente |
| [Cliente.java](dominio/Cliente.java) | Classe de domínio com atributo `tipoCliente` tipado pelo `enum` |
| [ClienteTeste01.java](teste/ClienteTeste01.java) | Instancia `Cliente` passando `TipoCliente.pessoa_fisica` |

## 💻 Trechos de Código Importantes

```java
public enum TipoCliente {
    pessoa_fisica,
    pessoa_juridica
}
```

Diferente de uma constante `String`/`int`, aqui o compilador garante que `tipoCliente` só pode ser um desses dois valores — não existe "pesoa_fisica" digitado errado passando reto até dar problema em produção.

## ⚠️ Erros Comuns

- Escrever os valores do `enum` dentro de `public class` (`pessoa_fisica, pessoa_juridica` soltos, sem `enum`) não compila — essa sintaxe de lista de constantes só é válida dentro de `enum` (erro real encontrado e corrigido em `TipoCliente.java` durante esta sessão).
- Depois de corrigir o `enum`, apareceu um segundo erro encadeado: o construtor de `Cliente` ainda esperava `String tipo`, mas `ClienteTeste01` já passava `TipoCliente.pessoa_fisica` — tipagem estática do Java não converte um enum pra `String` implicitamente. A correção foi tipar o construtor/atributo como `TipoCliente`, removendo o campo `String` duplicado que sobrou de uma versão anterior da classe.

## ✅ Boas Práticas

- Usar `enum` sempre que o domínio tiver um conjunto fixo e conhecido de valores, em vez de constantes `String`/`int` soltas.
- Não misturar duas representações do mesmo dado na mesma classe (aqui, `String tipo` e `TipoCliente tipoCliente` coexistiam) — deixa ambíguo qual campo é a fonte da verdade.

## 📌 Resumo

Nesta aula, o autor aprendeu a usar `enum` para representar um conjunto fixo de valores e a tipar um atributo de classe de domínio por ele, em vez de depender de constantes `String` soltas e sujeitas a erro de digitação.

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
