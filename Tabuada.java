package tabuada;
import java.util.Scanner;
/**
 *
 * @author aline
 * 9° - Tabuada 
 */
public class Tabuada {

    public static void main(String[] args) {
    Scanner teclado = new Scanner( System.in );
        int valor;
        System.out.print("Digite o número a ser multiplicado: ");
        valor = teclado.nextInt();
        for (int i = 0; i <= 10; i++)
            System.out.println(valor + " x " + i + " = " + (valor*i));
        {
            
        }
 
    }
    
}