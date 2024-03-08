

// Nomes: Caua Barros - Cesar Beda
/* 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serao digitados. */

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a volume de um cone!");
        
        System.out.print("Digite a altura do cone: ");
        double alturaCone = sc.nextDouble();
        
        System.out.print("Digite o raio do cone: ");
        double raioCone = sc.nextDouble();
        
        double volCone = (Math.PI * Math.pow(raioCone,2) * alturaCone) / 3;
       
        
        System.out.println("o Volume do cone e: " + volCone + " M3");
        
        sc.close();
    }
}
