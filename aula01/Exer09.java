package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer09 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.print("Digite uma temperatura em Farenheit: ");
	double fare = scan.nextDouble();
	double celsius = (5 * (fare-32) / 9);
	System.out.print("A temperatura em graus Celsius uma temperatura: " + celsius + (" Cº"));
		
	}

}
