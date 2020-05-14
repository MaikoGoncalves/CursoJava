package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer13 {

     		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite um um numero de 1 a 7");
		    int semana = scan.nextInt();
			
		    switch (semana) {
		    case 1: System.out.println("Domingo"); break;
		    case 2: System.out.println("Segundo"); break;
		    case 3: System.out.println("Terça"); break;
		    case 4: System.out.println("Quarta"); break;
		    case 5: System.out.println("Quinta"); break;
		    case 6: System.out.println("Sexta"); break;
		    case 7:	System.out.println("Sabado"); break;
		    default: System.out.println("Valor inválido"); break;
		    }
		}	
	}
		/*3.Faça um Programa que leia um número e exiba o dia correspondente
		da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
		aparecer valor inválido.*/	