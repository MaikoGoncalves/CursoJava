package com.maiko.cursojava.aula12;
import java.util.Scanner;
public class LeituraDadosTeclado {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
 
  /*System.out.println("Digite sem nome completo:");
    String nomeCompleto = scan.nextLine();
	System.out.println("Seu nome completo �: " + nomeCompleto);	
	System.out.println("Digite seu primeiro nome: ");
	String primeiroNome = scan.next();
	System.out.println("Seu primeiro nome �: " + primeiroNome);	

	System.out.println("Digite a sua idade: ");
	int idade = scan.nextInt();
	System.out.println("Sua idade �: " + idade);
	System.out.println("Digite a sua altura: ");
	double altura = scan.nextDouble();
	System.out.println("Sua altura �: " + altura);*/
	 
System.out.println("Digite seu primeiro nome, idade, quantidades de filho, altura, tem cachorro ");	 
String primeiroNome = scan.next();
int idade = scan.nextInt();
byte qtdFilhos = scan.nextByte();
float altura = scan.nextFloat();
boolean temPet = scan.nextBoolean(); 
 
System.out.println("Voc� digitou os seguintes dados");
System.out.println("Seu nome �: " + primeiroNome);
System.out.println("Sua idade �: " + idade );
System.out.println("Quantidade de Filhos: " + qtdFilhos);
System.out.println("Sua altura �: " + altura);
System.out.println("Tem Pet: " + temPet);

 }

}
