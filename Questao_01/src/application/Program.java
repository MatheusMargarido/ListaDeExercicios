package application;

import java.util.Scanner;

public class Program {
	
	// [QUESTÃO 01]   FAÇA UM PROGRAMA QUE PEÇA UM NUMERO E ENTÃO MOSTRE A MENSAGEM: O NUMERO INFORMADO FOI [NUMERO]

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		boolean numeroValido = false;

		while (!numeroValido) {

			try {
				System.out.print("Informe um numero inteiro: ");
				n1 = sc.nextInt();
				numeroValido = true;
				
			} catch (Exception e) {

				System.out.println("Erro: Por favor, insira um numero inteiro valido.");
				sc.nextInt();
			}
		}

		System.out.printf("O numero informado foi: [%d]\n", n1);

		sc.close();
	}
}
