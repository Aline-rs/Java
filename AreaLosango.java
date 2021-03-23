package arealosango;
import java.util.Scanner;
/**
 *
 * @author aline
 * 5° - Aréa do Losango
 */
public class AreaLosango {

    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
       
       double dmaior, dmenor, area;
   
       System.out.print("Qual o valor da diagonal maior? ");
       dmaior = input.nextDouble();
       
       System.out.print("Qual o valor da diagonal menor? ");
       dmenor = input.nextDouble();
       
       area = (dmaior * dmenor)/2;
       
       System.out.println ("O valor da área do losango é: " + area);
               
    }
    
}