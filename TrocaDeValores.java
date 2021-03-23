package trocadevalores;
import java.util.Scanner;
/**
 *
 * @author aline
 */
public class TrocaDeValores {
public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    
    int A, B, VariavelTemporaria;
    System.out.println("Digite o valor de A: ");
    A = input.nextInt();
    
    System.out.println("Digite o valor de B: ");
    B = input.nextInt();
            
    VariavelTemporaria = A;
    A = B;
    B = VariavelTemporaria;
    
    System.out.println("A = " + A + " / B = "+ B);
    
    }
}
   