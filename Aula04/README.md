# ☕ Aula 04 — Operadores

> Operadores aritméticos, relacionais, lógicos, de atribuição e de incremento/decremento em Java.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Conclu%C3%ADda-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Aula sobre os operadores básicos da linguagem: aritméticos (`+`, `-`, `*`, `/`, `%`), relacionais (comparações que sempre retornam `boolean`), lógicos (`&&`, `||`), de atribuição composta (`+=`, `-=`, `*=`, `/=`, `%=`) e de incremento/decremento (`++`, `--`). Esse conjunto é a base para toda lógica condicional e de repetição estudada nas aulas seguintes.

## 🎯 Objetivos de Aprendizagem

- Operadores (aritméticos, relacionais, lógicos, atribuição) — Aula04

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Operadores aritméticos (`+`, `-`, `*`, `/`) | Operações numéricas básicas entre `int`/`double`/`float` |
| Resto da divisão (`%`) | Retorna o resto de uma divisão inteira, usado para checar múltiplos/paridade |
| Operadores relacionais (`<`, `>`, `<=`, `>=`, `==`, `!=`) | Comparam dois valores e sempre retornam `boolean` — inclusive comparando `int` com `double` (`10 == 10.0`) |
| Operadores lógicos (`&&`, `\|\|`) | Combinam expressões booleanas para regras compostas (ex: idade e salário juntos) |
| Operadores de atribuição composta (`+=`, `-=`, `*=`, `/=`, `%=`) | Forma resumida de reatribuir um valor com base no atual |
| Incremento/decremento (`++`, `--`) | Pré-incremento/decremento (`++x`) altera antes de usar o valor; pós-incremento/decremento (`x++`) usa o valor e só depois altera |

## 📂 Estrutura da Aula

```text
Aula04/Aula04.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula04.java](Aula04.java) | Demonstra todos os operadores da aula em sequência: aritméticos, resto, relacionais, lógicos, atribuição composta e incremento/decremento |

## 💻 Trechos de Código Importantes

```java
int contador2 = 0;
System.out.println(++contador2);
```

Exemplo de pré-incremento: `++contador2` incrementa o valor antes de ser usado no `println`, então o valor impresso já é `1`. Se fosse `contador2++` (pós-incremento), o valor impresso seria `0`, e só depois a variável passaria a valer `1` — diferença que só importa quando o incremento é usado dentro de outra expressão, não numa linha isolada.

## ⚠️ Erros Comuns

- Confundir `=` (atribuição) com `==` (comparação), especialmente vindo de linguagens onde essa diferença é mais tolerante.
- Não perceber a diferença entre pré e pós-incremento (`++x` vs `x++`) quando o incremento é usado dentro da mesma expressão em que o valor é lido — no repositório isso está isolado em `println(++contador2)`, sem essa armadilha, mas é um erro comum em código real.

## ✅ Boas Práticas

- Nomear variáveis booleanas com prefixo `is`/`has` (ex: `isDezMaiorQueVinte`), como já feito no arquivo — deixa claro que o valor é uma condição, não um dado bruto.
- Preferir operadores de atribuição composta (`+=`) a `x = x + 1` quando a intenção é só atualizar o valor atual — mais idiomático e comum em revisão de código Java.

## 📌 Resumo

Após esta aula, o autor é capaz de escrever expressões aritméticas, comparações e condições lógicas compostas, e entende a diferença de comportamento entre pré e pós-incremento — base direta para condicionais (Aula05) e laços de repetição (Aula06).

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../Desafios/Aula04/Desafio01_Medio.java) | 🟡 Médio | — |

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
