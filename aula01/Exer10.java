package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer10 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Digite uma temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		double fare = (celsius * 9/5) + 32;
		System.out.print("A temperatura em graus Celsius uma temperatura: " + fare);
	    
	    
	    
	}

}
