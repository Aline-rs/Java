package porcentagem;
import java.util.Scanner;
/**
 *
 * @author aline
 * 11° - Porcentagem
 */
public class Porcentagem {

    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
        double valor, gorjeta; 
        System.out.println("O valor dos gastos no restaurante foi de: ");
        valor = input.nextDouble();
        
        gorjeta = (valor*0.10);
        
        System.out.println("O valor da gorjeta é: " + gorjeta);
        {
            
        }
 
    }
    
}