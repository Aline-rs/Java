package votos;

import java.util.Scanner;

/**
 *
 * @author aline
 */
public class Votos {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int TotalEleitores, Verde, Azul,VotoNulo;
        float PorcentagemA, PorcentagemV, PorcentagemVN;
        
        System.out.print("Digite o número total de eleitores: ");
        TotalEleitores = input.nextInt();
        
        System.out.println("Total de votos candidato Verde: ");
        Verde = input.nextInt();
        
        System.out.println("Total de votos candidato Azul: ");
        Azul = input.nextInt();
        
        
        VotoNulo = (TotalEleitores-Verde-Azul);
        PorcentagemV = (Verde*100)/TotalEleitores;
        PorcentagemA = (Azul*100)/TotalEleitores; 
        PorcentagemVN = (VotoNulo*100)/TotalEleitores; 
        
        System.out.println("Porcentagem Verde: " + PorcentagemV);
        System.out.println("Porcentagem Azul: " + PorcentagemA);
        System.out.println("Porcentagem Votos Nulos: " + PorcentagemVN);
    }
    
}
