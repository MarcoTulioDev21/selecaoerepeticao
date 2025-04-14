package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio5 {

    int numero;

    public void exec5(Scanner input) {
        System.out.println("Iniciando execução do Exercício 5.");

        System.out.println("Digite um número inteiro:");
        numero = input.nextInt();

        System.out.println("\n--- RESULTADO ---");

        if (numero % 2 == 0) { // número par
            System.out.println("O número é par.");
            if (numero % 3 == 0) {
                System.out.println("E é divisível por 3.");
            } else {
                System.out.println("Mas NÃO é divisível por 3.");
            }
        } else { // número ímpar
            System.out.println("O número é ímpar.");
            if (numero % 5 == 0) {
                System.out.println("E é divisível por 5.");
            } else {
                System.out.println("Mas NÃO é divisível por 5.");
            }
        }
    }
}
