# ☕ Aula 03 — Strings e Concatenação

*Fundamentos · Curso Java (DevDojo)*

> Registro pessoal dessa aula, escrito por mim mesmo — do jeito que eu realmente pensei sobre o assunto enquanto estudava, não uma ficha técnica genérica.

| Status | Categoria | Progresso na trilha |
|---|---|---|
| ✅ Concluída | Fundamentos | 73% |

---

## 💭 Antes dessa aula

Essa aula foi de prática direta em cima da Aula02 — inclusive deixei isso registrado num comentário no próprio código (`// Aula de pratica das informações da aula 02`). A ideia era pegar os tipos que eu tinha acabado de estudar e usar todos juntos numa `String` só.

---

## 📖 O que eu estudei

Concatenar `String` com outros tipos usando o operador `+` pra montar uma frase única de saída. Vi na prática que o `+` não exige que os dois lados sejam `String` — quando um dos lados é `String`, o Java converte automaticamente o outro lado (no meu caso, um `double`) pra texto antes de juntar tudo.

---

## 🧠 Conceitos que ficaram comigo

| Conceito | O que entendi |
|---|---|
| `String` | Tipo usado pra armazenar texto (nome, endereço, data) |
| Concatenação com `+` | Junta `String` com `String` ou com tipo primitivo (`double`) numa frase só, convertendo implicitamente pra texto |

---

## 💻 O trecho que eu quero guardar

```java
String nome = "Nicolas";
double salario = 1500.00;
System.out.println("Eu " + nome + ", ... confrimo que recebi o salário de " + salario + ", na data " + data);
```

Esse é o meu código real dessa aula: uma `String` monta a frase final concatenando texto com uma variável `double` (`salario`), que o Java converte automaticamente pra texto nessa operação.

---

## ✅ O que eu levo dessa aula

- Pra frases longas com várias variáveis, prefiro `String.format` ou text blocks a encadear muitos `+` — fica mais legível e mais fácil de revisar.
- Revisar a frase final de saída antes de considerar o programa pronto, principalmente quando ela é montada por concatenação longa.

---

## 📌 O que eu já sei fazer sozinho

Depois dessa aula, eu já sou capaz de concatenar `String` com outros tipos primitivos pra montar mensagens de saída dinâmicas em Java.

---

## 🏆 Exercício que eu resolvi

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/Aula03/Desafio01_Facil.java) | 🟢 Fácil | — |

---

## 📂 Arquivos dessa aula

```text
Aula03/
└── Aula03.java
```

---

## 🔗 O que eu estudo a seguir

➡️ **Aula04** — Operadores (aritméticos, relacionais, lógicos, atribuição)

---

## 📚 Onde eu fui buscar mais

- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- Curso Java — DevDojo

---

*Escrito por mim, Nicolas, enquanto estudava essa aula.* ✍️
