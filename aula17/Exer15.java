package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com um númeoro: ");
	int n =scan.nextInt();		
	
	int primeiro = 1;
	int segundo = 1;
    int proximo;				
				
	for(int i=3; i<=n; i++) {
       
		proximo = primeiro + segundo;
		primeiro = segundo;
		segundo = proximo;
		
		System.out.println(proximo);

	}
	}
}
