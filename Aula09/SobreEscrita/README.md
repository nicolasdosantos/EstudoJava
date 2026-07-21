# ☕ Aula09 — Sobrescrita de Métodos (@Override)

> Sobrescrita do `toString()` herdado de `Object`, base sintática para o polimorfismo que vem a seguir.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Toda classe Java herda implicitamente de `Object`, inclusive o método `toString()`. Esta aula estuda como sobrescrever (`@Override`) esse método para controlar o que `System.out.println(objeto)` imprime, em vez de receber o endereço de memória/hash padrão. É a base sintática do polimorfismo (próximo tópico), mas ainda não é polimorfismo "de fato" — não há chamada via referência da superclasse aqui.

## 🎯 Objetivos de Aprendizagem

- Entender que toda classe herda de `Object`, mesmo sem `extends` explícito
- Sobrescrever `toString()` com `@Override` para personalizar a representação em texto do objeto

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `extends Object` | Herança implícita explicitada — todo objeto em Java já é um `Object` por baixo dos panos |
| `@Override` | Anotação que sinaliza a sobrescrita de um método herdado (`toString()`), com checagem do compilador |
| `toString()` | Chamado automaticamente por `System.out.println(objeto)`; sem sobrescrita, devolve `NomeClasse@hash` |

## 📂 Estrutura da Aula

```text
Aula09/SobreEscrita/
├── dominio/
│   └── Anime.java
└── teste/
    └── AnimeTeste01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Anime.java](dominio/Anime.java) | Classe de domínio com `extends Object` explícito e `toString()` sobrescrito |
| [AnimeTeste01.java](teste/AnimeTeste01.java) | Demonstra `System.out.println(anime)` chamando o `toString()` sobrescrito |

## 💻 Trechos de Código Importantes

```java
@Override
public String toString(){
    return "Anime: " + this.nome;
}
```

Sem essa sobrescrita, `System.out.println(anime)` imprimiria algo como `Aula09.SobreEscrita.dominio.Anime@1b6d3586` (nome da classe + hash) — inútil para debug. Com o `@Override`, o `println` passa a imprimir `Anime: Dr. Stone`.

## ⚠️ Erros Comuns

- `extends Object` é redundante: correto, mas desnecessário, já que toda classe já herda de `Object` implicitamente — escrever isso não muda o comportamento, só serve como reforço didático (em código de produção, normalmente se omite).
- `getnome()` (linha 24 de `Anime.java`) está fora da convenção JavaBeans: deveria ser `getNome()`, com o "N" maiúsculo, igual ao `setNome()` logo abaixo. Isso importa no mercado porque frameworks como Spring e bibliotecas de serialização (Jackson) dependem dessa convenção exata de getter/setter para funcionar via reflection.

## ✅ Boas Práticas

- Sempre usar `@Override` ao sobrescrever um método herdado — o compilador acusa erro se a assinatura não bater com a da superclasse, evitando bugs silenciosos.
- Sobrescrever `toString()` em classes de domínio para facilitar logs e depuração, em vez de depender do valor padrão de `Object`.

## 📌 Resumo

Após esta aula, o autor já sabe sobrescrever um método herdado de `Object` com `@Override`, entendendo a diferença entre a saída padrão do `toString()` e uma versão personalizada — pré-requisito direto para estudar polimorfismo.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../../Desafios/SobreEscrita/Desafio01_Facil.java) | 🟢 Fácil | — |

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
