# ☕ Aula09 — Leitura de Dados (Scanner)

> Leitura de entrada do usuário via teclado com `Scanner`, usando o método correto para cada tipo de dado.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Estudo de como capturar dados digitados pelo usuário durante a execução do programa, usando `java.util.Scanner` sobre `System.in`. Diferente de linguagens dinâmicas onde um único `input()` resolve tudo, Java exige o método certo para cada tipo (`String`, `int`, `char`) — base para qualquer programa interativo de console.

## 🎯 Objetivos de Aprendizagem

- Ler entrada do usuário via `Scanner` — `nextLine()`, `nextInt()`, `next().charAt(0)`

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `Scanner` | Classe padrão do Java para ler `System.in` (teclado) |
| `nextLine()` | Lê uma linha inteira de texto (`String`) |
| `nextInt()` | Lê um valor numérico inteiro |
| `next().charAt(0)` | Lê uma palavra e extrai o primeiro caractere, útil para capturar um `char` (ex: M/F) |

## 📂 Estrutura da Aula

```text
Aula09/LeituraDados/
├── LeituraDados01.java
└── LeituraDados02.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [LeituraDados01.java](LeituraDados01.java) | Demonstra os três métodos básicos de leitura: nome (`nextLine`), idade (`nextInt`) e sexo (`next().charAt(0)`) |
| [LeituraDados02.java](LeituraDados02.java) | "Software de previsão" que lê uma pergunta e responde sim/não a partir do primeiro caractere digitado |

## 💻 Trechos de Código Importantes

```java
System.out.println("---- Sexo(M/F): ----");
// next() le só uma palavra (para no espaço) e charAt(0) pega o primeiro caractere -
// assim da pra guardar M/F num char em vez de precisar de uma String inteira
char sexo = input.next().charAt(0);
```

`next()` só lê até o próximo espaço em branco, diferente de `nextLine()`, que lê a linha toda — por isso é a escolha certa para capturar uma única letra sem precisar de uma `String` completa.

## 🔄 Fluxo da Implementação

```text
Scanner → Entrada → Objeto → Resultado
```

## ⚠️ Erros Comuns

- Em `LeituraDados02.java`, se o usuário apertar Enter sem digitar nada, `pergunta` fica como `String` vazia e `charAt(0)` lança `StringIndexOutOfBoundsException` (índice 0 não existe numa string vazia) — erro real registrado no comentário do próprio código, ainda sem tratamento (`try/catch` ou verificação de `isEmpty()` antes de acessar o índice).
- Dica geral de mercado (não ocorreu neste código, mas é comum): misturar `nextInt()`/`nextLine()` sem cuidado — `nextInt()` não consome o `\n` deixado no buffer, fazendo o `nextLine()` seguinte "pular" e retornar vazio. Vale ficar atento nisso ao evoluir os exercícios desta aula.

## ✅ Boas Práticas

- Usar o método de leitura correspondente ao tipo esperado, em vez de ler tudo como `String` e converter manualmente.
- Validar entrada do usuário antes de acessar índices de `String` (ex: checar `isEmpty()` antes de `charAt(0)`).

## 📌 Resumo

Já sei ler diferentes tipos de dado digitados pelo usuário via `Scanner`, escolhendo o método certo para cada tipo e reconhecendo o risco de acessar índice de `String` vazia.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../../Desafios/LeituraDados/Desafio01_Facil.java) | 🟢 Fácil | — |

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
