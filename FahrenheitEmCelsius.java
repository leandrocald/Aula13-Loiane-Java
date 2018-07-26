package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class FahrenheitEmCelsius {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual a tempedatura em Fahrenheit? " );
		double grau = scan.nextDouble();
		
		System.out.println("A temperatura em Celsius é: " + (5*(grau-32)/9));
		
			
		
		
		
	}

}
