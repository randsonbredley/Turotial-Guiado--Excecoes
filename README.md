# Tutorial Guiado: Tratamento de Erros e Exceções em Java ☕

Este repositório contém o código-fonte e a resolução dos exercícios do **Tutorial Guiado de Exceções em Java**, desenvolvido para a disciplina de Programação Orientada a Objetos (POO) do IFPE - Campus Belo Jardim.

---

## 📌 Conteúdo e Atividades

O objetivo deste repositório é demonstrar como o Java lida com erros em tempo de execução (*Runtime Exceptions*), como utilizar o bloco `try-catch` para evitar falhas no programa, como validar entradas de utilizador com `Scanner` e como aplicar o encapsulamento defensivo lançando exceções com `throw`.

### 🗂️ Estrutura do Projeto & Commits

* **Parte 1: Provocando um Crash (Erro em Tempo de Execução)**
  * **Atividade 1.1:** Criação da classe `TesteArray`. Demonstração da exceção `ArrayIndexOutOfBoundsException` ao tentar acessar um índice inexistente no array.

* **Parte 2: A Dupla `try` e `catch`**
  * **Atividade 2.1:** Proteção do código da classe `TesteArray` usando a estrutura `try-catch` para capturar a exceção e permitir que a execução do programa continue com sucesso.

* **Parte 3: Lidando com Usuários Imprevisíveis (`Scanner`)**
  * **Atividade 3.1:** Demonstração do erro `InputMismatchException` ao tentar ler uma `String` (ex: `"batata"`) usando o método `scanner.nextInt()`.
  * **Atividade 3.2:** Implementação da classe `InputSeguro`. Utilização de um laço `while` combinado com `try-catch` e `scanner.nextLine()` para forçar a introdução de um número válido.

* **Parte 4: Protegendo o Estado do Objeto (`throw new`)**
  * **Atividade 4.1:** Implementação da classe `GoodDog` e do teste `TesteCachorro`. Lançamento de uma exceção `IllegalArgumentException` quando um valor inválido (tamanho negativo) é passado para o método `setSize()`.

* **Parte 5: Desafio Final - Blindando o Jogo!**
  * **Desafio:** Refatoração do método `getUserInput` da classe `GameHelper` (do *Simple Startup Game*) utilizando a lógica de validação desenvolvida na Atividade 3.2, impedindo que o jogo feche caso o jogador digite um texto.

---

## 🛠️ Exemplo de Código (Desafio Final - `GameHelper.java`)

```java
import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(prompt + ": ");
            try {
                palpite = scanner.nextInt();
                entradaValida = true;
            } catch (Exception ex) {
                System.out.println("Erro! Por favor, digite apenas números inteiros.");
                scanner.nextLine(); // Limpa o buffer do Scanner
            }
        }

        return palpite;
    }
}
