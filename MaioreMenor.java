package maioremenor;
import java.util.Scanner;

/**
 *
 * @author aline
 */
public class MaioreMenor {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os números: ");
        int n1, n2;
        n1 = input.nextInt();
        n2 = input.nextInt();
        if (n1 > n2)
        {
            System.out.println("Maior: " + n1);
            System.out.println("Menor: " + n2);
        }
        else if (n2 > n1)
        {
            System.out.println("Maior: " + n2);
            System.out.println("Menor: " + n1);
        }
        else
            System.out.println("Os números são iguais!!");
    }
}

