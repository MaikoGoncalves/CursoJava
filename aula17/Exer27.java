package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a qtd de temperaturas");
		int qtdTemperaturas = scan.nextInt();
		
		double temp;
		double soma = 0;
		double media = 0;
		double menor = Double.MAX_VALUE ;
		double maior = Double.MIN_NORMAL;
		
		for (int i=1; i<= qtdTemperaturas; i++) {
		
		System.out.println("Entre com a Temperatura " + i + "ª"  );
			temp = scan.nextDouble();
			
		soma += temp;	
		
		if (temp > maior) {	
	        maior = temp;
		   }
		if (temp < menor) {
			menor = temp;
		   }
		
		}	
	     media = soma / qtdTemperaturas;
	     System.out.println("Media da Temperaturas " + media + "°C"  );
	     System.out.println("Menor Temperatura " + menor + "°C"  );
	     System.out.println("Maior Temperatura " + maior + "°C"  );
		 	
	
	}

}
