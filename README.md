# ☕ Estudo Java

Repositório com meus estudos da linguagem **Java**, organizado por aulas. Aqui documento minha evolução, do básico da linguagem até tópicos mais avançados, com exemplos práticos e comentados.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-em%20andamento-brightgreen?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/aulas-7-blue?style=for-the-badge" alt="Aulas" />
</p>

---

## 📌 Sobre

Este projeto tem como objetivo registrar meu aprendizado em Java de forma incremental. **Cada pasta representa uma aula**, contendo um ou mais arquivos `.java` com exemplos práticos e comentários explicando os conceitos estudados.

## 🗂️ Estrutura do repositório

```
EstudoJava/
├── Aula01/   → Primeiro programa e sintaxe básica
├── Aula02/   → Tipos primitivos, casting e variáveis
├── Aula03/   → Prática com variáveis e concatenação de strings
├── Aula04/   → Operadores aritméticos, relacionais, lógicos e de atribuição
├── Aula05/   → Condicionais, operador ternário e switch
├── Aula06/   → Estruturas de repetição (while, do-while, for)
└── Aula07/   → Arrays (vetores)
```

## 📚 Conteúdo por pasta

### 📁 [Aula01](Aula01/) — Primeiro programa

Introdução à sintaxe do Java: estrutura de uma classe, método `main` e saída no console.

| Arquivo | Descrição |
|---|---|
| [Aula01.java](Aula01/Aula01.java) | Programa clássico "Hello World" com `System.out.println` |

---

### 📁 [Aula02](Aula02/) — Tipos primitivos e variáveis

Tipos primitivos (`int`, `long`, `double`, `float`, `byte`, `short`, `boolean`, `char`), a diferença entre tipos primitivos e tipo de referência (`String`), *casting* de valores e inferência de tipo com `var`.

| Arquivo | Descrição |
|---|---|
| [Aula02.java](Aula02/Aula02.java) | Declaração dos tipos primitivos, *casting* de `long` para `int` (com perda de precisão), `String` como tipo de referência e uso de `var` |

---

### 📁 [Aula03](Aula03/) — Prática com variáveis e strings

Exercício de fixação da Aula02, aplicando variáveis de diferentes tipos em uma concatenação de `String` mais elaborada.

| Arquivo | Descrição |
|---|---|
| [Aula03.java](Aula03/Aula03.java) | Concatenação de `String`, `double` e texto formando uma frase (declaração de recebimento de salário) |

---

### 📁 [Aula04](Aula04/) — Operadores

Operadores aritméticos, relacionais, lógicos, de atribuição e de incremento/decremento.

| Arquivo | Descrição |
|---|---|
| [Aula04.java](Aula04/Aula04.java) | Operadores aritméticos (`+ - * / %`), relacionais (`< > <= >= == !=`), lógicos (`&& \|\| !`), de atribuição (`+= -= *= /= %=`) e incremento/decremento (`++ --`), incluindo diferença entre pré e pós-incremento |

---

### 📁 [Aula05](Aula05/) — Condicionais, ternário e switch

Estruturas de decisão: `if`/`else`, `if`/`else if`/`else`, operador ternário e `switch`/`case`, com exercícios práticos de faixa salarial, categoria por idade e dia da semana.

| Arquivo | Descrição |
|---|---|
| [Aula05.java](Aula05/Aula05.java) | `if`/`else` básico e operador de negação `!` |
| [Aula05Ex.java](Aula05/Aula05Ex.java) | Exercício: cálculo de imposto por faixa salarial com `if`/`else if`/`else` |
| [Aula05pt2.java](Aula05/Aula05pt2.java) | Classificação por categoria de idade (infantil / juvenil / adulta) com `if`/`else if`/`else` |
| [Aula05pt3.java](Aula05/Aula05pt3.java) | Operador ternário (`condição ? valorA : valorB`) reescrevendo um `if`/`else` |
| [Aula05pt4.java](Aula05/Aula05pt4.java) | `switch`/`case` para dia da semana e verificação de sexo |
| [Aula05pt4Ex.java](Aula05/Aula05pt4Ex.java) | Exercício: dia útil vs. fim de semana com `switch`, incluindo *fallthrough* de `case` |

---

### 📁 [Aula06](Aula06/) — Estruturas de repetição

Laços de repetição `while`, `do`/`while` e `for`, além de exercícios aplicando a palavra-chave `break` para interromper o laço quando uma condição é atingida.

| Arquivo | Descrição |
|---|---|
| [Aula06.java](Aula06/Aula06.java) | Introdução a `while`, `do`/`while` e `for`, imprimindo uma contagem de 0 a 10 em cada estrutura |
| [Aula06Ex.java](Aula06/Aula06Ex.java) | Exercício: impressão de todos os números pares de 0 a 100 usando `for` e o operador `%` |
| [Aula06Ex2.java](Aula06/Aula06Ex2.java) | Exercício: impressão dos números até um valor dado, interrompendo o laço com `break` ao passar de 25 |
| [Aula06Ex3.java](Aula06/Aula06Ex3.java) | Exercício: cálculo do número de parcelas de um carro até que o valor da parcela atinja o mínimo de R$1000, usando `for` e `break` |

---

### 📁 [Aula07](Aula07/) — Arrays (vetores)

Declaração e uso de arrays (vetores), valores padrão de cada tipo primitivo, diferentes formas de inicialização e percorrimento com `for` tradicional e `for-each`.

| Arquivo | Descrição |
|---|---|
| [Aula07.java](Aula07/Aula07.java) | Criação de um array de `int` com `new`, atribuição de valores por índice e leitura |
| [Aula07pt2.java](Aula07/Aula07pt2.java) | Valores padrão de um array não inicializado (`0` para numéricos, `null` para `String`) e percorrimento de um array de `String` com `for` |
| [Aula07pt3.java](Aula07/Aula07pt3.java) | Formas de inicialização de array (`new int[3]`, `{1,2,3}`, `new int[]{...}`) e percorrimento com `for` tradicional e `for-each` |

## 🚀 Como executar

Certifique-se de ter o **JDK** instalado ([Adoptium Temurin](https://adoptium.net/) ou similar).

```bash
# Compilar
javac AulaXX/Arquivo.java

# Executar
java -cp AulaXX Arquivo
```

Exemplo prático:

```bash
javac Aula05/Aula05pt4Ex.java
java -cp Aula05 Aula05pt4Ex
```

## 🎯 Objetivo

- Fixar os fundamentos da linguagem Java
- Praticar lógica de programação
- Construir uma base sólida para tópicos mais avançados (POO, coleções, tratamento de exceções, etc.)

## 🗺️ Próximos passos

- [x] Laços de repetição (`for`, `while`, `do-while`)
- [x] Arrays e Strings avançado
- [ ] Programação Orientada a Objetos (classes, atributos, métodos, construtores)
- [ ] Encapsulamento, herança e polimorfismo
- [ ] Coleções (`List`, `Map`, `Set`)
- [ ] Tratamento de exceções (`try`/`catch`)

## ✍️ Autor

Feito por **Nicolas** durante meus estudos em Java.

---

⭐ Se este repositório te ajudou de alguma forma, deixe uma estrela!
