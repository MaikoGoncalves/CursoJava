package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer06 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite o Raio de uma Circunfer�ncia em centimetro :  ");
	double raio = scan.nextDouble();
	double diametro = raio * 2;
	double area = 3.14 * (raio * raio);
	
	System.out.print("O Raio em cm �: " + raio);
	System.out.println();
	System.out.print("O Diametro em cm �: " + diametro );
	System.out.println();
	System.out.print("A Circunfer�ncia cm� �: " + area);
		
	}

}
