package quantidadesalariomin;
import java.util.Scanner;
/**
 *
 * @author aline
 * 8° - Quantidade de salarios mínimos.
 */
public class QuantidadeSalarioMin {

    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
       
       double salariomin = 1000.00;
       double salafuncio, quantsala;
       
       System.out.print ("Informe o valor do seu salário: ");
       
       salafuncio = input.nextDouble();
       quantsala = (salafuncio/salariomin);
       
       System.out.println("A quantidade de salários minimos que o funcionário possui é: " + quantsala);
    }
    
}