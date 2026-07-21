# ☕ Aula 08 — Arrays Multidimensionais

> Matrizes (`int[][]`) com tamanho fixo e arrays "jagged" (linhas de tamanhos diferentes), percorridos com `for` tradicional e for-each aninhados.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Conclu%C3%ADda-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Extensão do conceito de array (Aula07) para duas dimensões: um array de arrays. Serve para representar dados em forma de tabela/grade — como uma matriz de meses x dias, ou um mapa de assentos de cinema. Aqui também aparece a variação "jagged" (linhas com tamanhos diferentes), que é a forma real como Java implementa arrays multidimensionais internamente.

## 🎯 Objetivos de Aprendizagem

- Arrays multidimensionais (matrizes) — Aula08

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `int[][]` com tamanho fixo | `new int[3][3]` cria uma matriz retangular, com todas as linhas do mesmo tamanho |
| Array jagged | `new int[3][]` declara só a quantidade de linhas; cada linha é um array independente, podendo ter tamanho diferente (`arryInt[0] = new int[]{1,2}`) |
| Inicialização direta | `int arryInt2[][] = {{1,2},{1,2,3},{1,2,3,4,5,6}}` — inicializa a matriz jagged sem precisar do `new` explícito por linha |
| `for` aninhado com `.length` | `dias.length` (quantidade de linhas) e `dias[i].length` (tamanho da linha `i`, que pode variar) |
| for-each aninhado | `for (int[] is : dias)` seguido de `for (int js : is)` — mesma varredura, sintaxe mais enxuta |

## 📂 Estrutura da Aula

```text
Aula08/Aula08.java
Aula08/Aula08pt2.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula08.java](Aula08.java) | Matriz `int[3][3]` de tamanho fixo (meses x dias), percorrida com `for` tradicional e depois com for-each |
| [Aula08pt2.java](Aula08pt2.java) | Array jagged: `int[3][]` com linhas de tamanhos diferentes (2, 3 e 6 elementos), declarado tanto por atribuição linha a linha quanto por inicialização direta |

## 💻 Trechos de Código Importantes

```java
int arryInt[][] = new int[3][];

arryInt[0] = new int[]{1,2};
arryInt[1] = array;
arryInt[2] = new int[]{1,2,3,4,5,6};
```

Ao declarar só a quantidade de linhas (`new int[3][]`), cada posição do array externo começa como `null` até receber seu próprio array — por isso cada linha pode ter um tamanho diferente, diferente da matriz `new int[3][3]` de `Aula08.java`, onde todas as linhas nascem com 3 colunas.

## 🔄 Fluxo da Implementação

```text
matriz[linha][coluna]
   │        │
   │        └─ índice dentro do array daquela linha (dias[i].length)
   └────────── índice do array externo (dias.length)

dias  → [ linha0, linha1, linha2 ]
                     │
                     └─ linha1 → [ dia0, dia1, dia2 ]
```

## ⚠️ Erros Comuns

- Assumir que toda matriz tem colunas de tamanho fixo — em Java, `int[][]` é sempre um array de arrays, então nada impede (e às vezes é proposital, como em `Aula08pt2.java`) que cada linha tenha um tamanho diferente.
- Usar um número fixo (ex: `3`) no lugar de `.length` ao percorrer a matriz — quebra assim que o tamanho de uma linha muda, especialmente em arrays jagged.

## ✅ Boas Práticas

- Preferir for-each (`for (int[] is : dias)`) quando não é necessário o índice `i`/`j` — mais legível e evita erro de limite manual.
- Usar `dias[i].length` (não um valor fixo) ao percorrer cada linha, já que em uma matriz jagged o tamanho varia por linha.

## 📌 Resumo

Depois desta aula, o autor já consegue declarar e percorrer matrizes de tamanho fixo e arrays jagged, entendendo que um array multidimensional em Java é, na prática, um array de arrays — cada linha é um objeto array independente.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../Desafios/Aula08/Desafio01_Medio.java) | 🟡 Médio | — |

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
