import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos = " + positivos);
        System.out.println("Negativos = " + negativos);
        System.out.println("Zeros = " + zeros);

        sc.close();
    }
}