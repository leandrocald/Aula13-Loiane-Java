package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class CalculoDownload {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do Arquivo em MB: ");
		double arq = scan.nextDouble();
		
		System.out.println("Digite a Velocidade do link em Mbps: ");
		double link = scan.nextDouble();
		
		
		System.out.println("O tempo será de : " +  (   (arq * 8  ) / link   )   +   " Segundos " );
		System.out.println("O tempo será de : " + (    (   (arq * 8  ) / link   ) /60    )    +  " em minutos" );
		
		
		

		
		
		
		
	}

}
