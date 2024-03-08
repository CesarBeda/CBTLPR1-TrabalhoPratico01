

// Nomes: Caua Barros - Cesar Beda
// 11. A partir do diametro de um circulo que sera digitado, calcular e exibir sua area.

import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a area de um circulo!");
        
        System.out.print("Digite o diametro do circulo: ");
        double diamCir = sc.nextDouble();
        double raioCir = diamCir /2;
        
        double areaCir = Math.PI * Math.pow(raioCir,2);
       
        
        System.out.println("A area do cirulo e: " + areaCir);
        
        sc.close();
    }
}