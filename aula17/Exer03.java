package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean infValida = false;
        String nome, sexo, civil;
		int idade;
        double salario;
        
        //Nome
        do  {
			System.out.println("Entre com Nome: ");
		    nome = scan.next();
		    
		    if(nome.length() > 3) {
		    	infValida = true;
		        }else {
		             System.out.println("Nome precisa no mínimo 3 caracteres.");
		         }
		          
        }while(!infValida);
        
        //idade
        infValida = false;
        do  {
			System.out.println("Entre com idade: ");
		    idade = scan.nextInt();
		    
		    if(idade > 0 && idade < 150) {
		    	infValida = true;
		        }else {
		             System.out.println("Idade entre 0 a 150");
		         }
		          
        }while(!infValida);
        
        //salario
        infValida = false;
        do  {
			System.out.println("Entre com Salario: ");
		    salario = scan.nextDouble();
		    
		    if(salario > 0 ) {
		    	infValida = true;
		        }else {
		             System.out.println("Salario maior que 0");
		         }
		          
        }while(!infValida); 
        
        //sexo
        infValida = false;
        do  {
			System.out.println("Entre com Sexo: ");
		    sexo = scan.next();
		    
		    if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("m")) {
		    	infValida = true;
		        }else {
		             System.out.println("Sexo precisa ser 'f' ou 'm' ");
		         }
		          
        }while(!infValida);
        
        // Estado civil
        infValida = false;
        do  {
			System.out.println("Entre com estado civil: ");
		    civil = scan.next();
		   
		    if(civil.equalsIgnoreCase("s") || 
		       civil.equalsIgnoreCase("c") ||
		       civil.equalsIgnoreCase("v") ||
		       civil.equalsIgnoreCase("d") ) {
		    	
		    	infValida = true;
		        }else {
		             System.out.println("Preciso entrar com Estado Civil: 's', 'c', 'v', 'd':");
		         }
		          
        }while(!infValida);
           
        System.out.println("Seu nome: " + nome);
        System.out.println("Seu idade: " + idade);
        System.out.println("Seu salario: " + salario);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("Seu Estado Civil " + civil);
	}

}
/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
*/