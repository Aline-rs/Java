/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciostestes;
import java.util.Scanner;

/**
 *
 * @author aline
 */
public class EXERCICIOSTESTES {

    /**
     * @param args the command line arguments
     */
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
