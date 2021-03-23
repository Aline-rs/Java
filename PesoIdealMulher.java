package pesoidealmulher;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author aline
 * 14° - Peso Ideal Mulher
 */
public class PesoIdealMulher {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            DecimalFormat formatador = new DecimalFormat("0.00");
    
    double altura, pesoideal; 
    
        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        
        pesoideal = (62.1*altura) - 44.7;
        
        System.out.println("Seu peso ideal é: " + formatador.format (pesoideal));
    }
      
}