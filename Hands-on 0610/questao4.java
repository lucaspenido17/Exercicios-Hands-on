import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println();
        System.out.println("Soma = " + soma);

        sc.close();
    }
}