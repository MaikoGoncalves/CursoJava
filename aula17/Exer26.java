package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		int n =scan.nextInt();
		
		System.out.println("Fatorial de " + n);
		
		System.out.print(n + "! = ");
		int fatorial = 1;
		
		for (int i=n; i>1; i--) {
		     fatorial *= i;	
				
		     System.out.print(i + " . "); 
		}
		System.out.println("1 = " + fatorial);
		
			
	}

}
