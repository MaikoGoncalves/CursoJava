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
	double numero3 = scan.nextDouble();
    
    long resultadoa = (numero1 * 2) * (numero2 / 2);
    double resultadob = (numero1 * 3) + (numero3);
    //double resultadoc = (numero3*numero3*numero3);
    double resultadoc = Math.pow(numero3, 3); 
    System.out.println(("1ª Numero:" + numero1) + ("  2ª Numero:" + numero2) + ("  3ª Numero:"+ numero3));
    System.out.println("Resultado A " + resultadoa);
    System.out.println("Resultado B " + resultadob);
    System.out.println("Resultado C " + resultadoc);
	
	}

}
