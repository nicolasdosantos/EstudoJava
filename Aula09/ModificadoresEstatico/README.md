# ☕ Aula09 — Modificador static

> Atributo, bloco e método `static`: o que é compartilhado pela classe, e não por cada objeto criado.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Estudo do modificador `static` aplicado a atributo, bloco de inicialização e método. Diferente do que foi visto em `Aula09/BlocosInicializacao` (nível de instância, executado a cada `new`), aqui o conteúdo é da classe: existe uma única cópia, compartilhada por todos os objetos, e o bloco `static{}` roda apenas uma vez, no carregamento da classe pela JVM.

## 🎯 Objetivos de Aprendizagem

- Modificador `static` — atributo, bloco `static{ }` (executado uma única vez, no carregamento da classe) e métodos `static` de classe, comparado lado a lado com a versão de instância em `BlocosInicializacao`.

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Atributo `static` | Pertence à classe, não a cada objeto — uma única cópia compartilhada (`veloLimite` em `Carro`, `episodios` em `Anime`) |
| Bloco `static{ }` | Roda uma única vez, no carregamento da classe pela JVM, mesmo que vários objetos sejam criados depois |
| Método `static` | Chamado pelo nome da classe (`Carro.setVeloLimite(...)`), não por uma instância; obrigatório para alterar atributo `static` |

## 📂 Estrutura da Aula

```text
Aula09/ModificadoresEstatico
├── dominio
│   ├── Anime.java
│   └── Carro.java
└── teste
    ├── AnimeTeste01.java
    └── CarroTeste01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Anime.java](dominio/Anime.java) | Atributo `static int[] episodios` e bloco `static{}` que preenche e imprime o array uma única vez, no carregamento da classe |
| [dominio/Carro.java](dominio/Carro.java) | Atributo `static double veloLimite` compartilhado, com get/set também `static` |
| [teste/AnimeTeste01.java](teste/AnimeTeste01.java) | Demonstra que o `static{}` roda ao criar o primeiro `Anime` |
| [teste/CarroTeste01.java](teste/CarroTeste01.java) | Demonstra que alterar `veloLimite` via `Carro.setVeloLimite(...)` afeta todos os objetos `Carro` já criados |

## 💻 Trechos de Código Importantes

```java
// Carro.java
public static void setVeloLimite(double veloLimite){
    Carro.veloLimite = veloLimite;
}
```

Método `static` porque só ele pode alterar um atributo `static` — chamado pelo nome da classe (`Carro.setVeloLimite(200)`), e não por uma instância (`c1.setVeloLimite(200)`), diferente dos get/set de instância (`getNome`/`setNome`) da mesma classe.

## ⚠️ Erros Comuns

- Typo real registrado no código: `getEposidios()` em vez de `getEpisodios()` em `Anime.java` — Java não valida nome de método, então compila normalmente, só fica mais difícil de lembrar o nome certo depois.
- Confundir o `static{}` com o bloco de inicialização de instância de `BlocosInicializacao`: o de instância roda a cada `new`, o `static{}` roda uma única vez, no carregamento da classe.

## ✅ Boas Práticas

- Usar `static` apenas para o que é realmente da classe (contadores globais, constantes, configuração compartilhada) — não como atalho para evitar passar parâmetro.
- Acessar/alterar atributo `static` sempre por método `static` do próprio nome da classe, para deixar explícito no código que aquele dado é compartilhado.

## 📌 Resumo

Após esta aula, o autor consegue distinguir estado de instância de estado de classe, sabendo quando usar `static` para atributos, blocos de inicialização e métodos, e as implicações de um valor `static` ser alterado por qualquer objeto e refletir em todos.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/ModificadoresEstatico/Desafio01_Medio.java) | 🟡 Médio | — |

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
