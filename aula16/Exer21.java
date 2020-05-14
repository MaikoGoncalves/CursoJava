package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   
		System.out.println("Entre com a quantidade de litro vendido:");
		double litro = scan.nextDouble();
		System.out.println("Entre com o tipo de combustivel:");
		String tipo = scan.next();

		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesc = 0;
		double total = 0;
		double totalDesc =0;
		
		if (tipo.equalsIgnoreCase("a")) {
		   
			if (litro <= 20) {
	            percDesc = 3;
		    }  else {
			percDesc = 5;
		        }
			total = litro * precoAlc;
			
		}else if (tipo.equalsIgnoreCase("g")) {
			   
				if (litro <= 20) {
		            percDesc = 4;
			    }  else {
				percDesc = 6;
			        }
				total = litro * precoGas;
		}
		totalDesc = (total/100) * percDesc;
		double precoApagar = total - totalDesc;
		System.out.println("Total a Pagar: R$" + precoApagar);
		
		}	
		
		

}

/*Um posto est� vendendo combust�veis com a seguinte tabela de
descontos:
. �lcool:
a. at� 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. at� 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o n�mero de litros vendidos, o tipo de
combust�vel (codificado da seguinte forma: A-�lcool, Ggasolina),
calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o
do litro do �lcool � R$ 1,90. */