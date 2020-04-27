package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer08 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Entre com o valor/hora: ");
	double valorHora = scan.nextDouble();
	//System.out.print();
	
	System.out.print("Quantas horas trabalhadas este mês: ");
	double horas = scan.nextDouble();
	
	double salario = valorHora * horas;
	System.out.print("O Valor pra receber é R$ " + salario);
		

	}

}
