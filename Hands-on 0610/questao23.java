import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1621.00;
        double totalFolha = 0;
        int totalPecas = 0;
        int pecasHomens = 0, homens = 0;
        int pecasMulheres = 0, mulheres = 0;

        double maiorSalario = 0;
        int numeroMaior = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Número do operário: ");
            int numero = sc.nextInt();

            System.out.print("Peças produzidas: ");
            int pecas = sc.nextInt();

            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            double salario = salarioMinimo;

            if (pecas >= 31 && pecas <= 50) {
                salario += (pecas - 30) * salarioMinimo * 0.03;
            } else if (pecas > 50) {
                salario += (pecas - 30) * salarioMinimo * 0.05;
            }

            totalFolha += salario;
            totalPecas += pecas;

            if (sexo == 'M') {
                pecasHomens += pecas;
                homens++;
            } else if (sexo == 'F') {
                pecasMulheres += pecas;
                mulheres++;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                numeroMaior = numero;
            }

            System.out.printf("Operário %d - Salário: R$ %.2f%n", numero, salario);
        }

        System.out.printf("Total da folha = R$ %.2f%n", totalFolha);
        System.out.println("Total de peças = " + totalPecas);

        if (homens > 0) {
            System.out.println("Média de peças dos homens = " + (double) pecasHomens / homens);
        }

        if (mulheres > 0) {
            System.out.println("Média de peças das mulheres = " + (double) pecasMulheres / mulheres);
        }

        System.out.println("Operário que recebeu maior salário = " + numeroMaior);

        sc.close();
    }
}