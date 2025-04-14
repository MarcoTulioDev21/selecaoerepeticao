package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio6 {

    char turno;

    public void exec6(Scanner input) {
        System.out.println("Iniciando execução do Exercício 6.");

        System.out.println("Em que turno você estuda?");
        System.out.println("Digite M para Matutino, V para Vespertino ou N para Noturno:");
        turno = input.next().toUpperCase().charAt(0); // le apenas a primeira letra e converte para maiúscula

        System.out.println("\n--- RESULTADO ---");

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Turno inválido.");
        }
    }
}
