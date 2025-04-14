package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio16 {

    public void exec16(Scanner input) {
        System.out.println("Iniciando execução do Exercício 16.");

        int somaIdadeHomens = 0, somaIdadeMulheres = 0;
        int contadorHomens = 0, contadorMulheres = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite o sexo (M/F): ");
            char sexo = input.next().toUpperCase().charAt(0); // Aceita 'm' ou 'f'

            System.out.print("Digite a idade: ");
            int idade = input.nextInt();

            if (sexo == 'M') {
                somaIdadeHomens += idade;
                contadorHomens++;
            } else if (sexo == 'F') {
                somaIdadeMulheres += idade;
                contadorMulheres++;
            } else {
                System.out.println("Sexo inválido! Dados ignorados.");
            }
        }

      // Cálculo da média de idade dos homens
double mediaHomens = 0;
if (contadorHomens > 0) {
    mediaHomens = (double) somaIdadeHomens / contadorHomens;
}

// Cálculo da média de idade das mulheres
double mediaMulheres = 0;
if (contadorMulheres > 0) {
    mediaMulheres = (double) somaIdadeMulheres / contadorMulheres;
}


        // Exibição dos resultados
        System.out.println("Média de idade dos homens: " + mediaHomens);
        System.out.println("Média de idade das mulheres: " + mediaMulheres);
    }
}
