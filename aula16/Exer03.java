package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
	     Scanner scan = new Scanner (System.in);
	     System.out.println("Digite F-Feminino M-Masculino");
		 String sexo = scan.next();
	     
		    switch(sexo) {
			case "m": System.out.println("Masculino"); break;
			case "M": System.out.println("Masculino"); break;
			case "F": System.out.println("Feminino"); break;
			case "f": System.out.println("Feminino"); break;
			
			default: System.out.println("Sexo Inválido");
	  
	}
  }
}
