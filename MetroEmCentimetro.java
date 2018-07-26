package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class MetroEmCentimetro {

	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
				
	System.out.println("Digite o valor em metros:  ");
	double distancia = scan.nextDouble();
	
	double distancia2 = (distancia * 100); 
			
	System.out.println("A valor em centímetro é: " +distancia2 );
		
	}
		
		
		
	
	
}
