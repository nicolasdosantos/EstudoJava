# ☕ Aula09 — Modificador `final`

> `final` aplicado em três lugares diferentes: na classe, num atributo `static` (blank final) e numa referência de objeto.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

`final` tem comportamento diferente dependendo de onde é usado. Nesta aula, `Carro` mostra os três casos: a própria classe é `final` (não pode ser estendida), o atributo estático `velocidadeLimite` é um blank final (declarado sem valor, obrigado a ser atribuído no bloco `static{ }`), e o atributo de instância `comprador` é uma referência final (não pode apontar para outro `Comprador`, mas o `Comprador` apontado continua mutável).

## 🎯 Objetivos de Aprendizagem

- Entender `final` em classe, impedindo herança
- Entender blank final: atributo `final` sem valor na declaração, atribuído depois (uma única vez)
- Diferenciar `final` numa referência de objeto (trava a troca de referência) de `final` num valor primitivo (trava o valor)

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `final class` | Classe que não pode ser estendida (`extends`) por nenhuma outra |
| Blank final | Atributo `final` declarado sem valor, atribuído uma única vez antes do primeiro uso (aqui, dentro do `static{ }`) |
| `final` em referência de objeto | Trava a reatribuição da referência (`comprador = new Comprador()` não compila de novo), mas não torna o objeto apontado imutável |

## 📂 Estrutura da Aula

```text
Aula09/ModificadorFinal/
├── dominio/
│   ├── Carro.java
│   ├── Comprador.java
│   └── Ferrari.java
└── teste/
    └── CarroTeste01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Carro.java](dominio/Carro.java) | Classe `final`, com blank final estático e atributo de instância final |
| [Comprador.java](dominio/Comprador.java) | Classe simples e mutável, usada para provar que `final` na referência não trava o objeto |
| [CarroTeste01.java](teste/CarroTeste01.java) | Demonstra `Carro.velocidadeLimite` (`static`) e a mutação de `carro.comprador` mesmo com `comprador` sendo `final` |

## 💻 Trechos de Código Importantes

```java
public static final double velocidadeLimite; // = 250;

static{
    velocidadeLimite = 250;
}
```

`velocidadeLimite` é um blank final: como a classe define construtor implícito e o atributo é `static`, o valor só pode ser atribuído dentro do bloco `static{ }`, e só uma vez — tentar atribuir de novo depois dá erro de compilação.

```java
carro.comprador.setNome("Teste");
```

`comprador` é `final`, então `carro.comprador = new Comprador()` não compilaria. Mas como `final` trava só a referência (não o objeto), chamar `setNome()` no `Comprador` já existente funciona normalmente — é o mesmo `Comprador` desde a criação do `Carro`, só o estado interno dele muda.

## ✅ Boas Práticas

- Usar `final` na classe quando ela não foi pensada para ser especializada por herança — evita subclasses que dependam de detalhes internos não pensados para extensão (é por isso que `String`, por exemplo, é `final` no próprio Java).
- Usar blank final quando o valor depende de alguma lógica de inicialização (bloco `static{ }` ou construtor), mas ainda deve ser imutável depois de definido.

## 📌 Resumo

Nesta aula, o autor aprendeu que `final` muda de comportamento dependendo de onde é aplicado: bloqueia herança numa classe, obriga atribuição única (mas adiada) num blank final, e trava só a troca de referência — não a mutação do objeto — num atributo de instância.

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
