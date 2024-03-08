

// Nomes: Caua Barros - Cesar Beda
/* 14. Calcular e exibir o volume livre de um ambiente que contem uma esfera de raio "r" inscrita em um cubo perfeito de aresta A. 
Os valores de R e A serao digitados. */

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular o volume livre entre um cubo e uma esfera!");
        
        System.out.print("Digite a aresta o cubo: ");
        double a = sc.nextDouble();
        double volCubo = Math.pow(a,3);
        System.out.println("Volume do cubo e: " + volCubo);
        
        System.out.print("Digite o raio da esfera: ");
        double r = sc.nextDouble();
        double volEsfera = (4.0/3.0) * Math.PI * Math.pow(r,3);
        System.out.println("Volume da esfera e: " + volEsfera);
        
        double volLivre = volCubo - volEsfera;
        System.out.println("O volume livre do ambiente e: " + volLivre);
        
        
        sc.close();
    }
}
