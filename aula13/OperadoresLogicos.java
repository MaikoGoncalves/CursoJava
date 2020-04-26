package com.maiko.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
// ---------------------------AND--------OR--------XOR--------NOT-----		              
// |     A    |     B    |   A & B  |  A | B   |  A ^ B   |  A ! B   |
// |   FALSO  |   FALSO  |   FALSO  |   FALSO  |   FALSO  |VERDADEIRO|
// |   FALSO  |VERDADEIRO|   FALSO  |VERDADEIRO|VERDADEIRO|VERDADEIRO|
// |VERDADEIRO|   FALSO  |   FALSO  |VERDADEIRO|VERDADEIRO|   FALSO  |
// |VERDADEIRO|VERDADEIRO|VERDADEIRO|VERDADEIRO|   FALSO  |   FALSO  |
// -------------------------------------------------------------------
	 
	int valor1 = 1;
	int valor2 = 2;
		
	boolean resultado1 = (valor1 == 1) && (valor2 == 2);
	System.out.println("valor1 � 1 OR valor2 � 2 = resultado: " + resultado1);
		
	boolean resultado2 = (valor1 == 1) || (valor2 == 2);
	System.out.println("valor1 � 1 OR valor2 � 2 = resultado: " + resultado2);
	
	boolean verdadeiro = true;
	boolean falso = false;
	System.out.println(verdadeiro && falso);	
	System.out.println(verdadeiro || falso);
	System.out.println(verdadeiro ^ falso);
	System.out.println(!verdadeiro && falso);
	
	}

}
