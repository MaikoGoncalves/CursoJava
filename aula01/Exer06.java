package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer06 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite o Raio de uma Circunferência em centimetro :  ");
	double raio = scan.nextDouble();
	double diametro = raio * 2;
	double area = 3.14 * (raio * raio);
	
	System.out.print("O Raio em cm é: " + raio);
	System.out.println();
	System.out.print("O Diametro em cm é: " + diametro );
	System.out.println();
	System.out.print("A Circunferência cm² é: " + area);
		
	}

}
