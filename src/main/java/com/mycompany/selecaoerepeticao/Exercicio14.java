package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio14 {

    public void exec14(Scanner input) {
        System.out.print("Digite a altura do triângulo (máximo 20): ");
        int altura = input.nextInt();

        if (altura < 1 || altura > 20) {
            System.out.println("Altura inválida! Deve estar entre 1 e 20.");
            return;
        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
