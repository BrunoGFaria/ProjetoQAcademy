package src.main;

import java.util.Scanner;

public class Ex6 {

    public static double nota_maxima = 10;
    public static double nota_minima = 0;
    private static double media;
    private static double nota1;
    private static double nota2;

    static void mediaAluno() {

        try (Scanner scan = new Scanner(System.in)) {
            // Inserir Nota 1
            System.out.print("Inserir Nota 1: ");           
            nota1 = scan.nextDouble();

            while (nota1 < nota_minima || nota1 > nota_maxima) {
                System.out.println("Insira uma nota entre 0 e 10!");
                System.out.print("Inserir Nota 1: ");
                nota1 = scan.nextDouble();
            }
               
                        // Inserir Nota 2
                        System.out.print("Inserir Nota 2: ");           
                        nota2 = scan.nextDouble();
            
                        while (nota2 < nota_minima || nota2 > nota_maxima) {
                            System.out.println("Insira uma nota entre 0 e 10!");
                            System.out.print("Inserir Nota 2: ");
                            nota2 = scan.nextDouble();

            }
            media = (nota1 + nota2)/2;
            System.out.println("A Média do Aluno é: " + media);

            if (media < 5) {
                System.out.println("Recuperação! =(");
            }  if (media == 5) {
                System.out.println("Exame! -.-");
            } if (media > 5) {
                System.out.println("Passou! =)");
            }

            }
        }

      public static void main(String[] args) {
        mediaAluno();
      }
    
}
