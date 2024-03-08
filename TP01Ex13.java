
// Nomes: Caua Barros - Cesar Beda
/* 13. Calcular e exibir a velocidade final (em km/h) de um automovel, a partir dos valores da velocidade inicial (em m/s), da aceleracao (m/s2) 
e do tempo de percurso (em s) que serao digitados */

import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a velocidade final!");
        
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double velIni = sc.nextDouble();
        
        System.out.print("Digite a aceleracao em (m/s2): ");
        double acel = sc.nextDouble();
        
        System.out.print("Digite o tempo de percurso em segundos: ");
        double tempPer = sc.nextDouble();
        
        double vF = (velIni + (acel*tempPer)) * 3.6;
       
        System.out.println("A velocidade final e: " + vF + "KM/H");
        
        sc.close();
    }
}