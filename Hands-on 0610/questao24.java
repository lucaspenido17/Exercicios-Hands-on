import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de crianças: ");
        int quantidade = sc.nextInt();

        int mulheres = 0;
        int homens = 0;
        int mulheresMortas = 0;
        int homensMortos = 0;
        int ate24Meses = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Tempo de vida em meses: ");
            int meses = sc.nextInt();

            if (sexo == 'F') {
                mulheres++;

                if (meses == 0) {
                    mulheresMortas++;
                }
            } else {
                homens++;

                if (meses == 0) {
                    homensMortos++;
                }
            }

            if (meses <= 24) {
                ate24Meses++;
            }
        }

        if (mulheres > 0) {
            System.out.println("Percentual de mulheres que morreram = "
                    + (double) mulheresMortas * 100 / mulheres + "%");
        }

        if (homens > 0) {
            System.out.println("Percentual de homens que morreram = "
                    + (double) homensMortos * 100 / homens + "%");
        }

        System.out.println("Percentual que viveu 24 meses ou menos = "
                + (double) ate24Meses * 100 / quantidade + "%");

        sc.close();
    }
}