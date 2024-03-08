
// Caua Barros - Cesar Beda
/*Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.*/

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos calcular a soma dos valores de 5 produtos e seu troco");
        
        System.out.print("digite o valor do produto 1: ");
        double p1 = sc.nextDouble();
        System.out.print("digite o valor do produto 2: ");
        double p2 = sc.nextDouble();
        System.out.print("digite o valor do produto 3: ");
        double p3 = sc.nextDouble();
        System.out.print("digite o valor do produto 4: ");
        double p4 = sc.nextDouble();
        System.out.print("digite o valor do produto 5: ");
        double p5 = sc.nextDouble();

        double valorTotal = p1 + p2 + p3 + p4 + p5;

        System.out.println("O valor Total dos produtos: " + valorTotal);
        System.out.print("Informe o valor pago: ");
        double valorPago = sc.nextDouble();
        
        System.out.println("troco: " + (valorPago - valorTotal ));

        sc.close();
    }
}
