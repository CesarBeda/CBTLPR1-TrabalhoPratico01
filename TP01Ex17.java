import java.util.Scanner;

// Caua Barros - Cesar Beda
//17. Entrar via teclado com dois valores quaisquer "X" e "Y". Calcular e exibir o
//cálculo XY ("X" elevado a "Y"). Pesquisar as funções Exp e Ln.

public class TP01Ex17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a area de um retangulo! ");
        System.out.print("digite o valor de x (base): ");
        float x = sc.nextFloat();

        System.out.print("digite o valor de y (expoente): ");
        float y = sc.nextFloat();

        double potencia = Math.pow(x, y);

        System.out.println(x + " elevado a " + y + " = " + potencia+".");

        sc.close();
    }
}
