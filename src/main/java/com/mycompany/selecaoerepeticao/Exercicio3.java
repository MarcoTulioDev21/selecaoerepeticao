package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio3 {

    int numero, multiplicador;

    public void exec3(Scanner input) {

        System.out.println("Iniciando execucação do Exercício 3.");
        System.out.println("Insira um número");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            multiplicador = numero * numero;
            System.out.println("O número é par. \n");
            System.out.println("O quadrado desse número é: " + multiplicador);
        } else {
            multiplicador = numero * numero * numero;
            System.out.println(" O número é impar. \n");
            System.out.println("O cubo desse número é: " + multiplicador);
        }
    }

}
