/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio4 {

    String nome;
    int anos;
    int sexo;
    int estadoCivil;

    public void exec4(Scanner input) {
        System.out.println("Iniciando execução do Exercício 4.");

        System.out.println("Qual o seu nome?");
        input.nextLine(); 
        nome = input.nextLine();

        System.out.println("Qual seu estado civil?");
        System.out.println("1. Solteiro(a)");
        System.out.println("2. Casado(a)");
        estadoCivil = input.nextInt();

        System.out.println("Qual seu sexo?");
        System.out.println("1. Feminino");
        System.out.println("2. Masculino");
        sexo = input.nextInt();

        if (estadoCivil == 2 && sexo == 1) {
            System.out.println("Há quantos anos é casada?");
            anos = input.nextInt();
        }

        System.out.println("\n--- INFORMAÇÕES ---");
        System.out.println("Nome: " + nome);

        if (sexo == 1) {
            System.out.println("Sexo: Feminino");
        } else if (sexo == 2) {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Inválido");
        }

        if (estadoCivil == 1) {
            System.out.println("Estado Civil: Solteiro(a)");
        } else if (estadoCivil == 2) {
            System.out.println("Estado Civil: Casado(a)");
        } else {
            System.out.println("Estado Civil: Inválido");
        }

        if (estadoCivil == 2 && sexo == 1) {
            System.out.println("Tempo de casada: " + anos + " anos");
        }
    }
}
