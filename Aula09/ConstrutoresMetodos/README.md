# ☕ Aula09 — Construtores

> Construtores sobrecarregados na classe `Anime`, com encadeamento via `this(...)`.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Construtor é o método especial chamado pelo `new`, sem tipo de retorno, com o mesmo nome da classe. Esta pasta estuda sobrecarga de construtores: dois construtores de `Anime` (4 e 5 parâmetros), o de 5 reaproveitando o de 4 via `this(...)` em vez de repetir atribuições.

## 🎯 Objetivos de Aprendizagem

- Entender que assim que a classe define construtor próprio, o construtor vazio implícito deixa de existir.
- Reaproveitar lógica entre construtores sobrecarregados com `this(...)`.

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Construtor sobrecarregado | `Anime` tem construtor de 4 parâmetros e outro de 5, mesma ideia de overloading já usada em `SobracargaMetodos` |
| `this(...)` | Chama outro construtor da própria classe; precisa ser a primeira linha do bloco |
| Ausência de construtor vazio implícito | Ao declarar qualquer construtor próprio, `Anime()` sem argumentos deixa de existir |

## 📂 Estrutura da Aula

```text
Aula09/ConstrutoresMetodos/dominio/Anime.java
Aula09/ConstrutoresMetodos/testes/AnimeTeste.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Anime.java](dominio/Anime.java) | Classe de domínio com atributos `private`, os dois construtores sobrecarregados e getters/setters |
| [testes/AnimeTeste.java](testes/AnimeTeste.java) | Instancia `Anime` com o construtor de 5 parâmetros e chama `imprime()` |

## 💻 Trechos de Código Importantes

```java
public Anime(String nome, String tipo, int episodios, String genero) {
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
    this.genero = genero;
}

public Anime(String nome, String tipo, int episodios, String genero, String estudio){
    this(nome, tipo, episodios, genero);
    this.estudio = estudio;
}
```

O construtor de 5 parâmetros reaproveita o de 4 via `this(...)`, evitando repetir as quatro atribuições — mesma lógica de reaproveitamento já usada com `init(...)` em `SobracargaMetodos`.

## ⚠️ Erros Comuns

- Erro real do estudo: como `Anime` define construtor próprio, o construtor vazio implícito (`new Anime()`) deixou de existir — isso causou um erro de compilação real, corrigido durante o estudo desta aula.
- `this(...)` só é válido como primeira instrução do construtor; colocá-lo depois de outra linha não compila.

## ✅ Boas Práticas

- Reaproveitar construtores com `this(...)` em vez de duplicar atribuições entre sobrecargas.
- Manter atributos `private`, expondo acesso só via `get`/`set`.

## 📌 Resumo

Após esta aula, o autor sabe sobrecarregar construtores e encadeá-los com `this(...)`, além de já ter enfrentado na prática a consequência de declarar construtor próprio (perda do construtor vazio implícito).

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/Construtores/Desafio01_Medio.java) | 🟡 Médio | — |

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
