package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   
		System.out.println(" Digite um numero inteiro:");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(" Par ");
		}else System.out.println(" Impar");
	}

}

/*Fa�a um Programa que pe�a um n�mero inteiro e determine se ele �
par ou impar. Dica: utilize o operador m�dulo (resto da divis�o).
*/