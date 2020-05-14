package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   
		System.out.println(" Digite um numero inteiro:");
		int num1 = scan.nextInt();
		System.out.println(" Digite um numero inteiro:");
		int num2 = scan.nextInt();
		System.out.println(" Entre com a operação (+ - * /): ");
		String operacao = scan.next();
		
		double resultado = 0;
        boolean valida = true;
        
        switch (operacao) {
        case "+": resultado = num1 + num2; break;
        case "-": resultado = num1 - num2; break;
        case "*": resultado = num1 * num2; break;
        case "/": resultado = num1 / num2; break;
        default: System.out.println("Operacão inválida"); valida = false;
        }
	if (valida)	{
		System.out.println("Valor do resultado: " + resultado);
	}
	    if (resultado >=0) {
	    	System.out.println("Resultado positivo");
	    }else {
	           System.out.println("Resultado negativo");
	    }
	    
	    if (resultado % 2 == 0) {
			System.out.println("Resultdo Par ");
		}else System.out.println("Resultado Impar");
	}
	
	

}

/*Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;*/