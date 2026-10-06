import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Possui ingresso?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int ingresso = entrada.nextInt();

        if (ingresso == 2) {
            System.out.println("Entrada negada: ingresso obrigatório.");
        } else {

            if (idade >= 18) {
                System.out.println("Entrada liberada!");
            } else {

                System.out.println("Está acompanhado de um responsável?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int responsavel = entrada.nextInt();

                if (responsavel == 1) {
                    System.out.println("Entrada liberada!");
                } else {
                    System.out.println("Entrada negada.");
                }
            }
        }


    }
    
}
