package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class CelsiusEmFirenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Qual a tempedatura em Celsius? " );
		double grau1 = scan.nextDouble();
		
		System.out.println("A temperatura em Fahrenheit é: " + (    ( (  9*grau1  ) /5  ) +32)  );
						
		
	}

}
