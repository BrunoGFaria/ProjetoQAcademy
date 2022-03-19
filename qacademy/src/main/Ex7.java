package src.main;

import java.util.Scanner;

public class Ex7 {
    public static double faixa1 = 1045.00;
    public static double min_faixa2 = 1045.01;
    public static double max_faixa2 = 2089.60;
    public static double min_faixa3 = 2089.61;
    public static double max_faixa3 = 3134.40;
    public static double min_faixa4 = 3134.41;
    public static double max_faixa4 = 6101.06;

    public static double aliquota_faixa1 = 0.075; // 7,50%
    public static double aliquota_faixa2 = 0.09; // 9%
    public static double aliquota_faixa3 = 0.12; // 12%
    public static double aliquota_faixa4 = 0.14; // 14%
    public static double aliquota_final = 815.50;

    static void INSS() {

        try (Scanner scan = new Scanner(System.in)) {
            // Inserir Salario
            System.out.print("Inserir Salario: ");           
            double Salario = scan.nextDouble();

            if (Salario >= faixa1 && Salario <= min_faixa2) {
              System.out.print("O INSS a ser pago é: " + (Salario * aliquota_faixa1)); 
            }
            
            if (Salario >= min_faixa2 && Salario <= max_faixa2) {
              System.out.print("O INSS a ser pago é: " + (Salario * aliquota_faixa2)); 
            }
            
            if (Salario >= min_faixa3 && Salario <= max_faixa3) {
              System.out.print("O INSS a ser pago é: " + (Salario * aliquota_faixa3)); 
            }
            
            if (Salario >= min_faixa4 && Salario <= max_faixa4) {
              System.out.print("O INSS a ser pago é: " + (Salario * aliquota_faixa4)); 
            }
            if (Salario > max_faixa4) {
              System.out.print("O INSS a ser pago é: " + aliquota_final);
            }

            }

        }

      public static void main(String[] args) {
        INSS();
      } 
}
