import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("""
                1 - Netflix
                2 - Disney +
                3 - Prime Video
                4 - Spotify
                5 - Sair
                """);

        System.out.println("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch(opcao){

            case 1:
                System.out.println("""
                        Voce escolheu Netflix!
                        Prepare a pipoca!
                        """);
                break;
            
            case 2:
                System.out.println("""
                        Voce escolheu Disney +!
                        Prepare a pipoca!
                        """);
                break;

            case 3:
                System.out.println("""
                        Voce escolheu Prime Video!
                        Prepare a pipoca!
                        """);
                break;

            case 4:
                System.out.println("""
                        Voce escolheu Spotify!
                        Prepare a pipoca!
                        """);
                break;

            case 5:
                System.out.println("Voce escolheu sair");
                break;
    
            default:
                System.out.println("Opçao Inválida!");
        }
    }
}
