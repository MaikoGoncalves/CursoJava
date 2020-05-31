package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";
		
		do {

			System.out.println("Digite o c�digo e a quantidade. Digite 0 0 para sair ");
			cod = scan.nextInt();	
			qtd = scan.nextInt();
		
		    if (cod == 0 && qtd == 0) {
		        naoTerminar = false;	
		        output += "Total a Pagar R$:" + total;
		        	        
		    }else {
		    	if (cod == 100) {
		    		output += " Cachorro quente -> 1.20 * " + qtd;
		    		output += " = " + (1.2*qtd) + "\n";
		    		total += qtd * 1.20;
		    	}else if(cod == 101) {
		    		output += " Bauru Simples -> 1.30 * " + qtd;
		    		output += " = " + (1.3*qtd) + "\n";
		    		total += qtd * 1.30;
		    	}else if(cod == 102) {
		    		output += " Bauru com ovo -> 1.50 * " + qtd;
		    		output += " = " + (1.5*qtd) + "\n";
		    		total += qtd * 1.50;
		    	}else if(cod == 103) {
		    		output += " Hamb�rguer-> 1.20 * " + qtd;
		    		output += " = " + (1.2*qtd) + "\n";
		    		total += qtd * 1.20;
		    	}else if(cod == 104) {
		    		output += " Cheeseburguer -> 1.30 * " + qtd;
		    		output += " = " + (1.3*qtd) + "\n";
		    		total += qtd * 1.30;
		    	}else if(cod == 105) {
		    		output += " Refrigerante -> 1.00 * " + qtd;
		    		output += " = " + (1*qtd) + "\n";
		    		total += qtd * 1;
		    	}
		    			    	
		    }
		}while(naoTerminar);	
	System.out.print(output);
	}

}
