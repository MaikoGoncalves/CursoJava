package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	boolean sair = false;
	String continuarCompra;
	int qtdProdutos;
	double preco;
	double total = 0;
	double valorPago;
	double troco;
	String output;
	
	do {
		
		System.out.println("Deseja informar uma nova compra? S/N");
		continuarCompra = scan.next();
		
		if (continuarCompra.equalsIgnoreCase("s")) {
		
			output = "Lojas Tabajaras \n";
		
		   System.out.println("Digete a quantidade de produtos da compra  ");
		   qtdProdutos = scan.nextInt();
		    
		   
		   for (int i=1; i<= qtdProdutos; i++) {
			   System.out.println("Informe preço do produto " + i +"º");		
		       preco = scan.nextDouble();
		       total += preco;
		       output += "Produto" + i + "R$: " + preco + "\n";
		      }
		      output += "Total: R$ " + total;
		      
		      System.out.println("Total: R$ " + total);
		      
		      System.out.println("Entre com o Valor pago");
		      valorPago = scan.nextDouble();
		      
		      output += "Dinheiro: R$ " + valorPago + "\n";
		      
		      troco = total - valorPago;
		      
		      output += "Troco R$ " + troco;
		      
		      System.out.println(output);
		      
		      
		   
		}else {
			sair = true;
		}
		
	}while (!sair);
	
	
			
		

	}

}
