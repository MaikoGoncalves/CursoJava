package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com o salário hora: ");
	double salarioHora = scan.nextDouble();
	System.out.println("Entre com a hora trabalhada: ");
	double hora = scan.nextDouble();
	
	double salarioBruto = salarioHora * hora;	
	int aliqIr = 0;
	int aliqFgts = 11;
	int aliqInss = 10;
	double inss = salarioBruto * aliqInss/100;
	double fgts = salarioBruto * aliqFgts/100;
		
	if (salarioBruto <= 900) {
	    aliqIr = 0;
	}else if (salarioBruto > 900 && salarioBruto <= 1500) {
	    aliqIr = 5;
	}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
	    aliqIr =  10;
	}else if (salarioBruto > 2500 ) {
		aliqIr = 20;
	}	
	                    double ir = ( ( salarioBruto/100 ) * aliqIr);
					    double descontos = ir + inss;
					    double salarioLi = salarioBruto - descontos;
					    
					    System.out.println("Salário Bruto: (" + salarioHora + " * " + hora + ") R$: " + salarioBruto);
					    System.out.println(" (-) IR (" + aliqIr + "%) R$:" + ir);
					    System.out.println(" (-) INSS(" + aliqInss +"%) R$:" + inss);
					    System.out.println(" FGTS (" + aliqFgts + "%) R$:" + fgts );
					    System.out.println(" Total de descontos: R$ " + descontos);
					    System.out.println(" Salário Liquido: R$ " + salarioLi );
			          
		   
				    }
		}
	

/* Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00
*/