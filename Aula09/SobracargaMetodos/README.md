# ☕ Aula09 — Sobrecarga de Métodos (Overloading)

> Classe `Anime` com dois métodos `init` de assinaturas diferentes, uma reaproveitando a outra via `this.init(...)`.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Estuda sobrecarga (overloading): dois métodos com o mesmo nome (`init`) mas assinaturas diferentes (quantidade de parâmetros). O Java resolve qual versão chamar em tempo de compilação, olhando os argumentos passados. É comum em construtores, builders e APIs que oferecem variações opcionais de um mesmo comportamento (ex: `List.of()` no próprio JDK).

## 🎯 Objetivos de Aprendizagem

- Sobrecarga de métodos (overloading) — classe `Anime` com dois métodos `init` de assinaturas diferentes (3 e 4 parâmetros), a versão de 4 reaproveitando a de 3 via `this.init(...)`

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Overloading | Dois métodos `init` com o mesmo nome, diferenciados pela quantidade de parâmetros (3 vs. 4) |
| Resolução em tempo de compilação | O Java escolhe a versão de `init` a chamar com base nos argumentos passados na chamada, antes mesmo do programa rodar |
| Reaproveitamento via `this.metodo(...)` | O `init` de 4 parâmetros chama `this.init(nome, tipo, episodios)` internamente, evitando repetir a atribuição dos 3 primeiros campos |
| Encapsulamento (`private` + get/set) | Atributos `tipo`, `episodios`, `nome`, `genero` são `private`, acessíveis só via métodos públicos |

## 📂 Estrutura da Aula

```text
Aula09/SobracargaMetodos/
├── dominio/
│   └── Anime.java
└── testes/
    └── AnimeTeste.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Anime.java](dominio/Anime.java) | Classe de domínio com os dois `init` sobrecarregados e getters/setters |
| [AnimeTeste.java](testes/AnimeTeste.java) | Testa a criação de um `Anime` chamando a versão de 4 parâmetros |

## 💻 Trechos de Código Importantes

```java
public void init( String nome, String tipo, int episodios){
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
}

// essa versao com genero reaproveita a de 3 parametros (evita repetir nome/tipo/episodios de novo)
public void init( String nome, String tipo, int episodios, String genero){
    this.init(nome, tipo, episodios);
    this.genero = genero;
}
```

O `init` de 4 parâmetros não repete a lógica de atribuição de `nome`/`tipo`/`episodios` — ele delega para a versão de 3 parâmetros via `this.init(...)` e só adiciona o que é exclusivo dele (`genero`). Mesma ideia do encadeamento `this(...)` entre construtores, aplicada a métodos comuns.

## ⚠️ Erros Comuns

- Getter do atributo `episodios` está com o nome digitado errado: `getEposidios()` (faltou o "i" em "Episodios") — inconsistência real encontrada no código desta aula, que quebra a convenção `getNome()`/`getTipo()`/`getGenero()` do resto da classe
- Subpasta de testes desta aula se chama `testes` (plural), enquanto o padrão nas demais pastas de `Aula09` é `teste` (singular) — inconsistência de nomenclatura já sinalizada em `.claude/context/sobre-repositorio.md`

## ✅ Boas Práticas

- Evitar duplicar lógica entre sobrecargas: a versão com mais parâmetros deve chamar a mais simples (`this.init(...)`), como feito aqui, em vez de repetir as mesmas atribuições
- Manter todos os atributos `private`, com acesso só via `get`/`set`, mesmo em classes de exemplo simples

## 📌 Resumo

Depois desta aula, o autor já consegue criar métodos sobrecarregados no mesmo estilo de construtores sobrecarregados, reaproveitando a versão mais simples dentro da mais completa em vez de duplicar código.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../../Desafios/Sobrecarga/Desafio01_Medio.java) | 🟡 Médio | — |

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
