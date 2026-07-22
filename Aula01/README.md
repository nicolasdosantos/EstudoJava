# ☕ Aula 01 — Sintaxe Básica

*Fundamentos · Curso Java (DevDojo)*

> Esse README é o meu registro pessoal dessa aula — não é uma ficha técnica genérica, é como eu mesmo explicaria o que aprendi aqui, tanto pra quem for ler meu repositório quanto pro meu eu do futuro revisando isso daqui a alguns meses.

| Status | Categoria | Progresso na trilha |
|---|---|---|
| ✅ Concluída | Fundamentos | 73% |

---

## 💭 Antes dessa aula

Eu já tinha experiência com lógica de programação e orientação a objetos em outras linguagens (JS, TS, PHP, Python), mas nunca tinha escrito uma linha de Java. Essa foi minha porta de entrada na linguagem — antes de qualquer sintaxe específica, era sobre entender como um programa Java sequer começa a existir.

---

## 📖 O que eu estudei

Aqui eu aprendi a estrutura mínima que **todo** programa Java precisa ter: uma classe pública e um método `main` como ponto de entrada. É diferente do que eu conhecia em JS/Python, onde um script pode simplesmente ser uma sequência de instruções soltas no arquivo — em Java, tudo vive dentro de uma classe, sem exceção.

Também foi meu primeiro contato com `System.out.println`, o jeito mais direto de escrever algo na saída padrão (console) em Java.

---

## 🧠 Conceitos que ficaram comigo

| Conceito | O que entendi |
|---|---|
| `public class` | Declaração de uma classe pública — o nome do arquivo `.java` **precisa** bater com o nome dessa classe, senão não compila |
| `public static void main(String[] args)` | Assinatura fixa do método que a JVM chama pra começar a executar o programa |
| `System.out.println` | Escreve uma linha de texto no console |
| Nome do arquivo == nome da classe | Regra do Java, diferente de linguagens dinâmicas onde o nome do arquivo é só convenção — aqui é exigência do compilador |

---

## 💻 O trecho que eu quero guardar

```java
public class Aula01 {
    public static void main(String[] args) {
        // primeiro programa, só pra imprimir uma mensagem no console
        System.out.println("Hellow World");
    }
}
```

Esse é literalmente o meu primeiro código Java: uma classe pública com `main`, imprimindo uma mensagem fixa no console — a base estrutural que todo o resto do curso usa.

---

## ✅ O que eu levo dessa aula

- Manter um único ponto de entrada (`main`) simples, sem lógica de negócio direto nele — isso vai importar cada vez mais conforme os programas crescerem nas próximas aulas.
- Revisar sempre a saída no console antes de considerar o programa pronto, mesmo em algo tão simples quanto um `println`.

---

## 📌 O que eu já sei fazer sozinho

Depois dessa aula, eu já sou capaz de estruturar e executar o programa Java mais básico possível: uma classe com `main` imprimindo uma mensagem no console.

---

## 🏆 Exercício que eu resolvi

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/Aula01/Desafio01_Facil.java) | 🟢 Fácil | 10 |

---

## 📂 Arquivos dessa aula

```text
Aula01/
└── Aula01.java
```

---

## 🔗 O que eu estudo a seguir

➡️ **Aula02** — Tipos primitivos, casting e variáveis

---

## 📚 Onde eu fui buscar mais

- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- Curso Java — DevDojo

---

*Escrito por mim, Nicolas, enquanto estudava essa aula.* ✍️
