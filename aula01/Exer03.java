package com.maiko.cursojava.aula01;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite um Numero: ");	 
		int numero1 = scan.nextInt();
		System.out.println("Digite outro Numero: ");	 
		int numero2 = scan.nextInt();
	    int resultado;
		resultado = numero1 + numero2;
		
		System.out.println("Numero informado é: " + resultado);
		
		
		
	}

}
