package pesoidealcase;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author aline
 */
public class PesoIdealcase {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    DecimalFormat formatador = new DecimalFormat("00.00");
        System.out.println("Homem = 1; Mulher = 2: ");
        int num = input.nextInt();
        
        double Haltura, Maltura, PIH, PIM;
        
        switch(num){
            case 1:
                System.out.println("Digite a altura do homem em metros: ");
                Haltura = input.nextDouble();
                PIH = (72.7 * Haltura) - 58;
                System.out.println("O peso ideal do homem é: " + formatador.format(PIH) + " quilos."); break;
                
            case 2:
                System.out.println("Digite a altura da mulher em metros: ");
                Maltura = input.nextDouble();
                PIM = (62.1 * Maltura) - 44.7;
                System.out.println("O peso ideal da mulher é: " + formatador.format(PIM) + " quilos.");break;
                
            default:
                System.out.println("Número digitado não é válido!");
                
        }
        
                
    }
    
}
    
