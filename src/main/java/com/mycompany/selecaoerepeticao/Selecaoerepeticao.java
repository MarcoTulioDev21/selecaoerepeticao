package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Selecaoerepeticao {

    public static void main(String[] args) {
        int opt; // Escolhe a atividade
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu de exercícios");
            System.out.println("1. Exercicio 1. \n");
            System.out.println("2. Exercicio 2. \n");
            System.out.println("3. Exercicio 3. \n");
            System.out.println("4. Exercicio 4. \n");
            System.out.println("1. Exercicio 5. \n");
            System.out.println("2. Exercicio 6. \n");
            System.out.println("3. Exercicio 7. \n");
            System.out.println("4. Exercicio 8. \n");
            System.out.println("1. Exercicio 9. \n");
            System.out.println("2. Exercicio 10. \n");
            System.out.println("3. Exercicio 11. \n");
            System.out.println("4. Exercicio 12. \n");
            System.out.println("1. Exercicio 13. \n");
            System.out.println("2. Exercicio 14. \n");
            System.out.println("3. Exercicio 15. \n");
            System.out.println("4. Exercicio 16. \n");
            System.out.println("1. Exercicio 17. \n");
            System.out.println("2. Exercicio 18. \n");
            System.out.println("3. Exercicio 19. \n");
            System.out.println("4. Exercicio 20. \n");
            System.out.println("1. Exercicio 21. \n");
            System.out.println("0. Sair. \n"); // Pressione 0 para sair.

            System.out.println("Escolha sua opção: ");
            opt = input.nextInt();

switch (opt) {
    case 1:
        System.out.println("Iniciando a execução do exercício 1...\n");
        Exercicio1 ex1 = new Exercicio1();
        ex1.exec1();
        break;
    case 2:
        Exercicio2 exercicio2 = new Exercicio2();
        exercicio2.exec2(input);
        break;
    case 3:
        Exercicio3 exercicio3 = new Exercicio3();
        exercicio3.exec3(input);
        break;
    case 4:
        Exercicio4 exercicio4 = new Exercicio4();
        exercicio4.exec4(input);
        break;
    case 5:
        Exercicio5 exercicio5 = new Exercicio5();
        exercicio5.exec5(input);
        break;
    case 6:
        Exercicio6 exercicio6 = new Exercicio6();
        exercicio6.exec6(input);
        break;
    case 7:
        Exercicio7 exercicio7 = new Exercicio7();
        exercicio7.exec7();
        break;
    case 8:
        Exercicio8 exercicio8 = new Exercicio8();
        exercicio8.exec8();
        break;
    case 9:
        Exercicio9 exercicio9 = new Exercicio9();
        exercicio9.exec9(input);
        break;
    case 10:
        Exercicio10 exercicio10 = new Exercicio10();
        exercicio10.exec10(input);
        break;
    case 11:
        Exercicio11 exercicio11 = new Exercicio11();
        exercicio11.exec11(input);
        break;
    case 12:
        Exercicio12 exercicio12 = new Exercicio12();
        exercicio12.exec12();
        break;
    case 13:
        Exercicio13 exercicio13 = new Exercicio13();
        exercicio13.exec13(input);
        break;
    case 14:
        Exercicio14 exercicio14 = new Exercicio14();
        exercicio14.exec14(input);
        break;
    case 15:
        Exercicio15 exercicio15 = new Exercicio15();
        exercicio15.exec15();
        break;
    case 16:
        Exercicio16 exercicio16 = new Exercicio16();
        exercicio16.exec16(input);
        break;
    case 17:
        Exercicio17 exercicio17 = new Exercicio17();
        exercicio17.exec17(input);
        break;
    case 18:
        Exercicio18 exercicio18 = new Exercicio18();
        exercicio18.exec18();
        break;
    case 19:
        Exercicio19 exercicio19 = new Exercicio19();
        exercicio19.exec19(input);
        break;
    case 20:
        Exercicio20 exercicio20 = new Exercicio20();
        exercicio20.exec20(input);
        break;
    case 21:
        Exercicio21 exercicio21 = new Exercicio21();
        exercicio21.exec21(input);
        break;
    case 0: // Pressione 0 para sair.
        // Sai do programa.
        System.out.println("Programa finalizado com sucesso!");
        break;

    default: // Retornando mensagem de erro
        System.out.println("Opção inválida, tente novamente.");
        break;
}


        } while (opt != -1);
    }
}
