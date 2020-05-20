package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com numero de turmas: ");
		int turmas =scan.nextInt();
	   
		int numAlunos;
		double soma = 0;
		double media = 0;
		boolean invalido = false;
		
		for (int i = 0; i<turmas; i++) { 
			
			do {
			    System.out.println("Entre com numero de alunos da  turmas: ");
		        numAlunos = scan.nextInt();
		
		        if (numAlunos <= 40) {
		            invalido = true;
		            }else {
		            	System.out.println("Digite novamente. Quantidade em turmas menos que 40 ");
				        
		            }    	
			   } while (!invalido);
		       soma += numAlunos;
	           media = soma /turmas;		
			}
			System.out.println("Media "  + media);
			
	}
  }
 

