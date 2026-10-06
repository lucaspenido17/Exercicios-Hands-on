import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0, senha, senhaCorreta = 1234;

        System.out.println("Informe a senha: ");
        senha = sc.nextInt();

        contador++;

        while(senha != senhaCorreta){

            System.out.println("Senha incorreta!");
            System.out.println("Informe a senha: ");
            senha = sc.nextInt();
            contador++;

        }

        System.out.println("Login realizado com sucesso após " + contador + (contador == 1? " tentativa!":" tentativas!"));





    }
    
}
