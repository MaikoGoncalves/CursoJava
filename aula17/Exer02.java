package com.maiko.cursojava.aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean infValidas = false;
        
		do  {
			System.out.println("Entre com Nome do usuario: ");
		    String nomeUser = scan.next();
		    
		    System.out.println("Entre com a senha ");
		    String senha = scan.next();
		
		
		    if (nomeUser.equalsIgnoreCase(senha)) {
			    infValidas = false;
			    System.out.println("Usuario e senha igual. Digite novamente ");
		     }else {
			       infValidas = true;
			       System.out.println("Senha e Usuarios V�lidos ");
		           }
		
		}while(!infValidas);
		
	}
}

/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o
aceite a senha igual ao nome do usu�rio, mostrando uma mensagem
de erro e voltando a pedir as informa��es.
*/

