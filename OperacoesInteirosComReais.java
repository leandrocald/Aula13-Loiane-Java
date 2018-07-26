package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class OperacoesInteirosComReais {

	public static void main(String[] args) {

		java.lang.Math.pow(0, 0);
				
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite mais um número inteiro ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um número Real ");
		double num3 = scan.nextDouble();
		
		
		System.out.println("Primeira Resposta: "+ (      (  num1*2  )   *   (  num2/2  )   )    );
		System.out.println("Segunda Resposta: "+ (      (  num1*3  )   +   (  num3  )   )    );
		System.out.println("Terceira Resposta: "+ (      num3*num3*num3    )    );
		
			//ou como abaixo:
		
		System.out.println("Terceira Resposta como modo Math.pow(a,b): "+ Math.pow(num3,3)    );
		
		
		
			}

}
