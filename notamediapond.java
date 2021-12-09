package fami41;

import java.util.Scanner;

public class notamediapond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner leia = new Scanner (System.in);
				
		float nota1,nota2,nota3,media; 
				
		
		
		System.out.println("\nEntre com a primeira nota:");
		
		nota1 = leia.nextFloat();
		
        System.out.println("\nEntre com a segunda nota:");
		
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a tercira nota:");
		
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3 ;
		
		System.out.println("\nA sua média foi de: "+ media);
		System.out.printf("\nMédia: %.2f", media);
	}

}
