package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um numero positivo ou negativo");
		double numero = scan.nextDouble();
		
		if (numero >=0) {
			System.out.print(" O Valor digitado é: " + numero);
			System.out.println(" Este valor e positivo");
						
		}else {  
			System.out.print("O Valor digitado é: " + numero);
		    System.out.println(" Este valor e negativo");
		}
	}
	

}
