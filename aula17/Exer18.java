package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um n�mero: ");
		int n =scan.nextInt();
        
		boolean primo = true;
		
		for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
			System.out.println("N�o � primo");
			primo = false;
	        	//break;
	        } 	
	}
	if (primo) {
		System.out.println("� primo: " + n);
	}
    
   }
}
