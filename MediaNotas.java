package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota do 1° Bimestre: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota do 2° Bimestre: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota do 3° Bimestre: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota do 4° Bimestre: ");
		double nota4 = scan.nextDouble();
		
		double media = ((nota1+nota2+nota3+nota4)/4);
		
		System.out.println("A Média será: " + media );
		
		
	/*System.out.println("Aprovado" );*/
		
		
		
		
	}
	
}
