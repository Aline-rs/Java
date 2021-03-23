package número;
import java.util.Scanner;
/**
 *
 * @author aline
 * 12° - antecessor, o sucessor, o dobro e a metade do número informado
 */
public class Número {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valor, antecessor, sucessor, dobro, metade;
        System.out.println("Escreva um número: ");
        valor = input.nextInt();
        
        antecessor = (valor - 1);
        sucessor = (valor + 1);
        dobro = (valor + valor);
        metade = (valor/2);
        
        System.out.println("O antecessor de " + valor + " é: " + antecessor);
        System.out.println("O sucessor de " + valor + " é: " + sucessor);
        System.out.println("O dobro de " + valor + " é: " + dobro);
        System.out.println("A metade de " + valor + " é: " + metade);
    }
}
    

