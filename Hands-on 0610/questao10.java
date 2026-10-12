import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de termos: ");
        int n = sc.nextInt();

        System.out.print("Primeiro termo: ");
        int a1 = sc.nextInt();

        System.out.print("Razão: ");
        int r = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            int termo = a1 + (i - 1) * r;
            System.out.print(termo + " ");
            soma += termo;
        }

        System.out.println();
        System.out.println("Soma = " + soma);

        sc.close();
    }
}