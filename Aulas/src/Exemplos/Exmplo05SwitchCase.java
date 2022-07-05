
package Exemplos;

public class Exmplo05SwitchCase  {
    public static void main(String[] args){
        int posicao = 1;
        switch (posicao){
            case 1:
                System.out.println("ficou em primeiro lugar");
                break;
            case 2:
                System.out.println("ficou em segundo lugar");
            case 3:
                System.out.println("ficou em terceiro lugar");
            default:
                System.out.print("ficou fora do podio");
        }
    }
}
