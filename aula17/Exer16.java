package com.maiko.cursojava.aula17;

public class Exer16 {

	public static void main(String[] args) {
		
		int n = 100;		
		
		int primeiro = 1;
		int segundo = 1;
	    int proximo=0;				
					
		while (proximo <= 500) 
		 {
	       
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		
	  }
	}
}
