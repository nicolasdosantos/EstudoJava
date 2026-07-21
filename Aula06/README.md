# ☕ Aula 06 — Estruturas de Repetição

> Uso de `while`, `do-while` e `for` para repetir blocos de código, incluindo controle de fluxo com `break` e `continue`.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Aula sobre estruturas de repetição em Java: `while`, `do-while` e `for`. Cobre também os comandos de controle de fluxo `break` (interrompe o laço) e `continue` (pula para a próxima iteração), aplicados em exercícios de números pares, parcelamento de valores e listagem de intervalos.

## 🎯 Objetivos de Aprendizagem

- Estruturas de repetição (`while`, `do-while`, `for`, `break`)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `while` | Repete o bloco enquanto a condição for verdadeira, testada antes de cada iteração |
| `do-while` | Executa o bloco pelo menos uma vez, testando a condição só depois da primeira execução |
| `for` | Laço com inicialização, condição e incremento definidos na própria declaração |
| `break` | Interrompe o laço imediatamente, saindo dele mesmo que a condição de repetição ainda seja verdadeira |
| `continue` | Pula o restante do bloco atual e vai direto para a próxima iteração do laço |

## 📂 Estrutura da Aula

```text
Aula06/Aula06.java
Aula06/Aula06Ex.java
Aula06/Aula06Ex2.java
Aula06/Aula06Ex3.java
Aula06/Aula06Ex4.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula06.java](Aula06.java) | Demonstração base das três estruturas de repetição: `while`, `do-while` e `for` |
| [Aula06Ex.java](Aula06Ex.java) | Exercício: imprime todos os números pares até 100 usando `for` e `%` |
| [Aula06Ex2.java](Aula06Ex2.java) | Exercício: imprime os primeiros 25 números a partir de um valor dado, usando `break` para interromper o laço |
| [Aula06Ex3.java](Aula06Ex3.java) | Exercício: calcula em quantas parcelas um valor pode ser dividido até a parcela ficar `>= 1000`, usando `break` |
| [Aula06Ex4.java](Aula06Ex4.java) | Mesmo problema de parcelamento do Ex3, mas percorrendo o laço em ordem decrescente e usando `continue` em vez de `break` |

## 💻 Trechos de Código Importantes

```java
do{
    System.out.println("Dentro do do while");
    count++;
}while(count < 10);
```

Diferença central do `do-while` em relação ao `while`: o bloco roda antes de qualquer verificação de condição — por isso é garantido que ele execute ao menos uma vez, mesmo que `count` já não satisfizesse `count < 10` (aqui `count` já havia chegado a 10 pelo `while` anterior, então o `do-while` roda só uma vez).

## ⚠️ Erros Comuns

- Usar `break` e `continue` como se fossem equivalentes: `break` sai do laço por completo (Aula06Ex2/Ex3), enquanto `continue` só pula a iteração atual e o laço segue (Aula06Ex4) — trocar um pelo outro muda o resultado do programa inteiro, não só uma linha.
- Esquecer que `do-while` executa o bloco antes de testar a condição — pode causar uma execução "extra" indesejada se a condição inicial já for falsa.

## ✅ Boas Práticas

- Preferir `for` quando o número de iterações é conhecido ou controlado por um contador (como nos exercícios de parcela), e reservar `while`/`do-while` para quando a repetição depende de uma condição externa ao contador.
- Usar `break`/`continue` com moderação: são úteis para casos como os desafios acima, mas laços com muitas saídas antecipadas tendem a ficar difíceis de acompanhar — vale reavaliar a condição do próprio laço antes de empilhar `break`s.

## 📌 Resumo

Depois desta aula, o autor é capaz de escolher a estrutura de repetição adequada a cada cenário (`while`, `do-while` ou `for`) e controlar o fluxo dentro do laço com `break` e `continue`, incluindo aplicá-los em problemas práticos de parcelamento de valores.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../Desafios/Aula06/Desafio01_Medio.java) | 🟡 Médio | — |

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
