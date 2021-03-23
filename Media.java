/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;
import java.util.Scanner;
/**
 *
 * @author aline
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );

        int  N1, N2, N3;

        System.out.print("Informe um numero: ");
        N1 = input.nextInt();

        System.out.print("Informe outro numero: ");
        N2 = input.nextInt();
        
        N3 = (N1 + N2)/2;
       System.out.println("A Média é: " + N3);
    
}

}