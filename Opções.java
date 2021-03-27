package opções;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Opções {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int num1, num2,soma,sub, mult, escolha;
    double divi;
    
        System.out.println("Digite dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        System.out.println("O que você deseja fazer? 1 - SOMAR; 2 - SUBTRAIR; 3 - MULTIPLICAR; 4 - DIVIDIR; 5 - SAIR.");
        escolha = input.nextInt();
        
        switch (escolha){
                case 1: 
                    soma = num1 + num2;
                    System.out.println("O valor da soma é: " + soma);break;
                case 2:
                    sub = num1 - num2;
                    System.out.println("O valor da subtração é: " + sub);break;
                case 3:
                    mult = (num1*num2);
                    System.out.println("O valor da multiplicação é: " + mult);break;
                case 4: 
                    divi = (num1/num2);
                    System.out.println("O valor da divisão é: " + divi);break;
                case 5: 
                    System.out.println("SAIR.");break;
                default:
                    System.out.println("Valor inválido!");
        }
    }
}
