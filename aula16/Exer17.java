package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
   
	System.out.println("Entre com o ano :");
	int ano = scan.nextInt();
    
    if ( (ano % 400 == 0)  || (ano % 4 == 0 && ano % 100 != 0)) {
    	System.out.println("Ano: "+ ano + " � bissexto.");
	}else {    	System.out.println("Ano: "+ ano + " n�o � bissexto.");
	       }
	}
}

/* Fa�a um Programa que pe�a um n�mero correspondente a um
determinado ano e em seguida informe se este ano � ou n�o bissexto.
*/