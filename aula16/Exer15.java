package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos fazer um triangulo. Entre com o 1� lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Entre com o 2� lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Entre com o 3� lado: ");
		double lado3 = scan.nextDouble();
		
		if ( (lado1 +lado2)>lado3 || (lado2+lado3)>lado1 || (lado2 +lado3) > lado1) { 
		
				
		if ((lado1 == lado2) && (lado2 == lado3)){
		   System.out.println("Triangulo Equil�tero");
		}else if ( (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3) ) {  
			System.out.println("Triangulo Escaleno");
		}else if ( (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3) ) {
			System.out.println("Triangulo Is�celes");
		}else System.out.println("N�o e um triangulo");
	  }	 
	}
}

