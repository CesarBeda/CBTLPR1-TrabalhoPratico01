

// Nomes: Caua Barros - Cesar Beda
// 6. Calcular e exibir a media aritmetica de quatro valores quaisquer que serao digitados.

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a media de 4 valores! ");
        
        System.out.print("digite o valor 1: ");
        double v1 = sc.nextDouble();
        System.out.print("digite o valor 2: ");
        double v2 = sc.nextDouble();
        System.out.print("digite o valor 3: ");
        double v3 = sc.nextDouble();
        System.out.print("digite o valor 4: ");
        double v4 = sc.nextDouble();
        
        double media = (v1+v2+v3+v4) / 4;
       

        System.out.println("a media e: " + media);

        sc.close();
    }
}
