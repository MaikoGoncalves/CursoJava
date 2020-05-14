package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor A: ");
		double a = scan.nextDouble();
		
		if (a == 0) {
		   System.out.println("N�o e egua��o de segundo grau: ");
	       }else {

		    System.out.println("Entre com o valor B: ");
		    double b = scan.nextDouble();
		    System.out.println("Entre com o valor C: ");
		    double c = scan.nextDouble();
		
		    double delta = (b*b) - (4*a*c);
            if (delta < 0) { System.out.println("Delta negativo ");
            }else {	
            	double x1 = ((-b)+ Math.sqrt(delta)) / (2*a);
            	double x2 = ((-b)+ Math.sqrt(delta)) / (2*a);
            	System.out.println("Delta =  " + delta);
            	System.out.println("x1 =  " + x1);
            	System.out.println("x2 =  " + x2);
	       }
	     }   
	  }
}

/*Fa�a um programa que calcule as ra�zes de uma equa��o do segundo
grau, na forma ax2 + bx + c. O programa dever� pedir os valores de a,
b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes
situa��es:
a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o �
do segundo grau e o programa n�o deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equa��o n�o possui raizes
reais. Informe ao usu�rio e encerre o programa;
c. Se o delta calculado for igual a zero a equa��o possui apenas
uma raiz real; informe-a ao usu�rio;
d. Se o delta for positivo, a equa��o possui duas raiz reais;
informe-as ao usu�rio;
 */

