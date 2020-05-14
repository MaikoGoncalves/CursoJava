package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String prod1=scan.next();
		System.out.println("Digite o preço do produto: ");
	    Double preco1=scan.nextDouble();
	    
	    System.out.println("Digite o nome do produto: ");
		String prod2=scan.next();
		System.out.println("Digite o preço do produto: ");
	    Double preco2=scan.nextDouble();
		
	    System.out.println("Digite o nome do produto: ");
		String prod3=scan.next();
		System.out.println("Digite o preço do produto: ");
	    Double preco3=scan.nextDouble();
		
        if ((preco1<=preco2) && (preco1<=preco3)) {
            System.out.println("O produto com menor preço é: " + prod1);
            System.out.println("O preço dele é: " + preco1);
    	    }   else if ((preco2<=preco1) && (preco2<=preco3)) {
    	    	System.out.println("O produto com menor preço é: " + prod2);
                System.out.println("O preço dele é: " + preco2);
        	    }   else if ((preco3<=preco1) && (preco3<=preco2)) {
        	    	System.out.println("O produto com menor preço é: " + prod3);
                    System.out.println("O preço dele é: " + preco3); 
	        	    }
	
	}

}
