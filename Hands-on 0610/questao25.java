import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaAdicionais = 0;
        double maiorPreco = 0;
        double menorPreco = 0;
        double totalImpostos = 0;

        int baratos = 0;
        int normais = 0;
        int caros = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Produto " + i);

            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();

            System.out.print("Necessita refrigeração? (S/N): ");
            char refrigeracao = sc.next().toUpperCase().charAt(0);

            System.out.print("Categoria (A/L/V): ");
            char categoria = sc.next().toUpperCase().charAt(0);

            double estoque;

            if (preco <= 20) {
                if (categoria == 'A') estoque = 2;
                else if (categoria == 'L') estoque = 3;
                else estoque = 4;
            } else if (preco <= 50) {
                if (refrigeracao == 'S') estoque = 6;
                else estoque = 0;
            } else {
                if (refrigeracao == 'S' && categoria == 'A') estoque = 5;
                else if (refrigeracao == 'S' && categoria == 'L') estoque = 2;
                else if (refrigeracao == 'S' && categoria == 'V') estoque = 4;
                else if (categoria == 'L') estoque = 1;
                else estoque = 0;
            }

            double imposto;

            if (categoria == 'A' && refrigeracao == 'S') {
                imposto = preco * 0.04;
            } else {
                imposto = preco * 0.02;
            }

            double precoFinal = preco + estoque + imposto;

            String classificacao;

            if (precoFinal <= 20) {
                classificacao = "Barato";
                baratos++;
            } else if (precoFinal <= 100) {
                classificacao = "Normal";
                normais++;
            } else {
                classificacao = "Caro";
                caros++;
            }

            System.out.printf("Preço unitário = R$ %.2f%n", preco);
            System.out.printf("Custo de estocagem = R$ %.2f%n", estoque);
            System.out.printf("Imposto = R$ %.2f%n", imposto);
            System.out.printf("Preço final = R$ %.2f%n", precoFinal);
            System.out.println("Classificação = " + classificacao);
            System.out.println();

            somaAdicionais += estoque + imposto;
            totalImpostos += imposto;

            if (i == 1) {
                menorPreco = precoFinal;
            }

            if (precoFinal > maiorPreco) {
                maiorPreco = precoFinal;
            }

            if (precoFinal < menorPreco) {
                menorPreco = precoFinal;
            }
        }

        System.out.printf("Média dos valores adicionais = R$ %.2f%n", somaAdicionais / 12);
        System.out.printf("Maior preço final = R$ %.2f%n", maiorPreco);
        System.out.printf("Menor preço final = R$ %.2f%n", menorPreco);
        System.out.printf("Total de impostos = R$ %.2f%n", totalImpostos);
        System.out.println("Baratos = " + baratos);
        System.out.println("Normais = " + normais);
        System.out.println("Caros = " + caros);

        sc.close();
    }
}