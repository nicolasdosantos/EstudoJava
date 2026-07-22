# ☕ Aula 02 — Tipos Primitivos e Casting

*Fundamentos · Curso Java (DevDojo)*

> Registro pessoal dessa aula, escrito por mim mesmo — sem tom de ficha técnica, do jeito que eu realmente pensei sobre o assunto enquanto estudava.

| Status | Categoria | Progresso na trilha |
|---|---|---|
| ✅ Concluída | Fundamentos | 73% |

---

## 💭 Antes dessa aula

Depois de fixar a estrutura mínima de um programa na Aula01, chegou a hora de entender como o Java representa dado — e essa foi a primeira vez que percebi o quanto a linguagem é rígida com tipos, comparado ao que eu conhecia em JS/Python.

---

## 📖 O que eu estudei

Aprendi os 8 tipos primitivos do Java (`int`, `long`, `double`, `float`, `byte`, `short`, `boolean`, `char`) e entendi que cada um tem uma faixa de valores e um tamanho de memória diferente — não é só "número" ou "texto" como em linguagens dinâmicas.

Também vi que o compilador exige conversão explícita (*casting*) quando existe risco real de perda de dado, e testei isso na prática forçando um valor `long` gigante a caber num `int`. Por fim, usei `var` pela primeira vez (inferência de tipo — o tipo continua estático, só a escrita fica implícita) e reforcei que `String` não é tipo primitivo, é tipo referência.

---

## 🧠 Conceitos que ficaram comigo

| Conceito | O que entendi |
|---|---|
| Tipos primitivos numéricos | `int`, `long`, `double`, `float`, `byte`, `short` — cada um com faixa e tamanho de memória próprios |
| `boolean` e `char` | Tipos primitivos não numéricos: `boolean` (`true`/`false`) e `char` (um único caractere entre aspas simples) |
| Sufixos literais (`L`, `D`, `F`) | Indicam ao compilador o tipo exato do literal (`100000L` é `long`, `2000.0D` é `double`, `2500.0F` é `float`) |
| Casting explícito | `(int) 10000000000L` força a conversão de `long` pra `int`, truncando os bytes que não cabem |
| `var` | Inferência de tipo pelo compilador — o tipo continua estático, só a escrita é implícita |
| Tipo referência vs. primitivo | `String` é tipo referência (objeto), diferente dos tipos primitivos |

---

## 💻 O trecho que eu quero guardar

```java
// casting - Força o java a aceitar esse valor, porem ele corta os byte para fazer caber no valor int
int idade = (int) 10000000000L;
```

Escrevi esse comentário na hora pra não esquecer o que estava acontecendo: `10000000000L` passa longe da faixa de `int` (~2,1 bilhões no máximo). O `(int)` não arredonda nem lança erro — ele trunca os bits que não cabem e devolve um valor truncado, sem avisar nada. Guardei isso como um dos primeiros "cuidados de adulto" que Java me ensinou.

---

## 🔄 Como eu visualizei esse fluxo

```text
long (10000000000L) → (int) casting → int truncado (sem erro de compilação)
```

---

## ✅ O que eu levo dessa aula

- Preferir o tipo primitivo que realmente corresponde à faixa de valor esperada, em vez de usar `long` "por segurança" onde `int` já basta.
- Usar `var` só quando o tipo já fica óbvio pelo valor atribuído — abusar disso em declarações onde o tipo não é óbvio prejudica quem revisa meu código depois.
- Sempre conferir se um valor cabe na faixa do tipo de destino antes de fazer casting explícito, já que o Java trunca silenciosamente em vez de avisar.

---

## 📌 O que eu já sei fazer sozinho

Depois dessa aula, eu já sei declarar os 8 tipos primitivos do Java, escolher o tipo certo pra cada faixa de valor, aplicar casting explícito entendendo o risco de truncamento, usar `var` pra inferência de tipo e diferenciar tipo primitivo de tipo referência (`String`).

---

## 🏆 Exercício que eu resolvi

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/Aula02/Desafio01_Facil.java) | 🟢 Fácil | — |

---

## 📂 Arquivos dessa aula

```text
Aula02/
└── Aula02.java
```

---

## 🔗 O que eu estudo a seguir

➡️ **Aula03** — Strings e concatenação

---

## 📚 Onde eu fui buscar mais

- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- Curso Java — DevDojo

---

*Escrito por mim, Nicolas, enquanto estudava essa aula.* ✍️
