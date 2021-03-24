package aprovadooureprovado;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class AprovadoouReprovado {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    double nota;
    
        System.out.println("Digite sua nota: ");
        
        nota = input.nextDouble();
        
        if (nota >=7)
            System.out.println("Aprovado!");
        else if(nota <7)
            System.out.println("Reprovado!");
                    
    }
}
