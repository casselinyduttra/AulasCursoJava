/*
 * 14. Faca um programa que le as duas notas parciais obtidas por um aluno
 * numa disciplina ao longo de um semestre, e calcule a sua media.A atribuicao
 * de conceitos obedece a tabela abaixo:
 * 	a. entre 9.0 e 10.0 A
 *  b. entre 7.5 e 9.0 B
 *  c. entre 6.0 e 7.5 C
 *  d. entre 4.0 e 6.0 D
 *  e. entre 4.0 e zero E
 *  
 *  o algoritimo deve mostrar na tela as notas, a média, o conceito
 *  correspondente e a mensagem " APROVADO" se o conceito for A B C
 *  ou "REPROVADO" se for D e E.
 */
package com.casse.cursojava.aula1415.Exercicio1415;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println(" Introduza a primeira nota: ");
	        double nota1 = scan.nextDouble();
	        System.out.println(" Introduza a segunda nota: ");
	        double nota2 = scan.nextDouble();
	        
	     
	        double media = (nota1 + nota2) / 2;
	        String aproveitamento = " " ;	        
	        if (media <= 10 && media >= 9) {
	        	aproveitamento= "A";    		        
	        } else if (media <= 9 && media >= 7.5 ) {
	        	aproveitamento= "B";
	        } else if (media < 7.5 && media >= 6) {
	        	aproveitamento= "C";
	        } else if (media < 6 && media >= 4) {
	        	aproveitamento= "D";
	        } else if (media < 4 && media >=0) {
	        	aproveitamento= "E";
	        }
	        
	       
	        System.out.println(" A nota 1 do aluno foi: "+nota1);
	        System.out.println(" A nota 2 do aluno foi: "+nota2);
	        System.out.println(" A media do Aluno foi: " +media);
	        System.out.println(" Conceito " +aproveitamento);
	        
	        switch (aproveitamento) {
	        case "A":
	        case "B":
	        case "C": System.out.println(" O aluno foi Aprovado");
	        break;
	        case "D":
	        case "E":System.out.println(" O aluno foi REPROVADO");
	        break;	
	        }    
	}

}
