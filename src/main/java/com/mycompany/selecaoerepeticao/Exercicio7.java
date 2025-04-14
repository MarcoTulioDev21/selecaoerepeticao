package com.mycompany.selecaoerepeticao;

public class Exercicio7 {

    public void exec7() {
        System.out.println("Iniciando execução do Exercício 7.");

        System.out.println("\n--- Usando WHILE ---");
        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++;
        }

        System.out.println("\n--- Usando DO-WHILE ---");
        int j = 1;
        do {
            System.out.println("Número: " + j);
            j++;
        } while (j <= 5);

        System.out.println("\n--- Usando FOR ---");
        for (int k = 1; k <= 5; k++) {
            System.out.println("Número: " + k);
        }
    }
}
