# ☕ Aula09 — Herança

> Estudo de herança (`extends`) entre classes de domínio: `Funcionario` reaproveita `Pessoa` numa relação "é um".

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Estudo de herança em Java através de `Pessoa` e `Funcionario extends Pessoa`. Diferente da associação ("tem um"), aqui a subclasse vira um "tipo" da superclasse, reaproveitando atributos e métodos sem reescrevê-los. Base direta para o próximo conceito (polimorfismo/sobrescrita), já usado aqui via `@Override` informal de `imprime()`.

## 🎯 Objetivos de Aprendizagem

- Entender herança (`extends`) como relação "é um", em contraste com associação ("tem um")
- Compreender por que atributos `protected` (em vez de `private`) permitem acesso direto na subclasse
- Entender a obrigatoriedade de `super(...)` como primeira instrução do construtor da subclasse
- Observar a ordem real de inicialização entre superclasse e subclasse (blocos estáticos, blocos de instância, construtores)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `extends` | `Funcionario extends Pessoa` herda `nome`, `cpf`, `endereco` e `imprime()` sem reescrever nada, só adiciona `salario` |
| `protected` | Atributos de `Pessoa` são `protected` (não `private`), permitindo `this.nome` funcionar direto dentro de `Funcionario` |
| `super(...)` | Chamada obrigatória ao construtor da superclasse — precisa ser a primeira instrução do construtor da subclasse |
| `super.metodo()` | `Funcionario.imprime()` chama `super.imprime()` e completa só com o que falta (`salario`), sem repetir os prints herdados |
| Ordem de inicialização | Estático da super → estático da sub → objeto da super → construtor da super → objeto da sub → construtor da sub |

## 📂 Estrutura da Aula

```text
Aula09/Herança/teste/HerançaTeste02.java
Aula09/Herança/teste/HerançaTeste01.java
Aula09/Herança/dominio/Endereco.java
Aula09/Herança/dominio/Pessoa.java
Aula09/Herança/dominio/Funcionario.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Pessoa.java](dominio/Pessoa.java) | Superclasse com atributos `protected` (`nome`, `cpf`, `endereco`), construtor com parâmetro (elimina o construtor vazio implícito) e `imprime()` |
| [dominio/Funcionario.java](dominio/Funcionario.java) | Subclasse `extends Pessoa`, adiciona `salario`, chama `super(nome)` e sobrescreve `imprime()` reaproveitando `super.imprime()` |
| [dominio/Endereco.java](dominio/Endereco.java) | Classe de apoio usada como atributo de `Pessoa` (associação, sem herança envolvida) |
| [teste/HerançaTeste01.java](teste/HerançaTeste01.java) | Demonstra herança de atributos/métodos e a sobrescrita de `imprime()` em ação |
| [teste/HerançaTeste02.java](teste/HerançaTeste02.java) | Documenta em comentário a ordem completa (0-9) de execução de blocos estáticos, de instância e construtores entre super e subclasse |

## 💻 Trechos de Código Importantes

```java
public Funcionario(String nome) {
    super(nome);
    System.out.println("Dentro da class funcionario construtor");
}

public void imprime() {
    super.imprime();
    System.out.println(this.salario);
}
```

`super(nome)` precisa ser a primeira linha do construtor — é assim que `Funcionario` inicializa o que pertence a `Pessoa` antes de tratar o que é próprio dela. Em `imprime()`, `super.imprime()` reaproveita o comportamento do pai, evitando repetir os prints de `nome`/`cpf`/`endereco`.

## 🔄 Fluxo da Implementação

```text
Pessoa (superclasse)                    Funcionario (subclasse)
--------------------                    -----------------------
0. bloco static de Pessoa       -->
                                 -->     1. bloco static de Funcionario
2. aloca objeto Pessoa
3. atributos de Pessoa (default/valor)
4. bloco de inicialização de Pessoa
5. construtor Pessoa(nome)  <-- super(nome)
                                 -->     6. aloca objeto Funcionario
                                 -->     7. atributos de Funcionario (salario)
                                 -->     8. bloco de inicialização de Funcionario
                                 -->     9. construtor Funcionario(nome)
```

## ⚠️ Erros Comuns

- **Erro real corrigido nesta pasta**: o construtor de `Funcionario` chamava `super(nome)` depois de um `System.out.println(...)` — isso não compila, pois `super(...)` é obrigatoriamente a primeira instrução do construtor. Corrigido durante o estudo.
- Esquecer que, como `Pessoa` define um construtor com parâmetro, o construtor vazio implícito deixa de existir — qualquer subclasse é obrigada a chamar `super(...)` explicitamente.

## ✅ Boas Práticas

- Usar `protected` (em vez de `public`) quando o acesso direto só precisa valer para subclasses, mantendo o encapsulamento em relação ao resto do código
- Reaproveitar comportamento do pai com `super.metodo()` em vez de duplicar lógica ao sobrescrever

## 📌 Resumo

Depois desta aula, o autor já é capaz de modelar relações "é um" com `extends`, entender a obrigatoriedade e a posição de `super(...)`, reaproveitar comportamento da superclasse com `super.metodo()` e explicar a ordem real de inicialização entre super e subclasse.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/Heranca/Desafio01_Medio.java) | 🟡 Médio | — |

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
