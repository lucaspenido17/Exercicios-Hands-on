import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto dinheiro você possui? R$ ");
        double dinheiro = entrada.nextDouble();

        if (dinheiro < 20) {

            System.out.println("Rolê em casa.");

        } else if (dinheiro < 50) {

            System.out.println("Está chovendo?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int chuva = entrada.nextInt();

            if (chuva == 1) {
                System.out.println("Streaming + comida.");
            } else {
                System.out.println("Praça ou parque.");
            }

        } else if (dinheiro < 100) {

            System.out.println("Cinema.");

        } else {

            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();

            if (idade < 18) {
                System.out.println("Shopping + cinema.");
            } else {
                System.out.println("Show, restaurante ou churrasco com a galera.");
            }
        }



    }
    
}
