package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			   
			System.out.println("Entre com o tipo de carne:");
			System.out.println("1- File Duplo");
			System.out.println("2-Alcatra");
			System.out.println("3-Picanha");
			int tipo = scan.nextInt();
						
			System.out.println("Entre com a quantidade (KG):");
			double qtd = scan.nextDouble();
			double precoKg = 0;
			
			if (tipo == 1) {

				if (qtd<5) {
	               precoKg = 4.9;
				}else {
				   precoKg = 5.8;
				}
			}
			if (tipo == 2) {

				if (qtd<5) {
	               precoKg = 5.9;
				}else {
				   precoKg = 6.8;
				      }
			}
			if (tipo == 3) {

					if (qtd<5) {
		               precoKg = 6.9;
					}else {
					   precoKg = 7.8;
					}
				
			}	
			double total = qtd * precoKg;
			System.out.println(qtd + "(KG) * " + precoKg + "= R$:" + total);
			
			System.out.println("Entre com 1 se for Dinheiro");
			System.out.println("Entre com 2 se for cart�o");
			int cdc = scan.nextInt();
			
			
			if (cdc == 1) {
				double desconto = (total/100) * 5;
				System.out.println("Desconto R$:" + desconto);
				System.out.println("Valor a pagar"+(total-desconto));
				}else {System.out.println("Valor a pagar"+total);
				}
			
			
		}
}			
/*O Hipermercado Tabajara est� com uma promo��o de carnes que �
imperd�vel. Confira:
o At� 5 Kg Acima de 5 Kg
o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poder� levar
apenas um dos tipos de carne da promo��o, por�m n�o h�
limites para a quantidade de carne por cliente. Se compra for
feita no cart�o Tabajara o cliente receber� ainda um desconto
de 5% sobre o total a compra. Escreva um programa que pe�a
o tipo e a quantidade de carne comprada pelo usu�rio e gere
um cupom fiscal, contendo as informa��es da compra: tipo e
quantidade de carne, pre�o total, tipo de pagamento, valor do
desconto e valor a pagar.*/