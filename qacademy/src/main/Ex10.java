
package src.main;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            // Inserir Número
            System.out.print("Inserir Valor Investido: ");
            double valor = scan.nextDouble();

            while (valor <= 100) {
                System.out.println("Invista um valor maior que 100!");
                System.out.print("Inserir Valor Investido: ");
                valor = scan.nextDouble();
                }
                if (valor > 0) {
                    double taxa = 0.05;
                    int anos = 10;
                   
                    double juros = valor * taxa * anos;
                   
                    System.out.println("O total investido é: " + valor);
                    System.out.println("O total dos juros é: " + juros);
                    System.out.println("O total com juros é: " + (valor + juros));
            }
        }
    }
}
