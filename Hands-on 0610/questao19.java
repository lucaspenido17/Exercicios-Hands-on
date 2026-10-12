import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        System.out.println("Faixa 1 = " + faixa1);
        System.out.println("Faixa 2 = " + faixa2);
        System.out.println("Faixa 3 = " + faixa3);
        System.out.println("Faixa 4 = " + faixa4);
        System.out.println("Faixa 5 = " + faixa5);

        System.out.println("Percentual faixa 1 = " + (double) faixa1 * 100 / 15 + "%");
        System.out.println("Percentual faixa 5 = " + (double) faixa5 * 100 / 15 + "%");

        sc.close();
    }
}