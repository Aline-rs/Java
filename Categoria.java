package categoria;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Categoria {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int idade;
    
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        
        if (idade >= 0 && idade <= 7)
        {
            System.out.println("INFANTIL!");
        }
        else if (idade >= 8 && idade <= 10)
        {
            System.out.println("JUVENIL!");
        }
        else if (idade >= 11 && idade <= 15)
        {
            System.out.println("ADOLESCENTE!");
        }
        else if (idade >= 16 && idade <= 30)
        {
            System.out.println("ADULTO!");
        }
        else if (idade >= 30)
        {
            System.out.println("SENIOR!");
        }
    }
    
}
