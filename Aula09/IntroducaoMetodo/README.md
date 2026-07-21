# ☕ Aula09 — Métodos e Encapsulamento

> Introdução a métodos em Java (sem retorno, com parâmetros, com retorno, varargs) e a diferença entre atributos `public` e `private` com encapsulamento via `get`/`set`.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Esta pasta cobre a introdução a métodos: sem retorno (`void`), com parâmetros, com retorno de valor e varargs (`int... num`), além de mostrar como parâmetro primitivo não muda o valor original de quem chama. Também introduz encapsulamento (`Pessoa`), comparando atributo `public` (`Estudante`) com atributo `private` protegido por `get`/`set` com validação.

## 🎯 Objetivos de Aprendizagem

- Métodos — Aula09 (métodos sem retorno, com parâmetros, com retorno de valor, parâmetro varargs (`int... num`), método dentro da própria classe de domínio, diferença entre parâmetro por valor (primitivo) e por referência, incluindo mutação de atributo do objeto dentro do método)
- Encapsulamento — Aula09 (atributos `private` com métodos `get`/`set`, incluindo validação dentro do `set` para impedir valor inválido — algo impossível com atributo `public`)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `void` vs retorno | `soma()`, `sub()`, `mult()` só imprimem; `divi()` retorna `double`, permitindo reaproveitar o resultado |
| Parâmetros | `mult(int, int)` e `divi(double, double)` recebem valores para operar, em vez de números fixos |
| Parâmetro por valor (primitivo) | `alt(int num1, int num2)` altera os parâmetros dentro do método, mas isso não reflete na variável original de quem chamou — cópia, não referência |
| Varargs (`int...`) | `somaVarArgs(int... num)` aceita qualquer quantidade de argumentos na chamada, sem precisar montar um array antes; internamente o Java trata como array (funciona com for-each) |
| Array como parâmetro | `somArray(int[] num)` exige que o array já esteja pronto antes de chamar o método |
| Encapsulamento | `Pessoa` usa `private String nome` e `private int idade`, só acessíveis via `getNome()`/`setNome()`/`getIdade()`/`setIdade()` |
| Validação no `set` | `setIdade()` recusa valor negativo e imprime aviso, algo impossível de impedir com atributo `public` como em `Estudante` |

## 📂 Estrutura da Aula

```text
Aula09/IntroducaoMetodo/
├── dominio/
│   ├── Calculadora.java
│   ├── Estudante.java
│   ├── ImprimeEstudante.java
│   └── Pessoa.java
└── teste/
    ├── Calculadora02.java
    ├── CalculadoraTeste01.java
    ├── CalculadoraTeste03.java
    ├── CalculadoraTeste05.java
    ├── EstudanteTeste.java
    ├── EstudanteTeste02.java
    └── PessoaTeste.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Calculadora.java](dominio/Calculadora.java) | Métodos sem retorno, com parâmetros, com retorno e varargs |
| [Estudante.java](dominio/Estudante.java) | Atributos `public` e método `imprime()` próprio da classe, sem encapsulamento |
| [ImprimeEstudante.java](dominio/ImprimeEstudante.java) | Versão anterior de impressão em classe separada, usada como comparação |
| [Pessoa.java](dominio/Pessoa.java) | Atributos `private` com `get`/`set`, incluindo validação de idade |
| [CalculadoraTeste05.java](teste/CalculadoraTeste05.java) | Compara `somArray` (array pronto) com `somaVarArgs` (varargs) |
| [PessoaTeste.java](teste/PessoaTeste.java) | Demonstra uso de `set`/`get` em vez de acesso direto ao atributo |

## 💻 Trechos de Código Importantes

```java
public void setIdade(int idade){
    if(idade < 0){
        System.out.println("Idade invalida! ");
        return;
    }
    this.idade = idade;
}
```

O `set` só grava o valor se ele for válido — com atributo `public` (como em `Estudante`) não existe como impedir um valor inválido de ser atribuído por fora.

## ⚠️ Erros Comuns

- Achar que alterar um parâmetro primitivo dentro do método (`alt()`) muda a variável original de quem chamou — na verdade é uma cópia do valor.
- Tentar acessar `pessoa.idade` diretamente numa classe com atributo `private` — só compila via `getIdade()`/`setIdade()`.

## ✅ Boas Práticas

- Validar dados de entrada dentro do `set`, não confiar que quem chama sempre vai passar um valor correto.
- Preferir varargs quando a quantidade de argumentos é variável e não se quer obrigar quem chama a montar um array antes.

## 📌 Resumo

Depois desta pasta, o autor já sabe criar métodos com diferentes assinaturas (sem retorno, com parâmetros, com retorno, varargs) e sabe por que encapsular atributos com `private` + `get`/`set` protege a integridade do objeto, coisa que atributo `public` não garante.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/Metodos/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../../Desafios/Encapsulamento/Desafio01_Medio.java) | 🟡 Médio | — |

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
