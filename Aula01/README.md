# ☕ Aula 01 — Sintaxe Básica

> Primeiro contato com a estrutura de um programa Java: classe, método `main` e saída no console.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Conclu%C3%ADda-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Ponto de partida do curso: como um programa Java é estruturado (classe pública, método `main` como ponto de entrada) e como imprimir uma mensagem no console com `System.out.println`. É a base sobre a qual todo o restante do aprendizado em Java é construído.

## 🎯 Objetivos de Aprendizagem

- Sintaxe básica (estrutura de classe, `main`, `System.out.println`)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `public class` | Declaração de uma classe pública — em Java, o nome do arquivo `.java` precisa bater com o nome da classe pública que ele contém |
| `public static void main(String[] args)` | Assinatura fixa do método de entrada da JVM — é por aqui que a execução do programa começa |
| `System.out.println` | Escreve uma linha de texto na saída padrão (console) |

## 📂 Estrutura da Aula

```text
Aula01/
└── Aula01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula01.java](Aula01.java) | Primeiro programa: imprime uma mensagem fixa no console |

## 💻 Trechos de Código Importantes

```java
public class Aula01 {
    public static void main(String[] args) {
        System.out.println("Hellow World");
    }
}
```

Estrutura mínima de um programa Java: uma classe pública cujo nome bate com o do arquivo, e o método `main` como ponto de entrada executado pela JVM.

## ⚠️ Erros Comuns

- Digitar `Hellow World` em vez de `Hello World` — erro de digitação real deixado no código desta aula, sem impacto na compilação (é só uma string), mas vale o hábito de revisar strings de saída.
- Nomear o arquivo `.java` diferente do nome da classe pública — em Java isso impede a compilação, diferente de linguagens dinâmicas onde o nome do arquivo é irrelevante.

## ✅ Boas Práticas

- Manter um único ponto de entrada (`main`) por programa simples, evitando lógica de negócio direto nele conforme os programas crescerem.

## 📌 Resumo

Depois desta aula, o autor já é capaz de estruturar e executar o programa Java mais básico possível: uma classe com `main` imprimindo uma mensagem no console.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/Aula01/Desafio01_Facil.java) | 🟢 Fácil | — |

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
