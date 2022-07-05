/*
           ***** OK ACERTEI *****
 * 13. Faca um programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mes.
 * Calcule e mostre o total do seu salario no referido mes, sabendo-se que sao descontados 
 * 11% para o imposto de renda
 * 8% para o inss 
 * 5% para o sindicato, faca um programa que nos dÊ:
 *  1. salario bruto OK
 *  2. quanto pagou ao INSS
 *  3. quanto pagou ao sindicato
 *  4. salario liquido
 *  5. calcule os descontos e o salario liquido, conforme a tabela abixo:
 *  
 *  + salarioBruto: R$ - IR (11%): R$ - INSS (8%): R$ - Sindicato (5%): R$ - Salario Liquido: R$
 *  OBS: salario bruto - descontos= salario liquido
 */
package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Quanto voce ganha por Hora?: ");
			double valorHora = scan.nextDouble();
		System.out.println(" Quantas horas trabalhou no Mes?: ");
			int horaTrabalhada = scan.nextInt();
		
		
		double salarioBruto = valorHora * horaTrabalhada;
			System.out.println(" O salario bruto é de: " +salarioBruto +" €");
		
		double impostoRenda= (salarioBruto * 11)/100;
			System.out.println(" Pagou de Imposto de Renda: "+impostoRenda + " €");
		
		double inss= (salarioBruto * 8)/100;
			System.out.println(" Pagou ao Inss: "+ inss + " €");
		
		double sindicato = (salarioBruto * 5)/100;
			System.out.println(" Pagou ao sindicato: "+ sindicato +" €");
		
		double desconto =  impostoRenda + inss + sindicato;
			System.out.println(" O valor dos descontos foi de: " +desconto +" €");
			
		double salarioLiquido =  salarioBruto - desconto;	
			System.out.println(" O salario liquido é de: "+salarioLiquido +" €");
		
		
		
	}

}