import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double numero1, numero2, resultado;

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        System.out.print("Digite a opção: ");
        opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado = " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado = " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado = " + resultado);
                break;

            case 4:
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado = " + resultado);
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
