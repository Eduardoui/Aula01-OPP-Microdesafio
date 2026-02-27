# Aula01-OPP-Microdesafio

## Descrição do Projeto
Este projeto tem como objetivo praticar conceitos de **Programação Orientada a Objetos (OOP)** em Java, criando uma classe `Caneca` que representa objetos do mundo real.  

O objeto **Caneca** possui atributos como **cor**, **tamanho**, **material** e **saldo**, e métodos que permitem interagir com ele, simulando ações do dia a dia, como adicionar valor (ex: crédito) e processar pagamentos.

## Classe Caneca

### Atributos
- `cor` (String): cor da caneca.
- `tamanho` (String): tamanho da caneca (Pequena, Média, Grande).
- `material` (String): material da caneca (Plástico, Vidro, etc.).
- `saldo` (double, privado): valor atual da caneca.

### Construtor
```java
Caneca(String cor, String tamanho, String material)