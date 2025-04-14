package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio10 {

    public void exec10(Scanner input) {
        System.out.println("Iniciando execução do Exercício 10.");

        int negativos = 0; // Contador de valores negativos

        // Loop para ler 5 valores
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "° valor: ");
            int valor = input.nextInt();

            // Verifica se o valor é negativo
            if (valor < 0) {
                negativos++;
            }
        }

        // Exibe a quantidade de números negativos
        System.out.println("Quantidade de valores negativos: " + negativos);
    }
}
