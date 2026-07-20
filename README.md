# ☕ Estudo Java

Repositório com meus estudos da linguagem **Java**, organizado por aulas. Aqui documento minha evolução, do básico da linguagem até tópicos mais avançados, com exemplos práticos e comentados.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-em%20andamento-brightgreen?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/aulas-9-blue?style=for-the-badge" alt="Aulas" />
</p>

---

## 📌 Sobre

Este projeto registra meu aprendizado em Java de forma incremental. **Cada pasta representa uma aula**, com um ou mais arquivos `.java` de exemplo prático e comentários explicando os conceitos estudados.

## 📊 Progresso

| Aula | Tema | Status |
|---|---|---|
| [Aula01](Aula01/) | Primeiro programa | ✅ |
| [Aula02](Aula02/) | Tipos primitivos e variáveis | ✅ |
| [Aula03](Aula03/) | Strings e concatenação | ✅ |
| [Aula04](Aula04/) | Operadores | ✅ |
| [Aula05](Aula05/) | Condicionais, ternário e switch | ✅ |
| [Aula06](Aula06/) | Estruturas de repetição | ✅ |
| [Aula07](Aula07/) | Arrays | ✅ |
| [Aula08](Aula08/) | Arrays multidimensionais | ✅ |
| [Aula09](Aula09/) | Orientação a Objetos | 🔄 em andamento |

## 📚 Conteúdo por aula

Clique em uma aula para ver os tópicos praticados e os arquivos principais.

<details>
<summary><strong>Aula01</strong> — Primeiro programa</summary>

Introdução à sintaxe do Java: estrutura de uma classe e saída no console.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Sintaxe básica | Estrutura de classe, método `main`, `System.out.println` | [Aula01.java](Aula01/Aula01.java) |

</details>

<details>
<summary><strong>Aula02</strong> — Tipos primitivos e variáveis</summary>

Tipos primitivos, conversão de tipos e inferência de tipo.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Tipos e casting | `int`/`long`/`double`/`boolean`/`char`, *casting* `long`→`int`, `var` | [Aula02.java](Aula02/Aula02.java) |

</details>

<details>
<summary><strong>Aula03</strong> — Strings e concatenação</summary>

Prática de concatenação de `String` com diferentes tipos.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Strings | Concatenação de `String`, `double` e texto | [Aula03.java](Aula03/Aula03.java) |

</details>

<details>
<summary><strong>Aula04</strong> — Operadores</summary>

Todos os operadores da linguagem em um só lugar.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Operadores | Aritméticos, relacionais, lógicos, atribuição, incremento/decremento | [Aula04.java](Aula04/Aula04.java) |

</details>

<details>
<summary><strong>Aula05</strong> — Condicionais, ternário e switch</summary>

Estruturas de decisão, do `if` básico ao `switch` com *fallthrough*.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| if/else | Condição básica e negação lógica | [Aula05.java](Aula05/Aula05.java) |
| Ternário | `condição ? a : b` reescrevendo um if/else | [Aula05pt3.java](Aula05/Aula05pt3.java) |
| switch/case | Seleção por valor, incluindo *fallthrough* | [Aula05pt4Ex.java](Aula05/Aula05pt4Ex.java) |

</details>

<details>
<summary><strong>Aula06</strong> — Estruturas de repetição</summary>

Laços de repetição e controle de fluxo com `break`.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| while / do-while / for | As três formas de repetição | [Aula06.java](Aula06/Aula06.java) |
| break | Interrupção do laço ao atingir uma condição | [Aula06Ex3.java](Aula06/Aula06Ex3.java) |

</details>

<details>
<summary><strong>Aula07</strong> — Arrays</summary>

Criação de arrays, valores padrão e formas de percorrer.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Criação e leitura | Array de `int` com `new`, atribuição por índice | [Aula07.java](Aula07/Aula07.java) |
| Valores padrão | `0` para numéricos, `null` para `String` | [Aula07pt2.java](Aula07/Aula07pt2.java) |
| Inicialização e for-each | Formas de inicializar e percorrer | [Aula07pt3.java](Aula07/Aula07pt3.java) |

