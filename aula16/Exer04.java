package com.maiko.cursojava.aula16;

import java.util.Scanner;

public class Exer04 {

  public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = scan.next();
		
     if    (letra.equalsIgnoreCase("a") || 
    		letra.equalsIgnoreCase("e") ||
    		letra.equalsIgnoreCase("i") ||
    		letra.equalsIgnoreCase("o") ||
    		letra.equalsIgnoreCase("u"))
    	    { System.out.println("É uma vogal ");
		      } else {System.out.println("É uma consoante ");
		             }
		/*switch(letra) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
		case "a":
		case "e":
		case "i":	
		case "o":	
		case "u": System.out.println("É uma vogal "); break;	
		default:  System.out.println("É uma consoante "); break;
		}*/
	}
}

