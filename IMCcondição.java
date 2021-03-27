package imccondição;
import java.util.Scanner;
/**
 *
 * @author aline
 */
public class IMCcondição {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    double peso, altura, IMC;
    
        System.out.println("Digite seu peso e sua altura: ");
        peso = input.nextDouble();
        altura = input.nextDouble();
        
        IMC = peso/(Math.pow (altura,2));
        
        if (IMC <= 20)
        {
            System.out.println("Abaixo do peso!");
        }
        else if (IMC >= 20 && IMC <= 25)
        {
            System.out.println("Peso normal!");
        }
        else if (IMC >= 25 && IMC <= 30)
        {
            System.out.println("Sobre peso!");
        }
        else if (IMC >= 30 && IMC <= 40)
        {
            System.out.println("Obeso!");
        }
        else if (IMC >= 40)
        {
            System.out.println("Obeso mórbido!");
        }
    }
}
    

        
