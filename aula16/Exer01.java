package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um numero: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Entre com outro numero: ");
		double numero2 = scan.nextDouble();

		if (numero1 > numero2){
			System.out.println("Numero maior é: " + numero1);
		}else {
			System.out.println("Numero maior é: " + numero2);
		}
		
	}

}
