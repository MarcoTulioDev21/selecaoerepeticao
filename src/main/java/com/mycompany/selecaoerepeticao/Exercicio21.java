package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio21 {

    public void exec21(Scanner input) {
        System.out.println("Iniciando execução do Exercício 21.");
        
        System.out.print("Digite o valor do lado A: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = input.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores informados PODEM formar um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO PODEM formar um triângulo.");
        }
    }
}
