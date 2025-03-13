package application;

import java.util.Scanner;
import entities.*;

public class Program {

    //  [QUESTÃO 2] FAÇA UM PROGRAMA QUE PEÇA DOIS NUMEROS E IMPRIMA A SOMA, A SUBTRAÇÃO E A MULTIPLICAÇÃO DO PRIMEIRO PELO SEGUNDO

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            try {
                System.out.println();
                System.out.println("--- Calculadora ---");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Divisão");
                System.out.println("4 - Multiplicação");
                System.out.println("5 - Encerrar");

                System.out.print("Resposta: ");
                int resposta = sc.nextInt();

               
                if (resposta == 5) {
                    System.out.println("--- Fim do Programa ---");
                    break;
                }

                if (resposta < 1 || resposta > 5) {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }

                System.out.print("Informe o primeiro número: ");
                double n1 = sc.nextDouble();

                System.out.print("Informe o segundo número: ");
                double n2 = sc.nextDouble();

                switch (resposta) {
                    case 1:
                        System.out.println("[Resposta] A soma de " + n1 + " + " + n2 + " = " + Calculadora.somar(n1, n2));
                        break;

                    case 2:
                        System.out.println("[Resposta] A subtração de " + n1 + " - " + n2 + " = " + Calculadora.subtrair(n1, n2));
                        break;

                    case 3:
                        if (n2 != 0) {
                            System.out.println("[Resposta] A divisão de " + n1 + " / " + n2 + " = " + Calculadora.dividir(n1, n2));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida!");
                        }
                        break;

                    case 4:
                        System.out.println("[Resposta] A multiplicação de " + n1 + " x " + n2 + " = " + Calculadora.multiplicar(n1, n2));
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Erro: por favor, insira um número válido.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
