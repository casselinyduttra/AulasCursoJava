/*
 * 10.Faca um programa que pergunte em que turno voce estuda.
 * Peca para digitar M - Matutino, V- Vespertino, N-Noturno
 * imprima a mensagem "Bom Dia" , "Boa Tarde", "Boa Noite"
 * ou "Valor Invalido".
 */
package com.casse.cursojava.aula1415.Exercicio1415;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println(" Introduza o seu Turno <M-Matutino V-Vespertino N-Noturno>: ");
	        String turno = scan.next();
	        
	        switch (turno) {
	        case "M": System.out.println(" Bom Dia!! ");
	        	break;
	        case "m": System.out.println(" Bom Dia!! ");
        		break;	
	        case "V": System.out.println(" Bom Tarde!! ");
	        	break;
	        case "v": System.out.println(" Bom Tarde!! ");
        		break;	
	        case "N": System.out.println(" Boa Noite!! ");
	        	break;
	        case "n": System.out.println(" Boa Noite!! ");
        		break;	
	        default: System.out.println(" Valor Invalido!! ");	
	        }

	}

}
