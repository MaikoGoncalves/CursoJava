package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de Cds: ");
		int cds =scan.nextInt();
		
		double preco;
		double soma = 0;
		double media = 0;
		
		for (int i=0; i<cds; i++) { 
			
			
			System.out.println("Entre com o valor do cds: ");
            preco = scan.nextDouble();
		    soma +=preco;
		
		    
		}
		media = soma/cds;
		System.out.println("Media " + media);
		
		
		
		
		
		
	}

}
