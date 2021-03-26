package recebernota;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class ReceberNota {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double N1, N2, N3, MEDIA;
    
        System.out.println("Digite suas três notas: ");
        N1 = input.nextDouble();
        N2 = input.nextDouble();
        N3 = input.nextDouble();
        
        MEDIA = (N1+N2+N3)/3;
        
        if (MEDIA >=0 && MEDIA <3)
        {
            System.out.println("REPROVADO!");
        }
        
        else if (MEDIA >= 3 && MEDIA <7)
        {
            System.out.println("EXAME!");
        }
             
        if (MEDIA >= 7 && MEDIA <= 10)
        {
            System.out.println("APROVADO!");
        }
        else
            System.out.println("MÉDIA INCORRETA!");
        
    }
    
}
        

   


