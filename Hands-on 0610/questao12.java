import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorIdade = 0;
        int mulheresCondicao = 0;

        System.out.print("Digite a idade (-1 encerra): ");
        int idade = sc.nextInt();

        while (idade != -1) {
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Cor dos olhos (azuis, verdes ou castanhos): ");
            String olhos = sc.next().toLowerCase();

            System.out.print("Cor dos cabelos (louros, castanhos ou pretos): ");
            String cabelos = sc.next().toLowerCase();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (sexo == 'F' && idade >= 18 && idade <= 35
                    && olhos.equals("verdes") && cabelos.equals("louros")) {
                mulheresCondicao++;
            }

            System.out.print("Digite a idade (-1 encerra): ");
            idade = sc.nextInt();
        }

        System.out.println("Maior idade = " + maiorIdade);
        System.out.println("Mulheres que atendem às condições = " + mulheresCondicao);

        sc.close();
    }
}