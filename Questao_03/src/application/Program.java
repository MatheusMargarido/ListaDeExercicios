package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {
	
    // [QUESTÃO 03] FAÇA UM PROGRAMA QUE PEÇA AS 4 NOTAS BIMESTRAIS E MOSTRE A MEDIA
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean resposta = true;

		while (resposta) {
			
			try {
				
				System.out.println("Informe as notas Bimestrais");
				System.out.print("Nota 01: ");
				double n1 = sc.nextInt();
				System.out.print("Nota 02: ");
				double n2 = sc.nextInt();
				System.out.print("Nota 03: ");
				double n3 = sc.nextInt();
				System.out.print("Nota 04: ");
				double n4 = sc.nextInt();
				
				System.out.println("A media das 4 notas apresentadas é: " + Calculadora.media(n1, n2, n3, n4));
				resposta = false;

			} catch (Exception e) {
				System.out.println("Valor invalido!!");
				sc.nextLine();
			}
			
		}
		sc.close();

	}

}
