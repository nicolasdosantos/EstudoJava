# ☕ Estudo Java

Repositório com meus estudos da linguagem **Java**, organizado por aulas. Aqui documento minha evolução, do básico da linguagem até tópicos mais avançados, com exemplos práticos e comentados.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-em%20andamento-brightgreen?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/aulas-9-blue?style=for-the-badge" alt="Aulas" />
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
├── Aula07/   → Arrays (vetores)
├── Aula08/   → Arrays multidimensionais (matrizes)
└── Aula09/   → Introdução a Classes, Objetos e Métodos (POO)
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

---

### 📁 [Aula08](Aula08/) — Arrays multidimensionais (matrizes)

Arrays de duas dimensões (arrays de arrays): declaração, atribuição por índice, arrays "jagged" (linhas de tamanhos diferentes) e percorrimento com `for` aninhado e `for-each` aninhado.

| Arquivo | Descrição |
|---|---|
| [Aula08.java](Aula08/Aula08.java) | Matriz `int[3][3]` (meses x dias), atribuição por índice `[i][j]` e percorrimento com `for` tradicional e `for-each` aninhados |
| [Aula08pt2.java](Aula08/Aula08pt2.java) | Arrays multidimensionais "jagged" (linhas de tamanhos diferentes) usando `new int[3][]`, atribuindo arrays existentes e literais a cada linha |

---

### 📁 [Aula09](Aula09/) — Introdução a Classes, Objetos e Métodos (POO)

Primeiros passos em Programação Orientada a Objetos. Em `introducaoClasses`: criação de classes de domínio com atributos públicos, instanciação de objetos com `new`, atribuição de valores e diferença entre variáveis independentes e referências para o mesmo objeto. Em `IntroducaoMetodo`: criação de métodos (sem retorno, com parâmetros, com retorno de valor e com varargs), método definido na própria classe de domínio, e diferença entre passagem de parâmetro por valor (tipos primitivos) e por referência (objetos) — incluindo a mutação de um atributo do objeto dentro do método. Em `Exercicio`: aplicação prática combinando métodos com array como atributo da classe. Organizado em subpacotes `dominio` (classes) e `teste` (classes com `main` que instanciam e usam essas classes).

| Arquivo | Descrição |
|---|---|
| [introducaoClasses/dominio/Carro.java](Aula09/introducaoClasses/dominio/Carro.java) | Classe de domínio `Carro` com atributos `nome`, `modelo` e `ano` |
| [introducaoClasses/dominio/Estudante.java](Aula09/introducaoClasses/dominio/Estudante.java) | Classe de domínio `Estudante` com atributos `nome`, `idade` e `sexo` |
| [introducaoClasses/dominio/Professor.java](Aula09/introducaoClasses/dominio/Professor.java) | Classe de domínio `Professor` com atributos `nome`, `idade` e `sexo` |
| [introducaoClasses/teste/CarroExerc.java](Aula09/introducaoClasses/teste/CarroExerc.java) | Instanciação de dois objetos `Carro` independentes, com nota de estudo sobre o comportamento de referência ao atribuir um objeto a outro (`carro = carro2`) |
| [introducaoClasses/teste/EstudanteTeste01.java](Aula09/introducaoClasses/teste/EstudanteTeste01.java) | Instanciação de `Estudante`, atribuição de valores aos atributos e impressão |
| [introducaoClasses/teste/EstudanteTeste02.java](Aula09/introducaoClasses/teste/EstudanteTeste02.java) | Instanciação simples de `Estudante`, atribuindo apenas o atributo `nome` |
| [introducaoClasses/teste/ProfessorTeste01.java](Aula09/introducaoClasses/teste/ProfessorTeste01.java) | Instanciação de `Professor`, atribuição de valores aos atributos e impressão |
| [IntroducaoMetodo/dominio/Calculadora.java](Aula09/IntroducaoMetodo/dominio/Calculadora.java) | Classe `Calculadora` com métodos sem retorno (`soma`, `sub`, `mult`), método com retorno (`divi`), método demonstrando que parâmetros primitivos recebem cópia do valor (`alt`), método recebendo array (`somArray`) e método com varargs (`somaVarArgs`) |
| [IntroducaoMetodo/dominio/Estudante.java](Aula09/IntroducaoMetodo/dominio/Estudante.java) | Classe de domínio `Estudante` com atributos `nome`, `idade` e `sexo`, e método próprio `imprime()` |
| [IntroducaoMetodo/dominio/ImprimeEstudante.java](Aula09/IntroducaoMetodo/dominio/ImprimeEstudante.java) | Classe com método `imprime` que recebe um objeto `Estudante` como parâmetro e altera o atributo `nome` desse objeto |
| [IntroducaoMetodo/teste/CalculadoraTeste01.java](Aula09/IntroducaoMetodo/teste/CalculadoraTeste01.java) | Chamada do método `soma` (sem parâmetros e sem retorno) |
| [IntroducaoMetodo/teste/Calculadora02.java](Aula09/IntroducaoMetodo/teste/Calculadora02.java) | Chamada do método `divi` (com parâmetros e retorno de valor) |
| [IntroducaoMetodo/teste/CalculadoraTeste03.java](Aula09/IntroducaoMetodo/teste/CalculadoraTeste03.java) | Chamada do método `alt`, demonstrando que a alteração de parâmetros primitivos dentro do método não afeta as variáveis originais |
| [IntroducaoMetodo/teste/CalculadoraTeste05.java](Aula09/IntroducaoMetodo/teste/CalculadoraTeste05.java) | Comparação entre chamar `somArray` (passando um array já montado) e `somaVarArgs` (passando os valores direto, sem montar array) |
| [IntroducaoMetodo/teste/EstudanteTeste.java](Aula09/IntroducaoMetodo/teste/EstudanteTeste.java) | Passagem de objetos `Estudante` para o método `imprime`, demonstrando passagem por referência e que a alteração do atributo `nome` dentro do método persiste após a chamada |
| [IntroducaoMetodo/teste/EstudanteTeste02.java](Aula09/IntroducaoMetodo/teste/EstudanteTeste02.java) | Instanciação de `Estudante` chamando o método `imprime()` definido na própria classe, sem depender de `ImprimeEstudante` |
| [Exercicio/dominio/Funcionario.java](Aula09/Exercicio/dominio/Funcionario.java) | Classe `Funcionario` com atributo array (`salario`), método `imprime()` e método `media()` que percorre o array, com checagem de `null` para array não inicializado |
| [Exercicio/teste/FuncionaTeste.java](Aula09/Exercicio/teste/FuncionaTeste.java) | Instanciação de `Funcionario`, atribuição de um array de salários e chamada dos métodos `imprime()` e `media()` |

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
- [x] Arrays multidimensionais
- [ ] Programação Orientada a Objetos (classes, atributos, métodos, construtores) — em andamento (classes, atributos e métodos já estudados)
- [ ] Encapsulamento, herança e polimorfismo
- [ ] Coleções (`List`, `Map`, `Set`)
- [ ] Tratamento de exceções (`try`/`catch`)

## ✍️ Autor

Feito por **Nicolas** durante meus estudos em Java.

---

⭐ Se este repositório te ajudou de alguma forma, deixe uma estrela!
