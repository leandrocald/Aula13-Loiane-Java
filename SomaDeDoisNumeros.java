package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class SomaDeDoisNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite maus um n�mero: ");
		double numero2 = scan.nextDouble();
		
		System.out.println("A soma dos n�meros �: "+(numero1+numero2));
		
		System.out.println("Obrigado por estar com Leandro Produ��es Java SE!!!");
		

	}

}
