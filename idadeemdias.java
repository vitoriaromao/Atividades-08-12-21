package fami41;

import java.util.Scanner;

public class idadeemdias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

	int idade, dias, meses, res1, res2 ;
	
	dias = 365;
	meses = 12;
	
	System.out.println("\nQuantos anos você tem?");
	idade = (int) leia.nextFloat();
	
	res1= dias*idade; 
			
	System.out.println("\nSua idade em dias: " + res1);
	
	res2= meses*idade;
	
	System.out.println("\nSua idade em meses: " + res2);
	
			
	
	}

}
