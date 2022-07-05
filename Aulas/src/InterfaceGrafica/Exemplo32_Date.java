

package InterfaceGrafica;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo32_Date {
         public static void main(String[]args){
             Date data = new Date();
             SimpleDateFormat formatar = new SimpleDateFormat("M");
             String dataFormatada = formatar.format(data);
             System.out.println(dataFormatada);
             
             /* 
             y - Ano
             M - mes do ano
             D - dia do ano
             d - dia do mes
             H - hora do dia
             h - hora do am/pm
             m - minuto da hora
             s - segundo no minuto
             S - milesimo
             */
         }
    }
        