package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class TotalSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
						
		System.out.println("Quanto voc� ganha por hora? ");
		double salHora = scan.nextDouble();
		
		System.out.println("Quantas horas por dia voc� trabalha? ");
		double trabHora = scan.nextDouble();
		
		System.out.println("Quantos dias por semana voc� trabalha? ");
		double dia = scan.nextDouble();
		
		System.out.println("O seu sal�rio Semanal � R$ " + (salHora*trabHora*dia));
		System.out.println("O seu sal�rio Mensal � R$  " + (30*salHora*trabHora));
		System.out.println("O seu sal�rio Anual � R$  " + (360*salHora*trabHora));
		
		
	}

}
