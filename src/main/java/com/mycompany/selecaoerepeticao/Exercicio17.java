package com.mycompany.selecaoerepeticao;

import java.util.Scanner;

public class Exercicio17 {

    public void exec17(Scanner input) {
        System.out.println("Iniciando execução do Exercício 17.");

        System.out.print("Digite sua altura (em metros): ");
        double altura = input.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        String classificacao;
        String mensagem;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
            mensagem = "Você está abaixo do peso ideal. É aconselhável procurar orientação médica.";
        } else if (imc < 25) {
            classificacao = "Peso normal";
            mensagem = "Parabéns! Você está com o peso ideal.";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
            mensagem = "Você está com sobrepeso. Considere adotar hábitos mais saudáveis.";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
            mensagem = "Você está com obesidade grau I. É importante buscar acompanhamento médico.";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
            mensagem = "Você está com obesidade grau II. Recomenda-se atenção médica especializada.";
        } else {
            classificacao = "Obesidade grau III";
            mensagem = "Você está com obesidade grau III. É fundamental procurar ajuda médica imediatamente.";
        }

        System.out.println("Classificação: " + classificacao);
        System.out.println("Mensagem: " + mensagem);
    }
}
