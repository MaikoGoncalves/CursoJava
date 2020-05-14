package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos fazer um triangulo. Entre com o 1ª lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Entre com o 2ª lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Entre com o 3ª lado: ");
		double lado3 = scan.nextDouble();
		
		if ( (lado1 +lado2)>lado3 || (lado2+lado3)>lado1 || (lado2 +lado3) > lado1) { 
		
				
		if ((lado1 == lado2) && (lado2 == lado3)){
		   System.out.println("Triangulo Equilátero");
		}else if ( (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3) ) {  
			System.out.println("Triangulo Escaleno");
		}else if ( (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3) ) {
			System.out.println("Triangulo Isóceles");
		}else System.out.println("Não e um triangulo");
	  }	 
	}
}

