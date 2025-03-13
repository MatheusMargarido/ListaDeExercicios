package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {

	/*
	 * [QUESTAO 05] FAÇA UM PROGRAMA QUE PEÇA O VALOR DE UMA VIAGEM “EUROTRIP” QUE
	 * SERÁ REALIZADA POR UM GRUPO DE AMIGOS. OS BRASILEIROS SAIRÃO COM DESTINO A
	 * TRÊS LOCAIS: 1º ALEMANHA, 2º PORTUGAL E 3º ITÁLIA. O PROGRAMA DEVE SOLICITAR
	 * O PREÇO ATUAL DE CADA VIAGEM, A QUANTIDADE DE PESSOAS QUE IRÃO NESSA VIAGEM.
	 * APÓS ISSO, IMPRIMIR O VALOR TOTAL DA VIAGEM SOMANDO A QUANTIDADE TOTAL DE
	 * PESSOAS QUE VISITARÃO TODOS OS 03 DESTINOS.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			
			try {
				
				System.out.print("Informe a quantidade de pessoas: ");
				int qtd = sc.nextInt();
				System.out.println("Informe os valores atuais da viagem");

				System.out.print("Portugal: ");
				double valorPortugal = sc.nextDouble();

				System.out.print("Italia: ");
				double valorItalia = sc.nextDouble();

				System.out.print("Alemanha: ");
				double valorAlemanha = sc.nextDouble();
				
				System.out.printf("[O valor total da viagem de %d integrantes será de R$ %.2f]" 
						,qtd, Calculadora.calculoViagem(valorPortugal, valorItalia, valorAlemanha, qtd));
				
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
				System.out.println("Erro valor invalido !!!");
				sc.nextLine();
			}

		}

		sc.close();
	}

}
