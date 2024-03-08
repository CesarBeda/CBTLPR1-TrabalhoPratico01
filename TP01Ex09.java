

// Nomes: Caua Barros - Cesar Beda
// 9. Calcular e exibir a tensao de um determinado circuito eletronico a partir dos
// valores da resistencia e corrente eletrica que serao digitados. Utilize a lei de Ohm.

import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a tensao de um circuito eletronico ");
        
        System.out.print("Digite a Resistencia: ");
        double resistencia = sc.nextDouble();
        
        System.out.print("Digite a Corrente: ");
        double corrente = sc.nextDouble();
        
        double tensao = resistencia * corrente ;
        
        System.out.println("A tensao do circuito eletrico e igual a: " + tensao + "V");
        
        sc.close();
    }
}