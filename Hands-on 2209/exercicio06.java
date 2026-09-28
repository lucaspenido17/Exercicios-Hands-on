import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra, desconto, valorFinal;
        int categoria;

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        System.out.print("Digite a categoria (1 = comum, 2 = premium, 3 = funcionário): ");
        categoria = scanner.nextInt();

        switch (categoria) {

            case 1:
                desconto = valorCompra * 0.05;
                break;

            case 2:
                desconto = valorCompra * 0.10;
                break;

            case 3:
                desconto = valorCompra * 0.15;
                break;

            default:
                System.out.println("Categoria inválida.");
                scanner.close();
                return;
        }

        valorFinal = valorCompra - desconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
