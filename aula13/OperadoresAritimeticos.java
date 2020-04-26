package com.maiko.cursojava.aula13;

public class OperadoresAritimeticos {

  public static void main(String[] args) {
    int resultado = 1 +2;
    System.out.println(resultado); //3
    
    resultado = resultado - 1;
    System.out.println(resultado); //2
    
    resultado = resultado * 2;
    System.out.println(resultado); //4
    
	resultado = resultado / 2;
	System.out.println(resultado); //2
	
	resultado = resultado + 8;
	System.out.println(resultado); //10
	
	resultado = resultado % 7;
	System.out.println(resultado); //3

	String primeiroNome = "Esta é ";
	String segundoNome = "uma String concatenada";
	String terceiroNome = primeiroNome + segundoNome;		
	System.out.println(terceiroNome); // Esta é uma String concatenada
	    
	resultado = resultado + 1;
	System.out.println(resultado); // 4
	resultado = 4 + 6;
	System.out.println(resultado); // 10 
		
	// Agora vamos aprender outras somas
	
	resultado ++;                  // Soma e mostra na tela 11
	System.out.println(resultado); // 10 + 1 = 11 
	
	System.out.println(resultado++); //  Mostra na tela pra depois somar 11 
	System.out.println(resultado);   // 12
	
	System.out.println(++resultado); // Soma antes e depois mostra na tela 13
	resultado +=5;                   // Soma com qual quer numero
	System.out.println(resultado);   // Imprime o resultado 18
	
	
	resultado --;                  // Divisão e mostra na tela 11
	System.out.println(resultado); // 18 - 1 = 17 
	
	System.out.println(resultado--); //  Mostra na tela pra depois Diminuir  17
	System.out.println(resultado);   // 16
	
	System.out.println(--resultado); // Divisão antes e depois mostra na tela 15
	resultado -=5;                   // Soma com qual quer numero
	System.out.println(resultado);   // Imprime o resultado 10
	
	
	
	
	//
  
  }

}
