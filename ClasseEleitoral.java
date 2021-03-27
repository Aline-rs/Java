package classeeleitoral;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class ClasseEleitoral {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int idade;
    
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        
        if (idade <= 16)
        {
            System.out.println("NÃO ELEITOR!");
        }
        else if (idade >=16 && idade <= 18)
        {
            System.out.println("ELEITOR FACULTATIVO!");
        }
        else if (idade >= 18 && idade <= 65)
        {
            System.out.println("ELEITOR OBRIGATÓRIO!");
        }
        else if (idade > 65)
        {
            System.out.println("ELEITOR FACULTATIVO!");
        }
    }
    
}
