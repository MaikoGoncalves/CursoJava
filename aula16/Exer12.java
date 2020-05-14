package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com o sal�rio hora: ");
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
					    
					    System.out.println("Sal�rio Bruto: (" + salarioHora + " * " + hora + ") R$: " + salarioBruto);
					    System.out.println(" (-) IR (" + aliqIr + "%) R$:" + ir);
					    System.out.println(" (-) INSS(" + aliqInss +"%) R$:" + inss);
					    System.out.println(" FGTS (" + aliqFgts + "%) R$:" + fgts );
					    System.out.println(" Total de descontos: R$ " + descontos);
					    System.out.println(" Sal�rio Liquido: R$ " + salarioLi );
			          
		   
				    }
		}
	

/* Fa�a um programa para o c�lculo de uma folha de pagamento,
sabendo que os descontos s�o do Imposto de Renda, que depende do 
sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (�
a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio
Bruto menos os descontos. O programa dever� pedir ao usu�rio o
valor da sua hora e a quantidade de horas trabalhadas no m�s.
o Desconto do IR:
o Sal�rio Bruto at� 900 (inclusive) - isento
o Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
o Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
o Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela
as informa��es, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora � 5 e a quantidade de hora � 220.
Sal�rio Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Sal�rio Liquido : R$ 935,00
*/