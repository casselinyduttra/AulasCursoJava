/*
 * Funciona como multiplos IF-ELSE
 * 
 */

package com.casse.cursojava.aula15;
import java.util.Scanner;
public class CondicionalSwithCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o dia da semana: ");
		 	int diaSemana = scan.nextInt();
		 	
		 	
		 	if (diaSemana == 1) {
		 		System.out.println(" Domingo");
		 	} else if (diaSemana == 2) {
		 		System.out.println(" Segunda");
		 	}else if (diaSemana == 3) {
		 		System.out.println(" Terca");
		 	}else if (diaSemana == 4) {
		 		System.out.println(" Quarta");
		 	}else if (diaSemana == 5) {
		 		System.out.println(" Quinta");
		 	}else if (diaSemana == 6) {
		 		System.out.println(" Sexta");
		 	}else if (diaSemana == 7) {
		 		System.out.println(" Sabado");
		 	} else {
		 		System.out.println(" Nao é um dia da semana valido!!");
		 	}

		 	
		 	// para melhorar o codigo podemos usar como alternativa 
		 	// o Switch Case:
		 	
		 	switch (diaSemana) {
		 	case 1: System.out.println(" Domingo");
		 		break;
		 	case 2: System.out.println(" Segunda");
		 		break;
		 	case 3: System.out.println(" Terca");
		 		break;
		 	case 4: System.out.println(" Quarta");
		 		break;
		 	case 5: System.out.println(" Quinta");
		 		break;
		 	case 6: System.out.println(" Sexta");
		 		break; 
		 	case 7: System.out.println(" Sabado");
		 		default: System.out.println(" Nao é um dia da semana valido!!");
		 	}
		 	
		 	// default : caso as expressoes nao forem verdadeiras,ele sera executado.
		 	// break: ele vai executar todos os comandos ate ele encontrar 
		 	//um break, mesmo ele nao sendo verdadeiro
		 	// caso voce queira executar apenas linhas expecificas
		 	// deve colocar o break.
		 	
		 	switch (diaSemana) {
		 	case 1: System.out.println(" Domingo");
		 	
		 	case 2: System.out.println(" Segunda");
		 	
		 	case 3: System.out.println(" Terca");
		 	
		 	case 4: System.out.println(" Quarta");
		 	
		 	case 5: System.out.println(" Quinta");
		 		break;
		 	case 6: System.out.println(" Sexta");
		 	 
		 	case 7: System.out.println(" Sabado");
		 		default: System.out.println(" Nao é um dia da semana valido!!");
		 	}
		 	
		 	//outra especificacao do break:
		    // se o usuario digitar 1 2 3 4 5 6 para especificar que 
		 	//os 6 dias sao dias da semana.
		 	
		 	switch (diaSemana) {
		 
		 	case 2: 
		 	case 3: 
		 	case 4: 
		 	case 5: 
		 	case 6: System.out.println(" Dia Util"); 
		 		break; 
		 	case 1:
		 	case 7: System.out.println(" Fim de semana");
		 		default: System.out.println(" Nao é um dia da semana valido!!");
		 	}
		 	// dia a dia de programador, o IF ELSE é mais utilizado.
		 	
	}

}
