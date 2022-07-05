
/*
 * As organizacoes Tabajara resolveram dar um aumento de salario aos
 * seus colaboradores e lhe contraram para desenvolver o programa que calculara os reajustes:
 * faca um programa que recebe o salario de um colaborador e o reajuste segundo o seguninte criterio, baseado no salario atual:
 * 
 * 	i. Salários até 280€ - aumento de 20%;
	ii. Salário entre 280€ e 700€ - aumento de 15%;
	iii. Salário entre 700€ e 1500€ - aumento de 10%;
	iv. Salário superior a 1500€ - aumento de 5%
	v. Após o aumento ser realizado, informe no ecrã:
		1. Salário antes do aumento;
		2. A percentagem do aumento aplicado;
		3. O valor do aumento;
		4. Salário com o aumento;			\	 
 */
package com.casse.cursojava.aula1415.Exercicio1415;
import java.util.Scanner;
public class Exercicio11 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salario do colaborador: ");
		double salario = scan.nextDouble();
		
		double salarioNovo = 0;
		double valorAumento = 0;
		double percentagem = 0;
			percentagem = percentagem / 100;
		
		if (salario <= 280) {
			percentagem = 20;
		} else if (salario > 280 && salario <= 700){
			percentagem = 15;
		}else if (salario > 700 && salario <= 1500){
			percentagem = 10;
		}else if (salario > 1500) {
			percentagem = 5;
		}
		
		valorAumento= (salario/100) * percentagem;
		
		salarioNovo= salario + valorAumento;
		
		System.out.println("O salario antes do aumento era de: " +salario);
		System.out.println("A percentagem do aumento foi de: " +percentagem);
		System.out.println("O valor do aumento foi de: " +valorAumento);
		System.out.println("O salario com aumento é de: " +salarioNovo);
	}

}
				