package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer11 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um numero: ");
	long numero1 = scan.nextLong();
	System.out.print("Digite outro numero: ");
	long numero2 = scan.nextLong();
	System.out.print("Agora digite um numero real: ");
	long numero3 = scan.nextLong();
    
    long resultadoa = (numero1*2)+(numero2/2);
    long resultadob = (numero1*3)+(numero3);
    long resultadoc = (numero3*numero3*numero3);
     
    System.out.println(("1� Numero:" + numero1) + ("  2� Numero:" + numero2) + ("  3� Numero:"+ numero3));
    System.out.println("Resultado A " + resultadoa);
    System.out.println("Resultado B " + resultadob);
    System.out.println("Resultado C " + resultadoc);
	
	}

}
