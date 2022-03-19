package src.main;

import java.util.Scanner;

public class Ex8P {

    static void calcIR(double salario) {
        AtributosImposto atributosImposto = new AtributosImposto(salario);
        System.out.println("O IR a ser pago é: " + (salario * atributosImposto.getAliquota() - atributosImposto.getDeducao()));
        System.out.println("O Salário bruto é: " + salario);
        System.out.println("O Salário líquido é: " + (salario - (salario * atributosImposto.getAliquota() - atributosImposto.getDeducao())));
    }

    static void IR() {

        try (Scanner scan = new Scanner(System.in)) {
            // Inserir Salario
                System.out.print("Inserir Salario: ");           
                double salario = scan.nextDouble();
                calcIR(salario);
            }
        }

      public static void main(String[] args) {
        IR();
      } 
}
