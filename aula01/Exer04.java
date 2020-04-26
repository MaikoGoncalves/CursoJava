package com.maiko.cursojava.aula01;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite nota do 1º Bimestre: ");
		float nota1 = scan.nextFloat();
		System.out.print("Digite nota do 2º Bimestre: ");
		float nota2 = scan.nextFloat();
		System.out.print("Digite nota do 3º Bimestre: ");
		float nota3 = scan.nextFloat();
		System.out.print("Digite nota do 4º Bimestre: ");
		float nota4 = scan.nextFloat();
		
		float resultado = (nota1+nota2+nota3+nota4)/4 ;
		
		
		
		
		System.out.println("Sua Primeira nota foi: " + nota1);
		System.out.println("Sua Segunda nota foi: " + nota2);
		System.out.println("Sua Terceira nota foi: " + nota3);
		System.out.println("Sua Quarta nota foi: " + nota4);
		
		System.out.print("Media de suas notas são: " + resultado);
		
				
		
		
		
	}

}
