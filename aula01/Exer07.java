package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer07 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
    System.out.print("Digite em cm um lado do Quadrado: ");
	double lado = scan.nextDouble();
	//double quadrado = lado * lado;
	double quadrado = Math.pow(lado, 2);
	double doublo = quadrado * 2;
		
	System.out.print("A área do quadrado é: " + quadrado);
	System.out.println();
	System.out.print("A quadrado em doublo: " + doublo);
	}
}
