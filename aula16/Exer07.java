package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
	    double numero1=scan.nextDouble();
	           System.out.println("Digite outro numero");
	           double numero2=scan.nextDouble();
	                  System.out.println("Digite mais um numero");
	                  double numero3=scan.nextDouble();
	                  System.out.println("Obrigado");
	                 
	                  if ((numero1 >= numero2) && (numero1 >= numero3) && (numero2 >= numero3))
	                  {System.out.println("Numero maior �: " + numero1);
	                   System.out.println("Numero menor �: " + numero3);
	                  }
	                  else if((numero1 >= numero2) && (numero1 >= numero3) && (numero2 <= numero3))
	                  {System.out.println("Numero maior �: " + numero1);
	                   System.out.println("Numero menor �: " + numero2);
	                  }
                      else if((numero1 <= numero2) && (numero2 >= numero3) && (numero1 >= numero3))
	                  {System.out.println("Numero maior �: " + numero2);
	                   System.out.println("Numero menor �: " + numero3);
	                  } 
	                  else if((numero1 <= numero2) && (numero2 >= numero3) && (numero1 <= numero3))
		              {System.out.println("Numero maior �: " + numero2);
		                   System.out.println("Numero menor �: " + numero1);
                  	  }
	                  else if((numero3 >= numero1) && (numero3 >= numero2) && (numero1 >= numero2))
		              {System.out.println("Numero maior �: " + numero3);
		                   System.out.println("Numero menor �: " + numero2);
                  	  }
	                  else if((numero3 >= numero1) && (numero3 >= numero2) && (numero1 <= numero2))
		              {System.out.println("Numero maior �: " + numero3);
		                   System.out.println("Numero menor �: " + numero1);
                  	  }
	                  
	         }          
	}
