package equaçãoseggrau;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author aline
 * 7° - Equação do segundo grau
 */
public class EquaçãoSegGrau {

    public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
       DecimalFormat formatador = new DecimalFormat("0.00");
       
       double a, b, c, delta, raiz1, raiz2;
       
       System.out.print("Informe os coeficientes de a, b e c: ");
       
       a = input.nextDouble();
       b = input.nextDouble();
       c = input.nextDouble();
       
       delta = Math.pow (b, 2) - (4 * a * c);
       
       if (delta >= 0) {
       raiz1 = (-b + Math.sqrt (delta))/2 * a;
       raiz2 = (-b - Math.sqrt (delta))/2 * a;
       
       System.out.println ("O valor das raizes são: " + raiz1 + " e " + raiz2); 
       
       }else 
           System.out.println("Não existe raiz exata.");
       
    }
    
}
    
    

