package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		double valor1 = scan.nextDouble();
		System.out.println("Digite um outro valor inteiro: ");
		double valor2 = scan.nextDouble();
		System.out.println("Digite um valor inteiro ultima vez :) :)... ");
		double valor3 = scan.nextDouble();
		
		if ((valor1 >= valor2) && (valor1 >= valor3) && (valor2 >= valor3)) 
		{ System.out.println("O valores decrescente são: " + valor1 );
		  System.out.println("" + valor2 );
		  System.out.println("" + valor3 );		
		} else if ((valor1 >= valor2) && (valor1 >= valor3) && (valor3 >= valor2)) 
		   { System.out.println(" O valores decrescente são:  " + valor1);
		     System.out.println("" +valor3 );		  
		     System.out.println("" +valor2 );
		   } else if ((valor2 >= valor1) && (valor2 >= valor3) && (valor1 >= valor3)) 
		      { System.out.println(" O valores decrescente são:  " + valor2);
		        System.out.println("" + valor1);
		        System.out.println("" + valor3);
		      } else if ((valor2 >= valor1) && (valor2 >= valor3) && (valor3 >= valor1)) 
			     { System.out.println(" O valores decrescente são:  " + valor2);
			       System.out.println("" + valor3);
			       System.out.println("" + valor1);
			     } else if ((valor3 >= valor1) && (valor3 >= valor2) && (valor1 >= valor2)) 
			       { System.out.println(" O valores decrescente são:  " + valor3);
			         System.out.println("" + valor1);
			         System.out.println("" + valor2);
				   } else if ((valor3 >= valor1) && (valor3 >= valor2) && (valor2 >= valor1)) 
				     { System.out.println(" O valores decrescente são:  " + valor3);
				       System.out.println("" + valor2);
				       System.out.println("" + valor1);
				     } 
	}

}
