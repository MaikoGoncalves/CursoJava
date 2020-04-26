package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer05 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite um valor em metro: ");
	float metro = scan.nextFloat();
	float centimentro = metro * 100;
	System.out.print("Valor em metro: " + metro);
	System.out.println();
	System.out.print("Valor em centimentro: " + centimentro);
		
		
		
	}

}
