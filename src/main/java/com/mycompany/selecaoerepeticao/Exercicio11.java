package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio11 {

    public void exec11(Scanner input) {
        System.out.println("Iniciando execução do Exercício 11.");

        int somaPares = 0; // Soma dos números pares
        int contadorPares = 0; // Contador de números pares
        int numero;

        // Loop para ler números até o usuário digitar 0
        do {
            System.out.print("Digite um número (0 para encerrar): ");
            numero = input.nextInt();

            // Verifica se o número é par e não é 0
            if (numero != 0 && numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            }

        } while (numero != 0);

        // Exibe a média, se houver números pares
        if (contadorPares > 0) {
            double media = (double) somaPares / contadorPares;
            System.out.println("A média dos números pares é: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }
    }
}
