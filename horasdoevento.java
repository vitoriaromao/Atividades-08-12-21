package fami41;

import java.util.Scanner;

public class horasdoevento {
	
	public static void main(String[] args) {
		
 Scanner leia = new Scanner (System.in);
	
 int segundos, minutos, horas, res1, res2  ;
 
 minutos = 60;
 segundos = 3600;
 
         System.out.println("\nQuantas horas ter� o evento?");
 
 horas = (int) leia.nextFloat();
 
 res1=horas*minutos;
 
		 System.out.println("\nEsse evento em minutos ter�: "+ res1);
		 
res2=horas*segundos;
		 
		 System.out.println("\nEsse evento em segundos ter�: "+ res2 );
 
 
 
 
	}
 
}
