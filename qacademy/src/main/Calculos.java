package src.main;

public class Calculos {

static void calcIR(double salario, double aliquota, double deducao) {
    System.out.println("O IR a ser pago é: " + (salario * aliquota - deducao));
    System.out.println("O Salário bruto é: " + salario);
    System.out.println("O Salário líquido é: " + (salario - (salario * aliquota - deducao)));
}

}