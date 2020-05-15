package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidades de idades: ");
		int idades =scan.nextInt();

		double soma =0;
		double media;
		double idade;
		
		for (int i=0; i<idades; i++) {
		System.out.println("Entre com a idade da pessoa " + (i+1));
        idade = scan.nextDouble();
        
        soma +=idade;
		}
		media = soma/idades;
		System.out.println("Media das pessoas: "+ media);
		
		
		if (media >= 0 && media <=25) {
		System.out.println("Jovem ");
		}else if (media >=26 && media <=60) {
		System.out.println("Adulto ");
		}else if (media > 60) {
			System.out.println("Idosa ");
		}
	}
}