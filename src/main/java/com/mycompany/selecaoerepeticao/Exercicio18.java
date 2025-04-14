package com.mycompany.selecaoerepeticao;

public class Exercicio18 {

    public void exec18() {
        System.out.println("Números primos de 1 até 100:");

        for (int num = 2; num <= 100; num++) {
            int contador = 0;

            // Conta quantos divisores o número tem
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contador++;
                }
            }

            // Se tiver só dois divisores (1 e ele mesmo), é primo
            if (contador == 2) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); 
    }
}
