import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        double nota;

         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 100: ");
        nota = scanner.nextDouble();

        while (nota < 0 || nota > 100) {

            System.out.println("Nota inválida.");

            System.out.print("Digite uma nota entre 0 e 100: ");
            nota = scanner.nextDouble();
        }

        System.out.println("Nota válida: " + nota);
        }
    }

