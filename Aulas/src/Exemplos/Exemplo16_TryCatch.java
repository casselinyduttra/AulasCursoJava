
package Exemplos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exemplo16_TryCatch {
    public static void main(String[]args){
        
        Scanner ler = new Scanner(System.in);
        
        try{
            int n = ler.nextInt();
            System.out.println(30 / n);
        }
        catch(InputMismatchException erro){
            System.err.println("So pode informar numero inteiros " +erro);
        }
        catch(ArithmeticException erro){
            System.err.println("Nehum numero pode ser dividido por zero " +erro);
        }
    }
}
