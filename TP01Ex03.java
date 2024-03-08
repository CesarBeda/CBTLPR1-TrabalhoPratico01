

// Nomes: Caua Barros - Cesar Beda
// 3. Calcular e exibir a area de um quadrado a partir do valor de sua diagonal que sera digitado

import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a area de um Quadrado! ");
        System.out.print("digite a diagonal do quadrado: ");
        double diagonal = sc.nextDouble();

        double area = (diagonal * diagonal) / 2;

        System.out.println("a area do quadrado e: " + area);

        sc.close();
    }
}
