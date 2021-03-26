package tresladostriangulo;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class TresLadosTriangulo {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double X, Y, Z;
    
        System.out.println("Escreva o valor dos lados do triângulo: ");
        X = input.nextDouble();
        Y = input.nextDouble();
        Z = input.nextDouble();
        
        if (X > Y+Z){
            System.out.println("Os valores não formam um triÂngulo");
        }
        else if (Y > X+Z ){
            System.out.println("Os valores não formam um triÂngulo");
        }
        else if (Z > Y+X){
            System.out.println("Os valores não formam um triÂngulo");
        }
        else{
            System.out.println("Os valores formam um triângulo!");
        }
            
    }
    
}
