import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int moedas = 1500;
        int opcao;

        do {

            System.out.println("===== LOJA DE SKINS =====");
            System.out.println();
            System.out.println("Saldo: " + moedas + " moedas");
            System.out.println();
            System.out.println("1 - Skin Básica   - 100 moedas");
            System.out.println("2 - Skin Rara     - 250 moedas");
            System.out.println("3 - Skin Épica    - 500 moedas");
            System.out.println("4 - Skin Lendária - 1000 moedas");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma skin: ");
            opcao = entrada.nextInt();

            int preco = 0;
            String skin = "";

            if (opcao == 1) {
                preco = 100;
                skin = "Skin Básica";
            } else if (opcao == 2) {
                preco = 250;
                skin = "Skin Rara";
            } else if (opcao == 3) {
                preco = 500;
                skin = "Skin Épica";
            } else if (opcao == 4) {
                preco = 1000;
                skin = "Skin Lendária";
            } else if (opcao == 0) {
                System.out.println("Saindo da loja...");
            } else {
                System.out.println("Opção inválida.");
            }

            if (opcao >= 1 && opcao <= 4) {

                if (moedas >= preco) {
                    moedas = moedas - preco;

                    System.out.println(skin + " comprada!");
                    System.out.println("Saldo restante: " + moedas + " moedas");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            }

            System.out.println();

        } while (opcao != 0);

    }
    
}
