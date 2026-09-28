import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00;
        double valor;
        int opcao;

        do {

            System.out.println("\n===== CAIXA =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    valor = scanner.nextDouble();

                    if (valor > 0) {
                        saldo = saldo + valor;
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("O depósito deve ser maior que zero.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    valor = scanner.nextDouble();

                    if (valor > 0 && valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saque inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        System.out.printf("Saldo final: R$ %.2f%n", saldo);
        
        scanner.close();
    }
}