package com.maiko.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um N�mero");
		int num = scan.nextInt();
		
		System.out.println("Entre com umm limite");
		int max = scan.nextInt();
		
		for (int i=num; i<=max; i++) {
             if (i % 7 == 0) {
             System.out.println("O valor de i �: " + i);
             break;
             }
         }
     }
}
