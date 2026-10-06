import java.util.Scanner;
public class questao1 { 
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int idade, qtdHoras;
    

    

    System.out.println("Informe a idade do jogador: ");
    idade = sc.nextInt();
    

    System.out.println("Informe a quantidade de horas de jogo: ");
    qtdHoras = sc.nextInt();

    if(idade < 12){
        System.out.println("jogador mirim");
    }else if(idade >= 12 && idade <= 17){
        System.out.println("jogador juvenil");
        if(qtdHoras <= 10){
            System.out.println("jogador casual");
        }else{
            System.out.println("jogador frequente");
        }
    
  
  
    }else{
        if(qtdHoras <= 5){
            System.out.println("jogador casual");
        }else if(qtdHoras >= 6 && qtdHoras <= 15){
            System.out.println("jogador frequente");
        }else{
            System.out.println("jogador hardcore");
        }
    
    
    
   
    }

  }

}

