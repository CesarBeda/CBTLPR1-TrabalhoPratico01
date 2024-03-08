
// Nomes: Caua Barros - Cesar Beda
/*15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
*/
import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos coverter dolares para reais!");

        System.out.print("digite a cotacao de dolar para real: ");
        double cotacao = sc.nextDouble();

        System.out.print("digite a quantia em dolares: ");
        double dolar = sc.nextDouble();

        double conversao = dolar * cotacao;

        System.out.println(dolar + " dolares equivale a " + conversao + " reais");

        sc.close();
    }
}