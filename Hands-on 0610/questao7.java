import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        int filhos;
        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        int pessoas = 0;
        int ate100 = 0;

        System.out.print("Digite o salário (negativo encerra): ");
        salario = sc.nextDouble();

        while (salario >= 0) {
            System.out.print("Digite o número de filhos: ");
            filhos = sc.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            pessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 100) {
                ate100++;
            }

            System.out.print("Digite o salário (negativo encerra): ");
            salario = sc.nextDouble();
        }

        if (pessoas > 0) {
            System.out.println("Média salarial = " + somaSalarios / pessoas);
            System.out.println("Média de filhos = " + (double) somaFilhos / pessoas);
            System.out.println("Maior salário = " + maiorSalario);
            System.out.println("Percentual até R$100 = " + (double) ate100 * 100 / pessoas + "%");
        }

        sc.close();
    }
}