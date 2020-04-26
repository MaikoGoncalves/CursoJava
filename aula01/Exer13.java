package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer13 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Valor que você quanha por hora: ");
	double hora = scan.nextDouble();
	System.out.print("Quantas horas trabalhadas: ");
	double horatra = scan.nextDouble();
	double salariob = hora * horatra;
	double ir = salariob * 11/100;
	double inss = salariob * 8/100;
	double sind = salariob * 5/100;
	double salariol = salariob - ir - inss - sind;
	
	System.out.println("Salario Bruto: " + salariob);	
	System.out.println("Imposto de renda: " + ir);
	System.out.println("INSS: " + inss);
	System.out.println("Sindicato: " + sind);
	System.out.println("Salario Liquido: " + salariol);
	
	}

}
