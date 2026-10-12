import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 0;

        System.out.print("Digite um número (0 encerra): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (maior == 0 || numero > maior) {
                maior = numero;
            }

            if (menor == 0 || numero < menor) {
                menor = numero;
            }

            System.out.print("Digite um número (0 encerra): ");
            numero = sc.nextInt();
        }

        if (maior != 0) {
            System.out.println("Maior = " + maior);
            System.out.println("Menor = " + menor);
        } else {
            System.out.println("Nenhum número foi informado.");
        }

        sc.close();
    }
}