# ☕ Aula09 — Exercício: Array como Atributo

> Exercício prático combinando array `private` como atributo de uma classe, com `get`/`set` e cálculo de média.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Exercício de fixação sobre encapsulamento aplicado a um atributo do tipo array. A classe `Funcionario` guarda os salários em `double salario[]` como `private`, expondo acesso só via `get`/`set`, e usa esse array internamente para calcular uma média armazenada em outro atributo (`media`).

## 🎯 Objetivos de Aprendizagem

- Encapsulamento — Aula09 (atributos `private` com métodos `get`/`set`, incluindo validação dentro do `set` para impedir valor inválido)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `private` | Atributos `nome`, `idade`, `salario` e `media` só acessíveis de fora via `get`/`set` |
| Array como atributo | `salario` é um `double[]` guardado como atributo de instância, não parâmetro local |
| Atributo derivado | `media` deixou de ser variável local do método `media()` e virou atributo, para poder ser exposto por `getMedia()` (só get, sem set) |
| Null-check em array | Array não inicializado começa `null`; `imprime()` e `media()` checam isso antes de iterar |

## 📂 Estrutura da Aula

```text
Aula09/Exercicio
├── dominio/Funcionario.java
└── teste/FuncionaTeste.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Funcionario.java](dominio/Funcionario.java) | Classe de domínio com `nome`, `idade`, `salario[]` e `media`, todos `private` |
| [teste/FuncionaTeste.java](teste/FuncionaTeste.java) | Instancia `Funcionario`, popula via `set`, chama `imprime()` e `media()` |

## 💻 Trechos de Código Importantes

```java
private double salario[]; // array não inicializado começa null, por isso os métodos checam antes de usar
private double media = 0; // antes era variavel local do metodo media(), virou atributo pra poder expor via getMedia()

public void media() {
    if (salario != null) {
        for (double d : salario) {
            media += d;
        }
        this.media /= salario.length;
    }
    System.out.println("Media: " + media);
}
```

O comentário do próprio autor no código já registra a decisão: `media` migrou de variável local para atributo justamente para existir um `getMedia()` sem recalcular tudo de novo fora da classe.

## ⚠️ Erros Comuns

- Acessar `salario.length` ou iterar o array sem checar `null` antes — se `setSalario` nunca for chamado, o array continua `null` e um `for` direto lançaria `NullPointerException` (evitado aqui com o `if (salario != null)`)
- Deixar `media` como variável local do método `media()` impede reaproveitar o valor calculado fora dele — por isso foi promovida a atributo

## ✅ Boas Práticas

- Expor só `getMedia()` sem `setMedia()`, já que a média é sempre derivada do array, nunca deve ser atribuída manualmente de fora
- Validar array `null` antes de iterar, em vez de assumir que todo objeto sempre virá com o atributo preenchido

## 📌 Resumo

Após este exercício, o autor já consegue tratar um array como atributo `private` de uma classe, expor seu conteúdo via `get`/`set` e derivar valores calculados (como média) mantendo o cálculo encapsulado dentro da própria classe de domínio.

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
