/*
 *     ***** OK ACERTEI *****
  04. Faca um Programa que peca as 4 notas bimestrais e mostre a media.
 */

package com.casse.cursojava.aula13.ExerciciosAula13;

import java.util.Scanner;

public class Exercicio04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Introduza a 1 Nota Bimestral do Aluno Lucas: "  );
		nota1 = scan.nextDouble();
		System.out.println("Introduza a 2 Nota Bimestral do Aluno Lucas: " );
		nota2= scan.nextDouble();
		System.out.println("Introduza a 3 Nota Bimestral do Aluno Lucas: "  );
		nota3= scan.nextDouble();
		System.out.println("Introduza a 4 Nota Bimestral do Aluno Lucas: " );
		nota4= scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A media bimestral do Aluno Lucas foi: " +media);
		
		

	}

}
