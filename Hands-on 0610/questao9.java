import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int nulo = 0, branco = 0;

        System.out.print("Digite o voto (0 encerra): ");
        voto = sc.nextInt();

        while (voto != 0) {
            if (voto == 1) c1++;
            else if (voto == 2) c2++;
            else if (voto == 3) c3++;
            else if (voto == 4) c4++;
            else if (voto == 5) nulo++;
            else if (voto == 6) branco++;
            else System.out.println("Voto inválido.");

            System.out.print("Digite o voto (0 encerra): ");
            voto = sc.nextInt();
        }

        System.out.println("Candidato 1 = " + c1);
        System.out.println("Candidato 2 = " + c2);
        System.out.println("Candidato 3 = " + c3);
        System.out.println("Candidato 4 = " + c4);
        System.out.println("Nulos = " + nulo);
        System.out.println("Brancos = " + branco);

        sc.close();
    }
}