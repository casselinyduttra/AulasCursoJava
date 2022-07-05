/*
 * 4. Faça um Programa que verifique se a letra digitada é vogal ou consoante.
 */
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite uma letra: ");
		String letra = scan.next();
		 
		 switch(letra) {
		 	case "a":
		 	case "e":
		 	case "i":
		 	case "o":
		 	case "u": System.out.println(" A letra digitada é uma vogal ");
		 		break;
                        case "A":
		 	case "E":
		 	case "I":
		 	case "O":
		 	case "U": System.out.println(" A letra digitada é uma vogal ");
		 		break;        
		 	default : System.out.println(" A letra digitada é uma consoante ");
		 
		 }
	}
}
