
// Nomes: Caua Barros - Cesar Beda
// 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diametro que sera digitado.

import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular o volume de uma esfera!");
        
        System.out.print("digite o diametro da esfera: ");
        
        double diametro = sc.nextDouble();
        double raio = diametro/2;

        // valor 4.0 e 3.0 na formula como double pois se colocar 4 e 3 ele considera o valor como int e a conta sai errada

        double volume = (4.0/3.0) * Math.PI * Math.pow(raio , 3);

        System.out.println("o volume da esfera e: " + volume);

        sc.close();
    }
}