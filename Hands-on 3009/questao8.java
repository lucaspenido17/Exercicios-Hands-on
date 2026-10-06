import java.util.Random;

public class questao8 {
    public static void main(String[] args) {

        Random random = new Random();

        int vidas1 = 3;
        int vidas2 = 3;

        int pontos1 = 0;
        int pontos2 = 0;

        int rodada = 1;

        while (vidas1 > 0 && vidas2 > 0) {

            System.out.println("===== RODADA " + rodada + " =====");

            int numero1 = random.nextInt(10) + 1;
            int numero2 = random.nextInt(10) + 1;

            System.out.println("Jogador 1 tirou: " + numero1);
            System.out.println("Jogador 2 tirou: " + numero2);

            if (numero1 > numero2) {

                System.out.println("Jogador 1 venceu a rodada!");
                System.out.println("Jogador 2 perdeu uma vida!");

                vidas2--;
                pontos1 += 10;

            } else if (numero2 > numero1) {

                System.out.println("Jogador 2 venceu a rodada!");
                System.out.println("Jogador 1 perdeu uma vida!");

                vidas1--;
                pontos2 += 10;

            } else {

                System.out.println("Empate!");
                System.out.println("Ninguém perdeu vida.");

                pontos1 += 5;
                pontos2 += 5;

                System.out.println("Cada jogador recebeu 5 pontos.");
            }

            System.out.println();
            System.out.println("Vidas do Jogador 1: " + vidas1);
            System.out.println("Pontos do Jogador 1: " + pontos1);

            System.out.println();

            System.out.println("Vidas do Jogador 2: " + vidas2);
            System.out.println("Pontos do Jogador 2: " + pontos2);

            System.out.println();

            rodada++;
        }

        System.out.println("===== RESULTADO FINAL =====");
        System.out.println();

        System.out.println("Jogador 1");
        System.out.println("Vidas: " + vidas1);
        System.out.println("Pontos: " + pontos1);

        System.out.println();

        System.out.println("Jogador 2");
        System.out.println("Vidas: " + vidas2);
        System.out.println("Pontos: " + pontos2);

        System.out.println();

        if (pontos1 > pontos2) {
            System.out.println("Vencedor: Jogador 1");
        } else if (pontos2 > pontos1) {
            System.out.println("Vencedor: Jogador 2");
        } else {
            System.out.println("Vencedor: Empate!");
        }
        
    }
    
}
