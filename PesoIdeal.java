package pesoideal;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author aline
 * 13° - Peso ideal.
 */
public class PesoIdeal {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            DecimalFormat formatador = new DecimalFormat("0.00");
    
    double altura, pesoideal; 
    
        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        
        pesoideal = (72.7*altura) - 58;
        
        System.out.println("Seu peso ideal é: " + formatador.format (pesoideal));
    }
      
}

