# ☕ Aula 02 — Tipos Primitivos e Casting

> Tipos primitivos do Java, conversão de tipos (casting) e a diferença entre tipo primitivo e tipo referência (`String`).

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Aula sobre os tipos primitivos do Java (`int`, `long`, `double`, `float`, `byte`, `short`, `boolean`, `char`) e como o compilador exige conversão explícita (casting) quando há risco de perda de dado. Também introduz `var` (inferência de tipo) e reforça que `String` não é um tipo primitivo, e sim um tipo referência.

## 🎯 Objetivos de Aprendizagem

- Tipos primitivos, casting e variáveis — Aula02

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Tipos primitivos numéricos | `int`, `long`, `double`, `float`, `byte`, `short` — cada um com faixa de valores e tamanho de memória diferentes |
| `boolean` e `char` | Tipos primitivos não numéricos: `boolean` (`true`/`false`) e `char` (um único caractere entre aspas simples) |
| Sufixos literais (`L`, `D`, `F`) | Indicam ao compilador o tipo exato do literal (`100000L` é `long`, `2000.0D` é `double`, `2500.0F` é `float`) |
| Casting explícito | `(int) 10000000000L` força a conversão de `long` para `int`, truncando os bytes que não cabem — perda de dado intencional e assumida pelo programador |
| `var` | Inferência de tipo pelo compilador a partir do valor atribuído — o tipo continua estático, só a escrita é implícita |
| Tipo referência vs. primitivo | `String` é tipo referência (objeto), diferente dos 8 tipos primitivos numéricos/booleanos/char |

## 📂 Estrutura da Aula

```text
Aula02/
└── Aula02.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula02.java](Aula02.java) | Declara os 8 tipos primitivos do Java, demonstra casting de `long` para `int` com perda de dado, `var` e a diferença entre `String` (referência) e primitivo |

## 💻 Trechos de Código Importantes

```java
// casting - Força o java a aceitar esse valor, porem ele corta os byte para fazer caber no valor int
int idade = (int) 10000000000L;
```

`10000000000L` excede a faixa de `int` (máximo ~2,1 bilhões). O casting `(int)` não arredonda nem lança erro — ele trunca os bits que não cabem, produzindo um valor final incorreto/inesperado. É responsabilidade do programador garantir que o valor de origem realmente caiba no tipo de destino antes de fazer esse tipo de conversão.

## 🔄 Fluxo da Implementação

```text
long (10000000000L) → (int) casting → int truncado (valor incorreto, sem erro de compilação)
```

## ⚠️ Erros Comuns

- Fazer casting de um valor `long` para `int` sem verificar se ele cabe na faixa de `int` — o Java não impede a compilação, só trunca silenciosamente o valor, o que pode introduzir bugs difíceis de perceber em tempo de execução.
- Esquecer o sufixo `L`/`D`/`F` em literais grandes ou decimais, fazendo o compilador interpretar o literal com um tipo diferente do esperado (ex: `2000.0` sem `D` já é `double` por padrão, mas `100000` sem `L` é `int`, não `long`).

## ✅ Boas Práticas

- Preferir o tipo primitivo que realmente corresponde à faixa de valores esperada (não usar `long` "por segurança" onde `int` já é suficiente) — evita gasto de memória desnecessário e deixa a intenção do código mais clara.
- Usar `var` apenas quando o tipo já fica óbvio pelo valor atribuído (ex: `var nome2 = "Teste"`) — em mercado, abusar de `var` em declarações onde o tipo não é óbvio prejudica a legibilidade do código para quem revisa.

## 📌 Resumo

Depois desta aula, o autor já sabe declarar os 8 tipos primitivos do Java, escolher o tipo certo para cada faixa de valor, aplicar casting explícito entendendo o risco de truncamento, usar `var` para inferência de tipo e diferenciar tipo primitivo de tipo referência (`String`).

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/Aula02/Desafio01_Facil.java) | 🟢 Fácil | — |

## 📚 Referências

- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- Curso Java — DevDojo

## 📈 Evolução

```
Java Core

███████████████░░░░░ 73%
```

## 🔗 Próximo Conteúdo

➡️ Polimorfismo
