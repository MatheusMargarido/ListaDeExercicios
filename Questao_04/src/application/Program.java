package application;

import java.util.Scanner;
import entities.Calculadora;

public class Program {
	
		// [QUESTÃO 04] FAÇA UM PROGRAMA QUE PEÇA O PREÇO DO LITRO DA GASOLINA E SOLICITE QUANTOS LITROS FORAM VENDIDOS A DETERMINADO CLIENTE. 
	    //O PROGRAMA DEVE INFORMAR QUANTO O CLIENTE DEVERÁ PAGAR PELA GASOLINA COMPRADA.
	
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        while (continuar) {
            try {
                System.out.print("Informe o valor do litro de gasolina: ");
                double valorGasolina = sc.nextDouble();

                System.out.print("Informe a quantidade de litros comprada: ");
                double quantidadeCompradaCliente = sc.nextDouble();

                System.out.printf("A quantidade que o cliente deverá pagar é: R$ %.2f%n",
                        Calculadora.calculoGasolina(valorGasolina, quantidadeCompradaCliente));
                System.out.println();
                System.out.println("Calcular novamente?");
                System.out.println("[S]im  [N]ão");
                System.out.print("Resposta: ");
                
                char resposta = sc.next().toUpperCase().charAt(0);

                if (resposta == 'N') { 
                    continuar = false;
                	System.out.println("Fim do programa");

                }

            } catch (Exception e) {
                System.out.println("Erro, valor inválido !!!");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
