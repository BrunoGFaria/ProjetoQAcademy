package src.main;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            // Inserir Número
            System.out.print("Inserir Número: ");
            int num = scan.nextInt();
            scan.close();

            System.out.println("Iteração de 2 do número " + num);

            for(int c = 1; c<=100; c++) {
                num = num + 2;
                System.out.println(num);
            }
        }
    }