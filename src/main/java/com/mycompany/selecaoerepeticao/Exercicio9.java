package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio9 {

    public void exec9(Scanner input) {
        System.out.println("Iniciando execução do Exercício 9.");

        System.out.print("Quantos números ímpares você deseja mostrar? ");
        int n = input.nextInt();

        int numeroImpar = 2 * n - 1;

        System.out.println("Os " + n + " primeiros números ímpares em ordem decrescente são:");

        for (int i = 0; i < n; i++) {
            System.out.println(numeroImpar - (2 * i)); // Calculando os números ímpares
        }
    }
}
