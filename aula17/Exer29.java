package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int n =scan.nextInt();
		
		boolean primo;
		
		
		for ( int i=1; i<=n; i++){
			  
			primo = true;
		
		    
			for ( int j=2; j<i; j++){
	             if (i % j == 0) {
			         primo = false;
	             }	
	        } 	
		
		
		
		if (primo) {
		      System.out.println(i);
	         
		}	
		
	 }
	}
}

