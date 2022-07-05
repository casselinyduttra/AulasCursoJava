/*
 * Faca um programa para o calculo de uma folha de pagamento
 * sabendo que os descontos sao do Imposto de Renda, que depende do
 * salario bruto(conforme a tabela) e 3% para o sindicato e que o FGTS
 * corresponde a 11% do salario bruto, mas nao é descontado(é a empresa que deposita)
 * o salario liquido corresponde ao salario bruto menos os descontos.
 * o programa devera pedir ao usuario o valor da sua hora e a quantidade d ehoras trabalhadas no mes
 	 * a. Desconto do IR
	 * b. Salario ate 900(inclusive) - insento
	 * c. salario bruto ate 1500(inclusive) - desconto de 5%
	 * d. salario bruto ate 2500(inclusive) - desconto de 10%
	 * e. salario bruto acima de 2500 - desconto de 20%
 * imprima na tela as informacaoes, dispostas conforme o exemplo abaixo.
 * No exemplo o valor da hora é de 5€ e a quantidade de hora é 220hrs.
 * 
 * Salario bruto: 5*200 : € 1100.00
 * (-) IR (5%): € 55.00
 * (-) INSS (10%): € 110.00
 * FGTS (11%): € 121.00
 * Total de descontos: € 165.00
 * Salario Liquido: € 935.00
 */
package com.casse.cursojava.aula1415.Exercicio1415;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com as horas trabalhadas no mes");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		int percentualIRS = 0;
		if (salarioBruto <= 900) {
			percentualIRS =0;
		} else if (salarioBruto <= 1500) {
			percentualIRS = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIRS =10;
		}else if (salarioBruto > 2500) {
			percentualIRS = 20;
		}
		
		double IRS = (salarioBruto / 100)* percentualIRS;
		double INSS= (salarioBruto / 100)* 10;
		double fgts= (salarioBruto /100)* 11;
		double totalDescontos = IRS + INSS;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): " + salarioBruto);
	    System.out.println("(-) IR (" + percentualIRS + "%):" + IRS);
	    System.out.println("(-) INSS ( 10%): " +INSS);
	    System.out.println("FGTS (11%): " + fgts);
	    System.out.println("Total de descontos: " + totalDescontos);
	    System.out.println("Salário Liquido: " + salarioLiquido);

	}	
	

}
