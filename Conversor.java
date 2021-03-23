package conversor;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author aline
 * 4° - Converor Dólar > Real
 */

public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner( System.in );
       DecimalFormat formatador = new DecimalFormat("0.00");

        double real, cotreal, dolares; 
        
        System.out.print("Quantos dolares você tem? ");
        dolares = input.nextDouble();
        
        System.out.print("Digite a cotação do dólar: ");
        cotreal = input.nextDouble();
        
        real = (dolares * cotreal);
        
        System.out.println ("Você possui " + formatador.format(real)  + " reais");
    }

}