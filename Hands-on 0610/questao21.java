import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1621.00;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Funcionário " + i);

            System.out.print("Código: ");
            int codigo = sc.nextInt();

            System.out.print("Horas trabalhadas: ");
            int horas = sc.nextInt();

            char turno;
            do {
                System.out.print("Turno (M/V/N): ");
                turno = sc.next().toUpperCase().charAt(0);
            } while (turno != 'M' && turno != 'V' && turno != 'N');

            char categoria;
            do {
                System.out.print("Categoria (O/G): ");
                categoria = sc.next().toUpperCase().charAt(0);
            } while (categoria != 'O' && categoria != 'G');

            double percentualHora;

            if (categoria == 'G' && turno == 'N') {
                percentualHora = 0.18;
            } else if (categoria == 'G') {
                percentualHora = 0.15;
            } else if (turno == 'N') {
                percentualHora = 0.13;
            } else {
                percentualHora = 0.10;
            }

            double valorHora = salarioMinimo * percentualHora;
            double salarioInicial = horas * valorHora;
            double auxilio;

            if (salarioInicial <= 1080) {
                auxilio = salarioInicial * 0.20;
            } else if (salarioInicial <= 2160) {
                auxilio = salarioInicial * 0.15;
            } else {
                auxilio = salarioInicial * 0.05;
            }

            double salarioFinal = salarioInicial + auxilio;

            System.out.println("Código = " + codigo);
            System.out.println("Horas = " + horas);
            System.out.printf("Valor da hora = R$ %.2f%n", valorHora);
            System.out.printf("Salário inicial = R$ %.2f%n", salarioInicial);
            System.out.printf("Auxílio-alimentação = R$ %.2f%n", auxilio);
            System.out.printf("Salário final = R$ %.2f%n", salarioFinal);
            System.out.println();
        }

        sc.close();
    }
}