package mediapor3;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class MediaPor3 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    double valor1, valor2, valor3, media;
    
        System.out.println("Digite o primeiro número: ");
        valor1 = input.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        valor2 = input.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        valor3 = input.nextDouble();
        
        media = (valor1+valor2+valor3)/3;
        
        System.out.format("O valor da média é: %.2f", media);
    }
    
}
