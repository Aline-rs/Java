package temperatura;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author aline
 * 6° - Conversor de temperatura
 */
public class Temperatura {

    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
       DecimalFormat formatador = new DecimalFormat("0.00");
       double Tcel, Tfar;
   
       System.out.print ("Digite a temperatura em celsius: ");
       Tcel= input.nextDouble();
       
       Tfar = ((Tcel * 1.8) + 32);
    
       System.out.println ("A temperatura em fahrenheit é: " + formatador.format (Tfar));
               
    }
    
}
