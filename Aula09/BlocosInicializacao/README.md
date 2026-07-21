# ☕ Aula09 — Bloco de Inicialização de Instância

> Bloco `{ }` de instância na classe `Anime`, executado antes do construtor toda vez que um objeto é criado.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Bloco de inicialização de instância (`{ }` solto no corpo da classe, sem `static`) roda automaticamente antes do construtor, toda vez que um `new` é executado. Útil quando a inicialização de um atributo exige lógica mais complexa do que um simples `= valor` na declaração.

## 🎯 Objetivos de Aprendizagem

- Entender que o bloco de inicialização de instância roda antes do corpo do construtor, independente de qual construtor for chamado.
- Usar o bloco para popular um atributo (`array`) com lógica que não caberia numa atribuição direta na declaração.

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Bloco de inicialização de instância (`{ }`) | Bloco sem `static` no corpo da classe; executa a cada `new Anime(...)`, antes do construtor rodar |
| Ordem de execução | Atributos com valor padrão → bloco de inicialização → corpo do construtor |
| `private` + array | `episodios` é populado no bloco, não na declaração, e só exposto via `getEposidios()` |

## 📂 Estrutura da Aula

```text
Aula09/BlocosInicializacao/teste/AnimeTeste01.java
Aula09/BlocosInicializacao/dominio/Anime.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Anime.java](dominio/Anime.java) | Classe com bloco de inicialização que popula `episodios` antes do construtor setar `nome` |
| [teste/AnimeTeste01.java](teste/AnimeTeste01.java) | Cria um `Anime` e imprime os episódios gerados pelo bloco |

## 💻 Trechos de Código Importantes

```java
{
    episodios = new int[100];
    for (int i = 0; i < this.episodios.length; i++) {
        episodios[i] = i + 1;
        System.out.println(episodios[i]);
    }
}

public Anime(String nome) {
    this.nome = nome;
}
```

O bloco `{ }` roda primeiro (imprime os 100 episódios), e só depois o construtor executa `this.nome = nome`.

## 🔄 Fluxo da Implementação

```text
atributos com valor padrão → bloco de inicialização → corpo do construtor
```

## ⚠️ Erros Comuns

- Typo real no código: `getEposidios()` em vez de `getEpisodios()` — Java não valida nome de método, então compila normal, mas fica mais difícil de lembrar o nome certo depois.

## ✅ Boas Práticas

- Preferir bloco de inicialização só quando a lógica de inicialização for de fato complexa demais para uma atribuição direta na declaração do atributo.

## 📌 Resumo

Após esta aula, o autor sabe que a ordem real de inicialização de um objeto em Java é atributos → bloco de instância → construtor, e quando esse bloco é útil na prática.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/BlocosInicializacao/Desafio01_Medio.java) | 🟡 Médio | — |

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
