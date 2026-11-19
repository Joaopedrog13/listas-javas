# Listas de Exercícios - Java

PUC Minas · Análise e Desenvolvimento de Sistemas · Prof. Wesley Dias Maciel
Aluno: João Pedro de Sousa

Cada exercício está na sua própria pasta (`lista-XX/exercicio-N/`), com o `Main.java` e as demais classes em arquivos separados.

## Como executar no GitHub Codespaces

1. No repositório, clique em **Code → Codespaces → Create codespace on main**. O ambiente já abre com o JDK 17.
2. No terminal, entre na pasta do exercício, compile e execute:

```bash
cd lista-04/exercicio-1
javac -encoding UTF-8 Main.java
java Main
```

O `javac Main.java` também compila as outras classes da pasta (por exemplo, `Pedido.java` e `Produto.java`).

> Rode os exercícios pelo **terminal**. Como todas as pastas têm uma classe `Main`, o botão "Run" do VS Code pode acusar classes duplicadas ao abrir o repositório inteiro.

## Exercícios

| Lista | Assunto | Exercício | Executar |
|---|---|---|---|
| 01 | Estrutura sequencial | 1 a 7: média, aumento de salário, losango, Celsius → Fahrenheit, salários mínimos, hipotenusa, círculo e esfera | `java Main` |
| 02 | Estrutura condicional | 1 situação do aluno · 2 IMC · 3 preço pelo código | `java Main` |
| 03 | Repetição: while | 1 notas e faltas da turma · 2 situação por matrícula · 3 audiência de TV | `java Main` |
| 04 | Repetição: do-while | 1 validação de dados · 2 média/menor/maior nota · 3 jogo de adivinhação | `java Main` |
| 05 | Repetição: for | 1 fatorial · 2 média de idades · 3 potência só com multiplicação | `java Main` |
| 06 | Array: vetor | 1 operações com vetor · 2 soma de dois vetores · 3 soma das metades | `java Main` |
| 07 | Array: matriz | 1 matriz 5x5 · 2 soma de matrizes 2x2 · 3 colunas pares e ímpares 6x6 | `java Main` |
| 08 | Modularização: método | 1 Pedido e Produto · 2 Calculadora (menu) · 3 Funcionario | `java Main` |
| 09 | POO | 1 ContaCorrente (com javadoc) · 2 Aluno · 3 Produto | ex. 1 e 2: `java Main` · ex. 3: `java Principal` |
| 10 | Polimorfismo | 1 PessoaEstrangeira (pacotes `pessoa` e `principal`) | ver abaixo |
| 11 | Polimorfismo | 1 zoológico com vetor de 10 animais (pacotes `animal` e `principal`) | `java principal.Principal` |
| 13 | Lombok | 1 vetor de Pessoa com classes geradas pelo Lombok | ver abaixo |
| 14 | Varargs | 1 CentroDeDistribuicao soma valores por tipo | `java Main` |
| 15 | Padrão Builder | 1 Builder · 2 Director · 3 validações no build() | `java Main` |
| 16 | Switch e enum | 1 NivelAcesso · 2 TipoFrete | `java Main` |

### Casos especiais

**Lista 09 - Exercício 3** (a classe principal se chama `Principal`, como pede o enunciado):
```bash
cd lista-09/exercicio-3
javac -encoding UTF-8 Principal.java
java Principal
```

**Lista 09 - Exercício 1** - gerar a documentação javadoc:
```bash
cd lista-09/exercicio-1
javac -encoding UTF-8 Main.java
javadoc -encoding UTF-8 -d docs *.java
java Main
```
Para ver a documentação, clique com o botão direito em `docs/index.html` → **Open with Live Server** (a extensão já vem instalada no Codespace).

**Lista 10 - Exercício 1** (usa pacotes, igual ao exemplo do professor):
```bash
cd lista-10/exercicio-1
javac -encoding UTF-8 principal/Principal.java
java principal.Principal
```

**Lista 11 - Exercício 1** (pacotes `animal` e `principal`):
```bash
cd lista-11/exercicio-1
javac -encoding UTF-8 principal/Principal.java
java principal.Principal
```
Urso e Zebra imprimem "Som de animal.": o Urso chama `super.emitirSom()` e a Zebra não sobrescreve o método, exatamente como no enunciado.

**Lista 13 - Exercício 1** (Lombok): o Codespace baixa o `lib/lombok.jar` sozinho ao ser criado. Se a pasta `lib` não existir, rode `bash baixar-lombok.sh` uma vez.
```bash
cd lista-13/exercicio-1
javac -encoding UTF-8 -cp lib/lombok.jar Principal.java
java Principal
```
O `-cp lib/lombok.jar` só é necessário para compilar: é ele que gera construtores, getters, setters e `toString()`.

## Compilação automática

A cada envio para o GitHub, a aba **Actions** compila todos os exercícios. Aparece ✅ quando tudo compila e ❌ se algum exercício tiver erro.

Para não gastar a cota do Codespaces, pare o ambiente ao terminar: **Code → Codespaces → … → Stop codespace**.
