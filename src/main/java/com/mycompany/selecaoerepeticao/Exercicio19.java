package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio19 {

    public void exec19(Scanner input) {
        System.out.println("Iniciando execução do Exercício 19.");
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            int fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
