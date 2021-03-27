package aumentoounão;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class AumentoouNão {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    double salario, salariofinal, aumento;
    
        System.out.println("Digite seu salário: ");
        salario = input.nextDouble();
        
        if (salario <= 1000)
        {
            aumento = (salario * 30)/100;
            salariofinal = salario + aumento;
            System.out.println("Seu salário agora é: " + salariofinal);
        }
        else if (salario > 1000)
            System.out.println("Você não receberá aumento!");
    }
    
}
