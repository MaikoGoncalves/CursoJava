package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite sua altura: ");
		double altura = scan.nextDouble();
		double peso = 72.7*altura - 58;
		System.out.print("Seu peso ideal é: " + peso);		
		
	}

}
