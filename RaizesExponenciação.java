package raizes.exponenciação;
import java.util.Scanner;
/**
 *
 * @author aline
 * 10° - Raizes e Exponenciação
 */
public class RaizesExponenciação {

    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
        double valor, nqua, ncubo, nrqua, nrcubo;
        System.out.println("Digite um número positivo: ");
        valor = input.nextDouble();
        
        nqua = Math.pow(valor,2);
        ncubo = Math.pow(valor,3);
        nrqua = Math.sqrt(valor);
        nrcubo = Math.cbrt(valor);
                
        System.out.println(valor + " elevado ao quadrado é: " + nqua);
        System.out.println(valor + " elevado ao cubo é: " + ncubo);
        System.out.println("A raiz quadrada de " + valor + " é: " + nrqua);
        System.out.println("A raiz cúbica de " + valor + " é: " + nrcubo);
        
    }
    
}