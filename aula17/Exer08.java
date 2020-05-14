package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		int num,  i, media;
		int soma =0;
		
	    for (i=0 ; i < 5 ; i++) {
	    	System.out.println("Entre com um número: ");
	    	num=scan.nextInt();
	    	soma += num;
	    }
		media = soma /5;
		System.out.println("Soma: " + soma);
		System.out.println("Media " + media);
	}

}
