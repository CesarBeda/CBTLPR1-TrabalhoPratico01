

// Nomes: Caua Barros - Cesar Beda
/* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
 exibir sua temperatura equivalente em Fahrenheit. */

 import java.util.Scanner;

 public class TP01Ex10 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("vamos calcular a temperatura em Fahrenheit!");
         
         System.out.print("Digite a temperatura em celsius: ");
         double tempCel = sc.nextDouble();
         
         double tempFahr = (tempCel*1.8) + 32 ;
         
         System.out.println("A temperatura em Fahrenheit e: " + tempFahr + "F");
         
         sc.close();
     }
 }