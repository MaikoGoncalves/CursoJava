package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite seu sal�rio : ");
	double salario = scan.nextDouble();
	int percentual = 0;
	
	
	if (salario <= 280) {
		percentual=20;
	}else if (salario > 280 && salario <=700) {
		percentual=15;
	}else if (salario > 700 && salario <=1500) {
		percentual=10;
	}else if (salario >1500) {
		percentual=5;              
	}	
		
	double aumento = (salario /100) * percentual ;
	double salarionovo = salario + aumento;
			             
	System.out.println("O sal�rio antes do reajuste: " + salario);
    System.out.println("O percentual de aumento aplicado:  " + percentual);
	System.out.println("O valor do aumento � de: " + aumento);
	System.out.println("O novo sal�rio: " + salarionovo);
	
	}
	
	}



/*As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos
seus colaboradores e lhe contraram para desenvolver o programa que
calcular� os reajustes.
o Fa�a um programa que recebe o sal�rio de um colaborador e o
reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
o sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
o sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o
aumento ser realizado, informe na tela:
o o sal�rio antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo sal�rio, ap�s o aumento.*/