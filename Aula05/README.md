# ☕ Aula 05 — Condicionais

> `if`/`else`, operador ternário e `switch`/`case` (incluindo fallthrough proposital e acidental).

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-Fundamentos-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Aula sobre estruturas condicionais em Java: `if`/`else`/`else if`, operador ternário como alternativa mais enxuta para condições simples, e `switch`/`case` para múltiplos valores discretos. É a base de qualquer lógica de decisão em código — de validações de formulário a regras de negócio.

## 🎯 Objetivos de Aprendizagem

- Condicionais (`if`/`else`, ternário, `switch`) — Aula05

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `if`/`else`/`else if` | Decisão baseada em condição booleana, com encadeamento para múltiplas faixas (ex: faixas de imposto por salário) |
| Operador `!` (negação) | `!isAutorizadoComprarBebida` como alternativa a `== false` |
| Operador ternário (`?:`) | Substitui um `if`/`else` simples que só atribui um valor, em uma única expressão |
| `switch`/`case` | Comparação de um valor contra múltiplos casos discretos (`byte`, `char`) |
| Fallthrough do `switch` | Ausência de `break` faz a execução "cair" para o próximo `case`; usado de propósito para agrupar `case`s (ex: dias de fim de semana) |

## 📂 Estrutura da Aula

```text
Aula05/Aula05.java
Aula05/Aula05Ex.java
Aula05/Aula05pt2.java
Aula05/Aula05pt3.java
Aula05/Aula05pt4.java
Aula05/Aula05pt4Ex.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [Aula05.java](Aula05.java) | Introdução a `if`/`else`, comparação com `== false` vs. operador de negação `!` |
| [Aula05Ex.java](Aula05Ex.java) | Exercício: cálculo de imposto por faixa salarial usando `if`/`else if`/`else` encadeados |
| [Aula05pt2.java](Aula05pt2.java) | Classificação de categoria (infantil/juvenil/adulta) por faixa de idade com `if`/`else if`/`else` |
| [Aula05pt3.java](Aula05pt3.java) | Operador ternário substituindo um `if`/`else` simples de atribuição |
| [Aula05pt4.java](Aula05pt4.java) | Introdução ao `switch`/`case` com `byte` (dia da semana) e `char` (sexo), usando `break` em todo `case` |
| [Aula05pt4Ex.java](Aula05pt4Ex.java) | Exercício de `switch`: dia útil vs. fim de semana, incluindo uma segunda versão com fallthrough proposital agrupando `case`s |

## 💻 Trechos de Código Importantes

```java
// Aula05pt3.java
String resultado = salario > 5000 ? msg : msgN;
```

O ternário substitui o bloco `if`/`else` comentado logo abaixo no mesmo arquivo — mesma lógica, uma linha em vez de cinco. Só vale a pena quando a decisão é simples (uma atribuição), não para lógica com múltiplos efeitos colaterais.

```java
// Aula05pt4Ex.java — segunda versão do switch
switch (dia) {
    case 1:
    case 7:
        System.out.println("Fim de semana");
        break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
        System.out.println("Dia util");
        break;
    default:
        System.out.println("Dia invalido");
        break;
}
```

Fallthrough usado de propósito: `case 1` e `case 7` não têm `break` entre si, então os dois caem no mesmo `System.out.println`. É uma forma mais compacta de agrupar múltiplos valores para a mesma ação, ao custo de ficar menos explícito para quem lê.

## ⚠️ Erros Comuns

- Em `Aula05pt4Ex.java`, na primeira versão do `switch`, o `case 7` não tem `break` antes do `default` — fallthrough acidental que faz o programa imprimir "Sabado - Fim de semana" **e depois** "Dia invalido" para `dia = 7`. É o mesmo mecanismo do fallthrough proposital da segunda versão do arquivo, só que aqui foi um esquecimento, não uma decisão — reforça por que todo `case` deve terminar em `break` (ou `return`) a menos que o fallthrough seja intencional e comentado.
- Comparar booleano com `== false`/`== true` (feito em `Aula05.java` como demonstração) é redundante — `!variavel` ou `variavel` diretamente já expressam a mesma condição de forma mais idiomática em Java.

## ✅ Boas Práticas

- Preferir `!variavel` a `variavel == false` — mais curto e mais idiomático.
- Usar ternário só para atribuições simples de uma expressão; para lógica com múltiplas instruções, `if`/`else` continua mais legível.
- Sempre fechar cada `case` do `switch` com `break` (ou `return`), a menos que o fallthrough seja intencional — e nesse caso, comentar o motivo, já que é uma fonte comum de bugs silenciosos.

## 📌 Resumo

Após esta aula, o autor já consegue expressar decisões condicionais em Java de três formas (`if`/`else`, ternário, `switch`), entendendo quando cada uma é mais adequada, e já enfrentou na prática um bug real de fallthrough por `break` ausente.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Medio.java](../Desafios/Aula05/Desafio01_Medio.java) | 🟡 Médio | — |

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
