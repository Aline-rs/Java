package diadasemana;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class DiadaSemana {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int num;
    
        System.out.println("Digite um número de 1 a 7: ");
        num = input.nextInt();
        
        switch (num){
            case 1: 
                System.out.println("Segunda-Feira");break;
            case 2:
                System.out.println("Terça-Feira");break;
            case 3: 
                System.out.println("Quarta-Feira");break;
            case 4: 
                System.out.println("Quinta-Feira");break;
            case 5:
                System.out.println("Sexta-Feira");break;
            case 6:
                System.out.println("Sábado");break;
            case 7:
                System.out.println("Domingo");break;
            default: 
                System.out.println("Valor inválido.");
                     
        }
    }
    
}
