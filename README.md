# Filtro de Nomes com Lambda e Stream API

## Sobre o Projeto

Este projeto foi desenvolvido para praticar conceitos de programação funcional em Java, com foco na criação de interfaces funcionais, expressões Lambda e utilização da Stream API.

A aplicação armazena uma lista de nomes e realiza um filtro personalizado para identificar aqueles que começam com a letra "A".

## Objetivos

- Criar uma interface funcional própria utilizando `@FunctionalInterface`.
- Implementar comportamentos personalizados com expressões Lambda.
- Aplicar filtros utilizando a Stream API.
- Compreender a utilização de referências de métodos em Java.

## Tecnologias e Recursos Utilizados

- Java (JDK 11+)
- Interfaces Funcionais
- Expressões Lambda
- Stream API
- Method References

## Estrutura do Projeto

```text
filtro-nomes-java/
│
└── src/
    └── main/
        └── java/
            └── lambda/
                ├── FiltroNome.java
                └── Principal.java
```

## Funcionamento

A aplicação utiliza duas classes principais:

**FiltroNome.java**

Define uma interface funcional com o método `testar(String nome)`, responsável por estabelecer o contrato da regra de filtragem.

**Principal.java**

Contém o método `main`, a lista de nomes e a implementação da interface funcional por meio de uma expressão Lambda.

O método `stream().filter()` aplica o critério de seleção, enquanto `forEach()` realiza a exibição dos resultados no console.

## Regra de Filtragem

A expressão Lambda utilizada é:

```java
FiltroNome filtro = nome -> nome.startsWith("A");
```

Essa expressão retorna `true` quando o nome começa com a letra "A" e `false` nos demais casos.

## Resultado Esperado

```text
Ana
Amanda
Arthur
```

## Conceitos Praticados

| Conceito | Aplicação |
|---|---|
| `@FunctionalInterface` | Definição de interface funcional |
| Lambda | Implementação da regra de filtragem |
| `startsWith()` | Verificação do início de uma String |
| `stream()` | Criação de um fluxo de dados |
| `filter()` | Seleção dos elementos que atendem ao critério |
| `forEach()` | Iteração e exibição dos resultados |
| Method Reference | Referência ao método `testar()` |

## Aprendizado

O exercício demonstra como interfaces funcionais e expressões Lambda permitem separar a definição de uma regra de negócio de sua execução, tornando o código mais reutilizável e organizado.

Também apresenta a integração entre interfaces funcionais próprias e recursos da Stream API.
