import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 75; i++) {
            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();

            System.out.print("Nota final: ");
            double nota = sc.nextDouble();

            char conceito;

            if (nota > 9) {
                conceito = 'A';
            } else if (nota >= 7) {
                conceito = 'B';
            } else if (nota >= 5) {
                conceito = 'C';
            } else {
                conceito = 'D';
            }

            System.out.println("Matrícula: " + matricula);
            System.out.println("Nota final: " + nota);
            System.out.println("Conceito: " + conceito);
            System.out.println();
        }

        sc.close();
    }
}