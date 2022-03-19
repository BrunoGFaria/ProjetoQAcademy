package src.main;

import java.util.Scanner;

public class Ex8 {
    public static double aliquota;
    public static double deducao;

    static void calcIR(double salario) {
        System.out.println("O IR a ser pago é: " + (salario * aliquota - deducao));
        System.out.println("O Salário bruto é: " + salario);
        System.out.println("O Salário líquido é: " + (salario - (salario * aliquota - deducao)));
    }

    static void IR() {

        try (Scanner scan = new Scanner(System.in)) {
            // Inserir Salario
            System.out.print("Inserir Salario: ");           
            double salario = scan.nextDouble();

            if (salario >= 0.00 && salario <= 1903.98) {
              aliquota = 1;
              deducao = 0;
              //Calculos.calcIR(salario, aliquota, deducao);
            }
            if (salario >= 1903.99 && salario <= 2826.65) {
                aliquota = 0.075;
                deducao = 142.80;
                //calcIR(salario);
              }
              if (salario >= 2826.66 && salario <= 3751.05) {
                aliquota = 0.15;
                deducao = 354.80;
                //calcIR(salario);
              }
              if (salario >= 3751.06 && salario <= 4664.68) {
                aliquota = 0.225;
                deducao = 636.13;
                //calcIR(salario);
              }
              if (salario > 4664.68) {
                aliquota = 0.275;
                deducao = 869.36;
                //calcIR(salario);
              }
              calcIR(salario);

            }

        }

      public static void main(String[] args) {
        IR();
      } 
}
