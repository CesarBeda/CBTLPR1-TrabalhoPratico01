
// Nomes: Caua Barros - Cesar Beda
// 2. Calcular e exibir a area de um quadrado, a partir do valor de sua aresta que sera digitado

import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a area de um Quadrado! ");
        System.out.print("digite a aresta (lado) do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("a area do quadrado e: " + area);

        sc.close();
    }
}