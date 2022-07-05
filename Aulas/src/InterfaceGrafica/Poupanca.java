
package InterfaceGrafica;

public class Poupanca {
  
    int anos;
    double juros;
    double depositoMensal;
    
    public Poupanca (int a, double j, double dm){
    
        anos = a;
        juros = j /100;
        depositoMensal = dm;
        
    }     
        public double CalculoTotal(){
            int pagamentos = anos * 12;
            double total = 0;      
            for( int i = 0; i < pagamentos; i++ ){
                total += depositoMensal;
                total += total * juros;
            }
            return total;
        }
}
 