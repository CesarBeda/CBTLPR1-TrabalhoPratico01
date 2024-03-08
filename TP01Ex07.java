

// Nomes: Caua Barros - Cesar Beda
// 7. Calcular e exibir a media geometrica de dois valores quaisquer que serao digitados.


import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a media geometrica de 2 valores ");
        
        System.out.print("digite o valor 1: ");
        double v1 = sc.nextDouble();
        System.out.print("digite o valor 2: ");
        double v2 = sc.nextDouble();
        
        double media = Math.sqrt (v1*v2);
       

        System.out.println("a media geometrica e: " + media);

        sc.close();
    }
}