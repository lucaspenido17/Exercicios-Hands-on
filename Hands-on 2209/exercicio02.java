import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("Maior = " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("Maior = " + numero2);
        } else {
            System.out.println("Iguais");
        }

    }
}
