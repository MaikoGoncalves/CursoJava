package com.maiko.cursojava.aula13;

import java.util.Scanner;

public class OperadoresRelacionais {

  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
	// Operador Relacionais 
	// == igual
	// != diferente de
    // > maior que
	// < menor que
	// >= maior e igual que 
	// <= menor e igual que
		
	System.out.println("Digite um valor");
	int valor1 = scan.nextInt();
		
	System.out.println("Digite outro valor");
	int valor2 = scan.nextInt();
		
	System.out.println("Valor1 é Igual(=) o Valor2: " + (valor1 == valor2));
	System.out.println("Valor1 é Diferente(!=) que o Valor2: " + (valor1 != valor2));
	System.out.println("Valor1 é Maior(>) que o Valor2: " + (valor1 > valor2));
	System.out.println("Valor1 é Maior e Igual (>=) que o Valor2: " + (valor1 >= valor2));
	System.out.println("Valor1 é Menor (<) que o Valor2: " + (valor1 < valor2));
	System.out.println("Valor1 é Menor e Igual (<=) que o Valor2: " + (valor1 <= valor2));
	
	
	}

}
