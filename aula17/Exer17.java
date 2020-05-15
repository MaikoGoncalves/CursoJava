package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com um número: ");
	int n =scan.nextInt();
	
	int fatorial = 1;
	
	for (int i=n; i>0; i--) {
	     fatorial *= i;	
			
	     System.out.println(i); 
	}
	System.out.println(" Resultado : " + fatorial);
  }
}
