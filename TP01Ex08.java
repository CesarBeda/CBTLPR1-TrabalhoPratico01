
// Nomes: Caua Barros - Cesar Beda
/*8. Sabendo que uma milha maritima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilometro possui mil metros, fazer um programa para
converter milhas maritimas em quilometros.
*/

import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular milhas maritimas em quilometros ");
        
        System.out.print("digite o número e milhas: ");
        double milha = sc.nextDouble();
      
        double metroMilha = 1852 * milha;
        double kM = 1000;
        double convert = metroMilha / kM;

        System.out.println("Uma milha maritima equivale a: " + convert + "KM");
        
        sc.close();
    }
}
