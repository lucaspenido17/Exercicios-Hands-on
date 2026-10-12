import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;

            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print(" + 1/" + i);
            }
        }

        System.out.println();
        System.out.println("S = " + soma);

        sc.close();
    }
}