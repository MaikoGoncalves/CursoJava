package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer08 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Qual valor do seu sal�rio por hora: ");
	double hora = scan.nextDouble();
	//System.out.print();
	System.out.print("Quantas horas trabalhadas este m�s: ");
	double horatra = scan.nextDouble();
	
	double salario = hora * horatra;
	System.out.print("O Valor pra receber � R$ " + salario);
		

	}

}
