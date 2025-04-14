package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio13 {

    public void exec13(Scanner input) {
        System.out.println("Iniciando execução do Exercício 13.");

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = input.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        // Loop para imprimir a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
