# ☕ Aula09 — Classes e Objetos

> Introdução a classes de domínio com atributos públicos, instanciação com `new` e referência de objetos.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/status-Concluída-brightgreen?style=flat-square" alt="Status" />
  <img src="https://img.shields.io/badge/curso-DevDojo-blue?style=flat-square" alt="Curso" />
  <img src="https://img.shields.io/badge/categoria-POO-lightgrey?style=flat-square" alt="Categoria" />
</p>

---

## 📖 Visão Geral

Primeiro contato com classes de domínio em Java: como definir uma classe com atributos, instanciar objetos com `new` e acessar/alterar esses atributos. Aqui os atributos ainda são `public` (encapsulamento vem depois), o foco é entender que cada `new` cria um objeto independente na memória.

## 🎯 Objetivos de Aprendizagem

- Classes e Objetos — introdução: classes de domínio com atributos públicos, instanciação, referência de objetos

## 🧠 Conceitos Estudados

| Conceito | Explicação |
|---|---|
| `public class` | Classe de domínio (`Estudante`, `Carro`, `Professor`) só com atributos, sem métodos ainda |
| Atributos `public` | Acessados e alterados diretamente pelo objeto (`carro.nome = "Fusca"`), sem `get`/`set` |
| `new` | Cria uma instância nova e independente da classe em memória |
| Referência de objeto | Duas variáveis (`carro`, `carro2`) apontando para objetos distintos; comentário no código já antecipa que `carro = carro2` faria `carro` apontar para o mesmo objeto (referência compartilhada, não cópia) |

## 📂 Estrutura da Aula

```text
Aula09/introducaoClasses/dominio/Carro.java
Aula09/introducaoClasses/dominio/Estudante.java
Aula09/introducaoClasses/dominio/Professor.java
Aula09/introducaoClasses/teste/CarroExerc.java
Aula09/introducaoClasses/teste/EstudanteTeste01.java
Aula09/introducaoClasses/teste/EstudanteTeste02.java
Aula09/introducaoClasses/teste/ProfessorTeste01.java
```

## 📄 Arquivos Importantes

| Arquivo | Finalidade |
|---|---|
| [dominio/Estudante.java](dominio/Estudante.java) | Classe de domínio com `nome`, `idade`, `sexo` públicos |
| [dominio/Carro.java](dominio/Carro.java) | Classe de domínio com `nome`, `modelo`, `ano` públicos |
| [dominio/Professor.java](dominio/Professor.java) | Classe de domínio equivalente a `Estudante`, reforçando o padrão |
| [teste/EstudanteTeste01.java](teste/EstudanteTeste01.java) | Instancia e preenche um `Estudante` |
| [teste/EstudanteTeste02.java](teste/EstudanteTeste02.java) | Cria um segundo `Estudante` independente do primeiro |
| [teste/CarroExerc.java](teste/CarroExerc.java) | Dois `Carro`s distintos, com nota sobre referência compartilhada |
| [teste/ProfessorTeste01.java](teste/ProfessorTeste01.java) | Instancia e imprime um `Professor` |

## 💻 Trechos de Código Importantes

```java
// carro = carro2; - Isso é uma referencia a partir daqui a
// variavel carro tem os mesmos atirbutos do que o carro2.
```

Comentário próprio deixado em `CarroExerc.java` (linhas 18-19): mesmo sem executar essa linha, o autor já registrou o entendimento de que atribuir um objeto a outro copia a referência, não os valores — diferença central em relação a tipos primitivos.

## ⚠️ Erros Comuns

- Achar que `carro = carro2` copia os atributos — na verdade `carro` passaria a apontar para o mesmo objeto que `carro2`, e qualquer alteração em um refletiria no outro.
- Atributos `public` permitem valores inválidos sem nenhuma validação (ex: `idade` negativa) — é a motivação para o encapsulamento estudado logo depois.

## ✅ Boas Práticas

- Nomear classes de domínio em PascalCase e pacotes separando `dominio` de `teste`, como já feito aqui.
- Evitar atributos `public` em código real — usada aqui só como passo didático antes do encapsulamento.

## 📌 Resumo

Depois desta aula, já é possível criar classes de domínio simples, instanciar múltiplos objetos independentes e entender que variáveis de objeto guardam referência, não cópia de valores.

## 🏆 Exercícios Relacionados

| Exercício | Dificuldade | Nota |
|---|---|---|
| [Desafio01_Facil.java](../../Desafios/POO/Desafio01_Facil.java) | 🟢 Fácil | — |

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
