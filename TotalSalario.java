package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class TotalSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
						
		System.out.println("Quanto você ganha por hora? ");
		double salHora = scan.nextDouble();
		
		System.out.println("Quantas horas por dia você trabalha? ");
		double trabHora = scan.nextDouble();
		
		System.out.println("Quantos dias por semana você trabalha? ");
		double dia = scan.nextDouble();
		
		System.out.println("O seu salário Semanal é R$ " + (salHora*trabHora*dia));
		System.out.println("O seu salário Mensal é R$  " + (30*salHora*trabHora));
		System.out.println("O seu salário Anual é R$  " + (360*salHora*trabHora));
		
		
	}

}
