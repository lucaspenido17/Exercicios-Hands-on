import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorAcidentes = -1;
        int menorAcidentes = Integer.MAX_VALUE;
        int codigoMaior = 0;
        int codigoMenor = 0;
        long somaVeiculos = 0;

        for (int i = 1; i <= 200; i++) {
            System.out.println("Cidade " + i);

            System.out.print("Código: ");
            int codigo = sc.nextInt();

            System.out.print("Estado: ");
            String estado = sc.next();

            System.out.print("Número de veículos: ");
            int veiculos = sc.nextInt();

            System.out.print("Número de acidentes: ");
            int acidentes = sc.nextInt();

            somaVeiculos += veiculos;

            if (acidentes > maiorAcidentes) {
                maiorAcidentes = acidentes;
                codigoMaior = codigo;
            }

            if (acidentes < menorAcidentes) {
                menorAcidentes = acidentes;
                codigoMenor = codigo;
            }
        }

        System.out.println("Maior número de acidentes = " + maiorAcidentes);
        System.out.println("Código da cidade = " + codigoMaior);
        System.out.println("Menor número de acidentes = " + menorAcidentes);
        System.out.println("Código da cidade = " + codigoMenor);
        System.out.println("Média de veículos = " + (double) somaVeiculos / 200);

        sc.close();
    }
}