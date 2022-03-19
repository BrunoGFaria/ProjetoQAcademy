import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Inserir Número 1
        System.out.print("Inserir Número 1: ");
        int num1 = scan.nextInt();
        // Inserir Número 2
        System.out.print("Inserir Número 2: ");
        int num2 = scan.nextInt();
        scan.close();
        // Valores dos numeros
        System.out.println("O valor do primeiro numero e " + num1);
        System.out.println("O valor do segundo numero e " + num2);
    }       

}
