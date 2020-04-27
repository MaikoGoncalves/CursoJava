package com.maiko.cursojava.aula01;
import java.util.Scanner;
public class Exer14 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Entre com o tamanho do arquivo ");
    double tamArquivo = scan.nextDouble();
    
    System.out.print("Entre com velocidade da internet ");
    double internet = scan.nextDouble();
    
    double tempo = tamArquivo / internet;
    
    System.out.println("O tempo gasto em minutos vai ser " + tempo);

	}

}
