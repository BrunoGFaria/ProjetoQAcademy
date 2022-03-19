package src.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            // Inserir Número
            System.out.print("Inserir Número: ");
            int num = scan.nextInt();
            scan.close();

            JOptionPane.showMessageDialog(null, "Tabuada do " + num);
            for(int c = 1; c<=10; c++) {
                int result = c * num;
                System.out.println("  " + num + " * " + c + " = " + result);
            }
    }

}