package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		double popA, popB;
		double taxaA, taxaB;
		
		boolean valido = false;
		// Popula��o A
		do {
			System.out.println("Entre com a Popula��o A: ");
			popA =scan.nextDouble();
		    
			if(popA > 0) {
		      valido = true;
			}else System.out.println("Popula��o maior que 0.");
		}while (!valido);
		
		//	Popula��o B
		do {
			System.out.println("Entre com a Popula��o B: ");
			popB =scan.nextDouble();
		    
			if(popB > 0) {
		      valido = true;
			}else System.out.println("Popula��o maior que 0.");
		}while (!valido);	
			
		// taxa do a	
		do {
			System.out.println("Entre com a taxa de crescimento da popula��o  A: ");
			taxaA =scan.nextDouble();
		    
			if(taxaA > 0) {
		      valido = true;
			}else System.out.println("Taxa maior que 0.");
		}while (!valido);			
	
		// taxa do B
				do {
					System.out.println("Entre com a taxa de crescimento da popula��o  B: ");
					taxaB =scan.nextDouble();
				    
					if(taxaB > 0) {
				      valido = true;
					}else System.out.println("Taxa maior que 0.");
				}while (!valido);	
				
				int cont = 0;
				
				while (popA < popB) {
					
					popA += (popA/100) * taxaA;
					popB += (popB/100) * taxaB;
					cont++;
								
				}
				System.out.println("Popula��o A: " + popA);
				System.out.println("Popula��o B: " + popB);
				System.out.println("Anos pra ficar igual: " + cont);
					
	}
}
		
		
		
				
	
		
		