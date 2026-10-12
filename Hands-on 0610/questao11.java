import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();

            for (int j = 1; j <= n; j++) {
                System.out.println(j + " x " + n + " = " + (j * n));
            }

            System.out.println();
        }

        sc.close();
    }
}