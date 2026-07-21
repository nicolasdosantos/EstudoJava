# ☕ Aula09 — Associação entre Objetos

> Associação "um" e "muitos" entre classes de domínio, incluindo montagem manual de associação bidirecional.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Estuda como objetos se relacionam entre si guardando referências uns dos outros: associação "um" (`Jogador` tem um `Time`) e "muitos" (`Time`/`Escola` têm array de `Jogador`/`Professor`). É a base de como entidades se relacionam em qualquer sistema real (ex: mapeamento de relacionamentos `@OneToOne`/`@OneToMany` no JPA/Spring Boot mais adiante).

## 🎯 Objetivos de Aprendizagem

- Associação entre objetos (referência "um" — `Jogador` com atributo `Time` — e referência "muitos" — `Time`/`Escola` com array de `Jogador`/`Professor`)
- Entender que associação bidirecional só existe quando os dois lados são setados manualmente
- Combinar múltiplas associações no mesmo objeto (exercício: `Seminario` com `Aluno[]` e `Local`, `Professor` com `Seminario[]`)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Associação "um" | Atributo de referência única (`Jogador.time`) — o objeto guarda o vínculo direto, sem "join" automático como em banco |
| Associação "muitos" | Atributo array (`Time.jogadores`, `Escola.professores`) representando vários vínculos |
| Associação unidirecional | Um lado conhece o outro, mas não o inverso (`JogadorTeste02`: `jogador1.setTime(time)` não popula `time.jogadores`) |
| Associação bidirecional | Só existe se os dois lados forem setados manualmente, um de cada vez |
| Múltiplas associações no mesmo objeto | `Seminario` associa "muitos" (`Aluno[]`) e "um" (`Local`) ao mesmo tempo |
| Encadeamento de getters | Atravessar relacionamentos (ex: `professor.getSeminarios()[0].getLocal().getNome()`) |

## 📂 Estrutura da Aula

```text
Aula09/Associacao/
├── dominio/
│   ├── Escola.java
│   ├── Jogador.java
│   ├── Professor.java
│   └── Time.java
├── teste/
│   ├── EscolaTeste01.java
│   ├── JogadorTeste01.java
│   ├── JogadorTeste02.java
│   └── JogadorTeste03.java
└── Exercicio/
    ├── dominio/
    │   ├── Aluno.java
    │   ├── Local.java
    │   ├── Professor.java
    │   └── Seminario.java
    └── teste/
        └── ExercTeste01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Jogador.java](dominio/Jogador.java) | Associação "um": guarda referência para `Time`, com checagem de `null` antes de usar |
| [dominio/Time.java](dominio/Time.java) | Associação "muitos": array de `Jogador` |
| [dominio/Escola.java](dominio/Escola.java) | Mesmo padrão de "muitos" aplicado a `Professor[]` |
| [teste/JogadorTeste02.java](teste/JogadorTeste02.java) | Demonstra associação unidirecional (só `Jogador` sabe do `Time`) |
| [teste/JogadorTeste03.java](teste/JogadorTeste03.java) | Demonstra associação bidirecional montada manualmente nos dois lados |
| [Exercicio/dominio/Seminario.java](Exercicio/dominio/Seminario.java) | Combina associação "muitos" (`Aluno[]`) e "um" (`Local`) no mesmo objeto |
| [Exercicio/dominio/Professor.java](Exercicio/dominio/Professor.java) | `Professor` com array de `Seminario`, fechando o exercício de múltiplas associações |

## 💻 Trechos de Código Importantes

```java
// Jogador.java
private Time time;

public void imprime() {
    System.out.println(this.nome);
    if (time != null) {
        System.out.println(time.getNome());
    }
}
```

O `if (time != null)` existe porque `time` pode não ter sido setado ainda — chamar `time.getNome()` direto lançaria `NullPointerException`, diferente de linguagens dinâmicas onde acessar propriedade de `undefined`/`None` costuma dar erro mais tarde ou silencioso.

## 🔄 Fluxo da Implementação

```text
Associação "um":       Jogador ──referência──▶ Time
Associação "muitos":   Time ──array[]──▶ Jogador, Jogador, Jogador...
Bidirecional (manual): Jogador ──setTime──▶ Time
                        Time ──setJogadores──▶ [Jogador]  (precisa ser feito à parte)
```

## ⚠️ Erros Comuns

- Assumir que setar um lado da associação (`jogador.setTime(time)`) automaticamente popula o outro lado (`time.getJogadores()`) — em Java isso não acontece sozinho, cada referência é independente e precisa ser setada manualmente (visto em `JogadorTeste02` vs. `JogadorTeste03`)
- Esquecer o check de `null` antes de acessar um objeto associado que pode não ter sido setado, causando `NullPointerException`

## ✅ Boas Práticas

- Checar `null` antes de acessar um objeto associado que pode não existir ainda
- Nomear atributos de associação com o nome do relacionamento (`time`, `jogadores`, `professores`), não com nomes genéricos

## 📌 Resumo

Depois desta aula, o autor consegue modelar relacionamentos "um" e "muitos" entre classes de domínio, entende a diferença entre associação unidirecional e bidirecional, e sabe combinar múltiplas associações num mesmo objeto.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/Associacao/Desafio01_Medio.java) | 🟡 Médio | — |

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
