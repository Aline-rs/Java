package equaçãomaisswitch;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author aline
 */
public class EquaçãoMaisSwitch {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    DecimalFormat formatador = new DecimalFormat("0.00");
    
    double a, b, c, delta, raiz1, raiz2, x;
    
       System.out.print("Informe os coeficientes de a, b e c: ");
       
       a = input.nextDouble();
       b = input.nextDouble();
       c = input.nextDouble();
       
       delta = Math.pow (b, 2) - (4 * a * c);
       
       if (delta < 0)
       {
           System.out.println("Não existe raiz real.");
       }
       else if (delta == 0)
       {
           x = (-b/2*a);
           System.out.println("O valor da raíz é: " + x);
       }
       else if (delta > 0)
       {
           raiz1 = (-b + Math.sqrt (delta))/2 * a;
           raiz2 = (-b - Math.sqrt (delta))/2 * a;
           System.out.println("O valor das raízes são: " + raiz1 + " e " + raiz2);
       }
       }
    }
    

