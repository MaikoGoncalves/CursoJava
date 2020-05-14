package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número para gerar a tabuada: ");
		int num1 =scan.nextInt();

		System.out.println("Tabuada de " + num1 + ":");
		
		for (int i=1; i<=10; i++) {
		System.out.println(num1 + " x " + i + " = " + (num1*i));
			
		}
	}
}
