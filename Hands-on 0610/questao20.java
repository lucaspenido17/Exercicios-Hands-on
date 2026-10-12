import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de termos: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite X: ");
        double x = sc.nextDouble();

        double soma = 0;

        for (int termo = 1; termo <= quantidade; termo++) {
            int expoente = termo + 1;
            int denominador = 1;

            if (termo % 4 == 1) denominador = 1;
            else if (termo % 4 == 2) denominador = 2;
            else if (termo % 4 == 3) denominador = 3;
            else denominador = 4;

            long fatorial = 1;
            for (int i = 1; i <= denominador; i++) {
                fatorial *= i;
            }

            double valor = Math.pow(x, expoente) / fatorial;

            if (termo % 2 == 1) {
                soma -= valor;
            } else {
                soma += valor;
            }
        }

        System.out.println("S = " + soma);

        sc.close();
    }
}