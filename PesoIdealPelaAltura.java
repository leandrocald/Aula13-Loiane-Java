package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class PesoIdealPelaAltura {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println("Digite sua Altura: ");
		double alt = scan.nextDouble();
		
		System.out.println("Seu peso ideal �: "+ (   (72.7 * alt)   - 58   )           );
		
		
		
		
		
		
	}

}
