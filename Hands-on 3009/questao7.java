import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        int opcao;

        do {

            System.out.println("===== LANCHONETE =====");
            System.out.println();
            System.out.println("1 - Pizza         - R$ 30,00");
            System.out.println("2 - Hambúrguer    - R$ 20,00");
            System.out.println("3 - Batata        - R$ 12,00");
            System.out.println("4 - Refrigerante  - R$ 8,00");
            System.out.println("0 - Finalizar");

            System.out.print("\nEscolha um produto: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                total = total + 30;
                System.out.println("Pizza adicionada!");
            } else if (opcao == 2) {
                total = total + 20;
                System.out.println("Hambúrguer adicionado!");
            } else if (opcao == 3) {
                total = total + 12;
                System.out.println("Batata adicionada!");
            } else if (opcao == 4) {
                total = total + 8;
                System.out.println("Refrigerante adicionado!");
            } else if (opcao == 0) {
                System.out.println("Finalizando pedido...");
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.println();

        } while (opcao != 0);

        System.out.printf("Valor do pedido: R$ %.2f%n", total);

        double desconto = 0;

        if (total < 50) {

            System.out.println("Sem desconto.");

        } else if (total < 100) {

            desconto = total * 0.05;
            System.out.println("5% de desconto.");

        } else {

            System.out.println("Você é estudante?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int estudante = entrada.nextInt();

            if (estudante == 1) {
                desconto = total * 0.15;
                System.out.println("15% de desconto.");
            } else {
                desconto = total * 0.10;
                System.out.println("10% de desconto.");
            }
        }

        double valorFinal = total - desconto;

        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);


    }
    
}
