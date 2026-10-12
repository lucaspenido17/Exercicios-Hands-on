import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        double e = 1;
        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            e += 1.0 / fatorial;
        }

        System.out.println("E = " + e);

        sc.close();
    }
}