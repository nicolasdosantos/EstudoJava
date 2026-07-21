# ☕ Aula 03 — Strings e Concatenação

> Concatenação de `String` com outros tipos (double, texto) para montar uma frase única.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Conclu%C3%ADda-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Aula de prática sobre `String` em Java: como concatenar texto com outros tipos primitivos/objetos (`double`, `String`) usando o operador `+` para montar uma única frase de saída. Base para qualquer geração de mensagens, logs ou textos dinâmicos em aplicações Java.

## 🎯 Objetivos de Aprendizagem

- Strings e concatenação — Aula03

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `String` | Tipo usado para armazenar texto (`nome`, `endereco`, `data`) |
| Concatenação com `+` | Junta `String` com outro `String` ou com tipo primitivo (`double salario`) em uma única frase, com conversão implícita para texto |

## 📂 Estrutura da Aula

```text
Aula03/Aula03.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula03.java](Aula03.java) | Declara variáveis `String` e `double` e concatena tudo em uma frase única via `System.out.println` |

## 💻 Trechos de Código Importantes

```java
String nome = "Nicolas";
double salario = 1500.00;
System.out.println("Eu " + nome + ", ... confrimo que recebi o salário de " + salario + ", na data " + data);
```

O `+` concatena `String` com `String` e com `double` na mesma expressão — o `double` é convertido automaticamente para texto durante a concatenação.

## ⚠️ Erros Comuns

- Erro de digitação identificado no próprio código desta aula: `"confrimo"` no lugar de `"confirmo"` — comum em strings literais grandes escritas de uma vez, sem revisão.

## ✅ Boas Práticas

- Preferir `String.format` ou text blocks para frases longas com várias variáveis, em vez de encadear muitos `+` — fica mais legível e menos sujeito a erro de digitação como o encontrado acima.

## 📌 Resumo

Após esta aula, o autor já é capaz de concatenar `String` com outros tipos primitivos para montar mensagens de saída dinâmicas em Java.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/Aula03/Desafio01_Facil.java) | 🟢 Fácil | — |

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
