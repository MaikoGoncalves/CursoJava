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

/*Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
*/