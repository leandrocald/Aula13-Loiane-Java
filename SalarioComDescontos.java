package com.leandrocald.cursojava.aula13;

import java.util.Scanner;

public class SalarioComDescontos {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quanto voc� ganha por hora:  ");
		double salHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� trabalha no m�s:  ");
		double horaMes = scan.nextDouble();
		
		// s� vou declarar para ficar separado, mas sei que poderia fazer isso sem criar vari�vel
		double salario = salHora*horaMes;
		double descInss =  salario*0.08;
		double descIR =  salario*0.11;
		double descSind =  salario*0.05;
		double salarioLiq =  (salario -(descInss+descIR+descSind));
		
		System.out.println("O Sal�rio Bruto �:" +salario);
		System.out.println("O desconto do INSS �:" + descInss    );
		System.out.println("O desconto do IR �:" + descIR    );
		System.out.println("O desconto do Sindicato �:" + descSind    );
		System.out.println("O Total de Descontos �:" + (salario - salarioLiq)    );
		System.out.println("O Sal�rio L�quido �:" + salarioLiq    );
		
		
		
	}

}
