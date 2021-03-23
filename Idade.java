package idade;
import java.util.Scanner; 
/**
 *
 * @author aline
 * 3° - Idade
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner( System.in );

        int  anoatual, anonasc, idade, idade2;
                
        System.out.print ("Digite seu ano de nascimento: ");
        anonasc = input.nextInt();
        
        System.out.print("Em que ano estamos? ");
        anoatual = input.nextInt();
        
        idade = (anoatual - anonasc);
        idade2 = (2050 - anonasc);
        
        System.out.println ("Sua idade hoje é: " + idade);
        System.out.println ("Sua idade em 2050 será: " + idade2);
    }
    
}