package com.maiko.cursojava.aula17;

public class loopWhile {

	public static void main(String[] args) {
		
           int i = 1; //count ou cont
           int max = 10;
           
           System.out.println("Contando at� " + max);
           
           while (i <= max) {
        	   System.out.println("Valor de i: " + i);
        	   i++;  // i = i+i; ou i +=1;
           }
           
           System.out.println(" " + i);   
           
           do {
        	   i++;
        	   System.out.println("Valor de i: " + i);
           }while (i<13);
           
           }

}

/* while    
   do while
 */


