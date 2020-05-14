package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		double segundaNota = scan.nextDouble();
		double resultado = (primeiraNota + segundaNota) / 2;
		
	    if (resultado>=9 && resultado <=10) {
            System.out.println(" APROVADO Conceito A nota: " + resultado);
	        }else if (resultado>=7.5 && resultado <9) {
	            System.out.println(" APROVADO Conceito B nota: " + resultado);
	            }else if (resultado>=6 && resultado <7.5) {
		            System.out.println("APROVADO Conceito C nota: " + resultado);
	                }else if (resultado>=4 && resultado <6) {
			            System.out.println("REPROVADO Conceito D nota: " + resultado);
	                    }else if (resultado>=0 && resultado <4) {
			                System.out.println("REPROVADO Conceito E nota: " + resultado);
	                        }else System.out.println("Valores errados ");
		                         
		

	}
}
/*Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E*/