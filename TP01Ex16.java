
// Caua Barros - Cesar Beda
/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.*/

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("vamos calcular as razoes trigonometricas de um angulo");

    System.out.print("Digite o valor do angulo em graus: ");
    double anguloGraus = sc.nextDouble();


    // Converte o ângulo de graus para radianos
    double anguloRadianos = Math.toRadians(anguloGraus);
    // Calcula o seno do ângulo
    double seno = Math.sin(anguloRadianos);
    // Calcula o cosseno do ângulo
    double cosseno = Math.cos(anguloRadianos);
    // Calcula a tangente do ângulo
    double tangente = Math.tan(anguloRadianos);
    // Calcula o secante do ângulo
    double secante = 1 / cosseno;   //formula secante


    System.out.println("O seno de " + anguloGraus + " graus e: " + seno);
    System.out.println("O cosseno de " + anguloGraus + " graus e: " + cosseno);
    System.out.println("A tangente de " + anguloGraus + " graus e: " + tangente);
    System.out.println("A secante de " + anguloGraus + " graus e: " + secante);

    sc.close();
    }
}
