package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main (String[] args) {
		
		java.lang.Math.pow(0, 0);
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o Raio do C�rculo: ");
		double raio = scan.nextDouble();
		
		/*System.out.println("A �rea do c�rculo � igual a: " + (3.14159 * Math.pow(raio, 2))); 
		 * ou pode ser assim:*/
		
		System.out.println("A �rea do c�rculo � igual a: " + (raio * raio * 3.14159));
		
		
	}
	
	
}
