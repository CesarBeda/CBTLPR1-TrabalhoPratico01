
// Nomes: Caua Barros - Cesar Beda
// 1. Entrar via teclado com a base e a altura de um retangulo, 
//calcular e exibir sua area.

import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a area de um retangulo! ");
        System.out.print("digite a base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("a area do retangulo e: " + area);

        sc.close();
    }
}