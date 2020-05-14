package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota do Aluno");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a Segunda nota do Aluno");
		double nota2 = scan.nextDouble();
		
		double media = ( nota1 + nota2 ) / 2;
		
		if (media == 10) {
			System.out.println("! Aprovado com Distinção ! Nota: " + media);
		    } else if (media >= 7) {
			  System.out.println("!! Aprovado !! nota: " + media);  
		      }else System.out.println("!!! Reprovado !!! Nota: " + media);			
		}
	}		


