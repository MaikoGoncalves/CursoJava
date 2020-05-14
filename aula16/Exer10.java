package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Qual turno você estuda!!");
	System.out.println("Digite M-matutino");
	System.out.println("Digite V-Vespertino");
	System.out.println("Digite N- Noturno");	
	String turno = scan.next();	
	
	switch (turno) { 
	case "M":   
	case "m": System.out.println("Bom dia!"); break;
	case "V":   
	case "v": System.out.println("Bom tarde!"); break;
	case "N":   
	case "n": System.out.println("Boa noite!"); break;
	default : System.out.println("Valor Inválido");	
	}
	
  }

}


/* Faça um Programa que pergunte em que turno você estuda. Peça
   para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
   mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
   Inválido!", conforme o caso.*/