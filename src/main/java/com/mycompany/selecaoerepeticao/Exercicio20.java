package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio20 {

    public void exec20(Scanner input) {
        System.out.println("Iniciando execução do Exercício 20.");

        System.out.print("Quantos números da sequência de Fibonacci deseja exibir? ");
        int n = input.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(); // Quebra de linha ao final
    }
}
