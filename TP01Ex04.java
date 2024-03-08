

// Nomes: Caua Barros - Cesar Beda
// 4. A partir dos valores da base e altura de um triangulo, calcular e exibir sua area.

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a area de um triangulo! ");
        
        System.out.print("digite a base do triangulo: ");
        double base = sc.nextDouble();
        
        System.out.print("digite a altura do triangulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("a area do triangulo e: " + area);

        sc.close();
    }
}
