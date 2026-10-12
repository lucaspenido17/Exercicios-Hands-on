import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaAntes = 0;
        double somaDepois = 0;
        int quantidade = 0;

        System.out.print("Digite o código (negativo encerra): ");
        int codigo = sc.nextInt();

        while (codigo >= 0) {
            System.out.print("Digite o preço atual: ");
            double preco = sc.nextDouble();

            double novoPreco = preco * 1.20;

            System.out.println("Código = " + codigo);
            System.out.printf("Novo preço = R$ %.2f%n", novoPreco);

            somaAntes += preco;
            somaDepois += novoPreco;
            quantidade++;

            System.out.print("Digite o código (negativo encerra): ");
            codigo = sc.nextInt();
        }

        if (quantidade > 0) {
            System.out.printf("Média antes = R$ %.2f%n", somaAntes / quantidade);
            System.out.printf("Média depois = R$ %.2f%n", somaDepois / quantidade);
        }

        sc.close();
    }
}