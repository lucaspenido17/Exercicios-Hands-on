import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int n = sc.nextInt();

        long primeiro = 0;
        long segundo = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            long proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        sc.close();
    }
}