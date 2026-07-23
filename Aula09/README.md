<!-- README agregador da Aula09 — visão geral; detalhes completos em cada subpasta -->

# ☕ Aula09 — Programação Orientada a Objetos

> Aula grande e multi-tópico: da introdução a classes/objetos até herança e sobrescrita — a base de POO em Java antes de Polimorfismo e Interfaces.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Em%20andamento-yellow?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Aula09 concentra toda a introdução a Orientação a Objetos em Java: classes, métodos, encapsulamento, sobrecarga, construtores, blocos de inicialização, `static`, leitura de dados, associação, herança e sobrescrita. Cada subtópico vive em sua própria subpasta com README detalhado — este arquivo é só o mapa geral da aula.

## 🎯 Objetivos de Aprendizagem

- Classes e Objetos, Métodos
- Construtores
- Encapsulamento
- Sobrecarga de métodos (overloading)
- Bloco de inicialização de instância
- Modificador `static`
- Leitura de dados via `Scanner`
- Associação entre objetos
- Herança
- Sobrescrita de métodos (`@Override`)
- Enumerações (`enum`)
- Modificador `final`

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| Classes e Objetos | Atributos, instanciação, referência de objetos |
| Métodos | Sem retorno, com parâmetros, com retorno, varargs (`int... num`) |
| Encapsulamento | Atributos `private` + `get`/`set` com validação |
| Sobrecarga (overloading) | Múltiplas assinaturas do mesmo método, reaproveitadas via `this.metodo(...)` |
| Construtores | Sobrecarga de construtores, encadeamento via `this(...)` |
| Bloco de inicialização | `{ }` executado antes do construtor, a cada `new` |
| `static` | Atributo, bloco `static{ }` (uma vez, no carregamento) e métodos de classe |
| Leitura de dados | `Scanner`: `nextLine()`, `nextInt()`, `next().charAt(0)` |
| Associação | Referência "um" e "muitos" entre objetos, bidirecional quando setada nos dois lados |
| Herança (`extends`) | Relação "é um", reaproveitamento de atributos/métodos da superclasse via `super` |
| Sobrescrita (`@Override`) | Redefinição de comportamento herdado na subclasse |
| Enumerações (`enum`) | Tipo com um conjunto fixo e conhecido de valores, validado pelo compilador |
| Modificador `final` | Em classe (bloqueia herança), em atributo `static` (blank final) e em referência de objeto (trava a troca, não a mutação) |

## 📂 Estrutura da Aula

```text
Aula09/
├── introducaoClasses/
├── IntroducaoMetodo/
├── Exercicio/
├── SobracargaMetodos/
├── ConstrutoresMetodos/
├── BlocosInicializacao/
├── ModificadoresEstatico/
├── LeituraDados/
├── Associacao/
├── Herança/
├── SobreEscrita/
├── Enumeracao/
└── ModificadorFinal/
```

## 📄 Arquivos Importantes

| README do subtópico | Finalidade |
|---|---|
| [introducaoClasses/README.md](introducaoClasses/README.md) | Classes e Objetos |
| [IntroducaoMetodo/README.md](IntroducaoMetodo/README.md) | Métodos e Encapsulamento |
| [Exercicio/README.md](Exercicio/README.md) | Exercício: array como atributo |
| [SobracargaMetodos/README.md](SobracargaMetodos/README.md) | Sobrecarga de Métodos |
| [ConstrutoresMetodos/README.md](ConstrutoresMetodos/README.md) | Construtores |
| [BlocosInicializacao/README.md](BlocosInicializacao/README.md) | Bloco de Inicialização |
| [ModificadoresEstatico/README.md](ModificadoresEstatico/README.md) | Modificador `static` |
| [LeituraDados/README.md](LeituraDados/README.md) | Leitura de Dados (Scanner) |
| [Associacao/README.md](Associacao/README.md) | Associação entre Objetos |
| [Herança/README.md](Herança/README.md) | Relação "é um" entre Funcionario e Pessoa |
| [SobreEscrita/README.md](SobreEscrita/README.md) | Sobrescrita (`@Override`) |
| [Enumeracao/README.md](Enumeracao/README.md) | Enumerações (`enum`) |
| [ModificadorFinal/README.md](ModificadorFinal/README.md) | Modificador `final` |

## 💻 Trechos de Código Importantes

```java
public Anime(String nome, String estudio, int qtdEpisodios, double notaMedia, int anoLancamento) {
    this(nome, estudio, qtdEpisodios, notaMedia);
    this.anoLancamento = anoLancamento;
}
```

Encadeamento de construtores em `ConstrutoresMetodos`: o construtor de 5 parâmetros reaproveita o de 4 via `this(...)`, em vez de repetir as atribuições.

## 🔄 Fluxo da Implementação

```text
Classes/Objetos → Métodos → Encapsulamento → Sobrecarga → Construtores →
Blocos/static → Scanner → Associação → Herança → Sobrescrita → Enum/final
```

## ⚠️ Erros Comuns

- Construtor vazio implícito deixa de existir assim que a classe define um construtor próprio (causou erro de compilação real durante `ConstrutoresMetodos`).
- Atributos `private` da superclasse continuam inacessíveis direto na subclasse, mesmo com `extends` — só via `get`/`set` herdados.
- Declarar um `enum` como `class` (escrevendo os valores soltos, tipo `pessoa_fisica, pessoa_juridica`, dentro de `public class`) não compila — essa sintaxe só é válida dentro de `enum` (erro real corrigido em `Enumeracao/TipoCliente.java`). Junto com isso veio um segundo erro de tipo: o construtor de `Cliente` esperava `String`, mas o teste já passava um valor do `enum`.

## ✅ Boas Práticas

- Preferir encapsulamento (`private` + `get`/`set` com validação) a atributos `public`.
- Reaproveitar construtores/métodos sobrecarregados via `this(...)` em vez de duplicar atribuições.
- Usar `enum` em vez de constantes `String`/`int` para representar um conjunto fixo de valores — o compilador impede valor inválido, algo que uma constante solta não garante.

## 📌 Resumo

Ao final da Aula09, já é possível modelar classes de domínio completas: com atributos encapsulados, construtores sobrecarregados, métodos estáticos e de instância, leitura de dados do usuário, associações entre objetos, herança com sobrescrita de comportamento, tipos com valores fixos via `enum` e uso de `final` para travar herança, atribuição única (blank final) e reatribuição de referência.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../Desafios/POO/Desafio01_Facil.java) | 🟢 Fácil | — |
| [Desafio01_Medio.java](../Desafios/Metodos/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../Desafios/Encapsulamento/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../Desafios/Sobrecarga/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../Desafios/Construtores/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../Desafios/BlocosInicializacao/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../Desafios/ModificadoresEstatico/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Facil.java](../Desafios/LeituraDados/Desafio01_Facil.java) | 🟢 Fácil | — |
| [Desafio01_Medio.java](../Desafios/Associacao/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Medio.java](../Desafios/Heranca/Desafio01_Medio.java) | 🟡 Médio | — |
| [Desafio01_Facil.java](../Desafios/SobreEscrita/Desafio01_Facil.java) | 🟢 Fácil | — |

## 📚 Referências

- [Java Tutorials — Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- Curso Java — DevDojo

## 📈 Evolução

```
Java Core

███████████████░░░░░ 75%
```

## 🔗 Próximo Conteúdo

➡️ Polimorfismo
