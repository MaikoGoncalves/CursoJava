package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   
		System.out.println("Entre com a quantidade (KG) Morango:");
		double kgMorango = scan.nextDouble();
		System.out.println("Entre com a quantidade (KG) Maça:");
		double kgMaca = scan.nextDouble();
		
		double precokgMorango = 0;
		double precokgMaca = 0;
		if(kgMorango <= 5) {
           precokgMorango = 2.5;
	    }else {
           precokgMorango = 2.2;
	    }
		if(kgMaca <= 5) {
	           precokgMaca = 1.8 ;
		    }else {
	           precokgMaca = 1.5;
		    }
			
		double precoTotalMorango = kgMorango * precokgMorango;
		double precoTotalMaca = kgMaca * precokgMaca;
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		if ((kgMorango + kgMaca > 8) || precoParcial > 25) {
		    precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		System.out.println("Preço total R$: " + precoTotal);
   }         
}
/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.*/