</details>

<details>
<summary><strong>Aula08</strong> — Arrays multidimensionais</summary>

Matrizes e arrays com linhas de tamanhos diferentes.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Matrizes | `int[3][3]`, `for` e `for-each` aninhados | [Aula08.java](Aula08/Aula08.java) |
| Jagged arrays | Linhas de tamanhos diferentes | [Aula08pt2.java](Aula08/Aula08pt2.java) |

</details>

<details open>
<summary><strong>Aula09</strong> — Programação Orientada a Objetos <em>(em andamento)</em></summary>

Primeiros passos em POO: da criação de classes até encapsulamento e sobrecarga de métodos.

| Tópico | Conceito praticado | Arquivo |
|---|---|---|
| Classes e Objetos | Classe de domínio, instanciação com `new` | [Estudante.java](Aula09/introducaoClasses/dominio/Estudante.java) |
| Métodos e varargs | Com/sem retorno, parâmetros, `int... num` | [Calculadora.java](Aula09/IntroducaoMetodo/dominio/Calculadora.java) |
| Valor vs. referência | Mutação de atributo de objeto dentro do método | [EstudanteTeste.java](Aula09/IntroducaoMetodo/teste/EstudanteTeste.java) |
| Encapsulamento | Atributos `private`, `get`/`set` com validação | [Pessoa.java](Aula09/IntroducaoMetodo/dominio/Pessoa.java) |
| Array como atributo | Array `private` com `get`/`set` e cálculo de média | [Funcionario.java](Aula09/Exercicio/dominio/Funcionario.java) |
| Sobrecarga (*overloading*) | Mesmo método, assinaturas diferentes | [Anime.java](Aula09/SobracargaMetodos/dominio/Anime.java) |
| Construtores | Construtor sobrecarregado, encadeamento com `this(...)` | [Anime.java](Aula09/ConstrutoresMetodos/dominio/Anime.java) |
| Bloco de inicialização | Bloco `{ }` de instância, executado antes do construtor | [Anime.java](Aula09/BlocosInicializacao/dominio/Anime.java) |
| Modificador `static` | Atributo, bloco `static{ }` e métodos de classe (compartilhados entre objetos) | [Carro.java](Aula09/ModificadoresEstatico/dominio/Carro.java) |
| Leitura de dados | `Scanner` para entrada do usuário (`nextLine`, `nextInt`, `next()`) | [LeituraDados01.java](Aula09/LeituraDados/LeituraDados01.java) |
| Associação entre objetos | Referência "um" (`Jogador`→`Time`) e "muitos" (`Time`→`Jogador[]`), associação bidirecional montada manualmente | [Jogador.java](Aula09/Associacao/dominio/Jogador.java) |

Ainda não aborda herança e interfaces.

</details>

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

- Praticar lógica de programação e fixar as particularidades da linguagem Java
- Construir uma base sólida para tópicos mais avançados (POO, coleções, exceções, Spring Boot)

## 🗺️ Próximos passos

- [x] Laços de repetição (`for`, `while`, `do-while`)
- [x] Arrays e Strings avançado
- [x] Arrays multidimensionais
- [ ] Programação Orientada a Objetos (classes, atributos, métodos, construtores) — em andamento (classes, atributos, métodos e construtores já estudados)
- [x] Encapsulamento (atributos `private` com `get`/`set` e validação)
- [x] Sobrecarga de métodos (overloading)
- [x] Construtores (sobrecarga de construtores, encadeamento com `this(...)`)
- [x] Associação entre objetos (referência "um" e "muitos", associação bidirecional)
- [ ] Herança e polimorfismo
- [ ] Coleções (`List`, `Map`, `Set`)
- [ ] Tratamento de exceções (`try`/`catch`)

## ✍️ Autor

Feito por **Nicolas** durante meus estudos em Java.

---

⭐ Se este repositório te ajudou de alguma forma, deixe uma estrela!
