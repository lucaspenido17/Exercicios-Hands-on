import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Cadastro dos herois
        String[] herois = {"Guerreiro", "Arqueiro", "Mago"};

        int[] vidaInicial = {100, 80, 60};

        int[] ataque = {20, 15, 25};

        // Matriz com a vida dos dois jogadores
        int[][] vida = {
            {100, 80, 60},
            {100, 80, 60}
        };

        // Variaveis de controle
        int opcao = -1;
        int jogador = 0;
        int atacante, defensor;
        int adversario;
        int dano;
        int vivos1, vivos2;
        int vencedor;
        boolean batalhaIniciada = false;
        boolean batalhaFinalizada = false;

        // Menu principal
        while (opcao != 0) {

            System.out.println("\n================================");
            System.out.println("        ARENA DOS HEROIS");
            System.out.println("================================");
            System.out.println("1 - Iniciar batalha");
            System.out.println("2 - Consultar herois");
            System.out.println("3 - Consultar status da batalha");
            System.out.println("4 - Reiniciar jogo");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opcao: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                // OPCAO 1 - INICIAR BATALHA
                case 1:

                    if (batalhaFinalizada) {

                        System.out.println("\nA batalha ja terminou!");
                        System.out.println("Reinicie o jogo para jogar novamente.");

                    } else {

                        batalhaIniciada = true;

                        // Enquanto a batalha nao terminar
                        while (!batalhaFinalizada) {

                            // Identifica o adversario
                            if (jogador == 0) {
                                adversario = 1;
                            } else {
                                adversario = 0;
                            }

                            System.out.println("\n================================");
                            System.out.println("VEZ DO JOGADOR " + (jogador + 1));
                            System.out.println("================================");

                            // Mostra os herois disponiveis para atacar
                            System.out.println("\nEscolha seu heroi:\n");

                            for (int i = 0; i < 3; i++) {

                                if (vida[jogador][i] > 0) {

                                    System.out.println((i + 1) + " - "
                                            + herois[i] + " | Vida: "
                                            + vida[jogador][i]);

                                } else {

                                    System.out.println((i + 1) + " - "
                                            + herois[i] + " | ELIMINADO");
                                }
                            }

                            System.out.print("\nOpcao: ");
                            atacante = entrada.nextInt() - 1;

                            // Verifica se o heroi pode atacar
                            while (atacante < 0 || atacante > 2
                                    || vida[jogador][atacante] == 0) {

                                System.out.println("\nHeroi invalido ou eliminado!");
                                System.out.print("Escolha novamente: ");
                                atacante = entrada.nextInt() - 1;
                            }

                            // Mostra os herois adversarios
                            System.out.println("\nEscolha o adversario:\n");

                            for (int i = 0; i < 3; i++) {

                                if (vida[adversario][i] > 0) {

                                    System.out.println((i + 1) + " - "
                                            + herois[i] + " | Vida: "
                                            + vida[adversario][i]);

                                } else {

                                    System.out.println((i + 1) + " - "
                                            + herois[i] + " | ELIMINADO");
                                }
                            }

                            System.out.print("\nOpcao: ");
                            defensor = entrada.nextInt() - 1;

                            // Verifica se o alvo pode receber ataque
                            while (defensor < 0 || defensor > 2
                                    || vida[adversario][defensor] == 0) {

                                System.out.println("\nAlvo invalido ou eliminado!");
                                System.out.print("Escolha novamente: ");
                                defensor = entrada.nextInt() - 1;
                            }

                            // Calcula o dano
                            dano = ataque[atacante];

                            // Atualiza a vida do adversario
                            vida[adversario][defensor] =
                                    vida[adversario][defensor] - dano;

                            // Impede que a vida fique negativa
                            if (vida[adversario][defensor] < 0) {

                                vida[adversario][defensor] = 0;
                            }

                            // Exibe o resultado do ataque
                            System.out.println("\n================================");
                            System.out.println("          RESULTADO");
                            System.out.println("================================");

                            System.out.println("\n" + herois[atacante]
                                    + " atacou " + herois[defensor] + "!");

                            System.out.println("\nDano causado: " + dano);

                            System.out.println("\nVida restante do "
                                    + herois[defensor] + ": "
                                    + vida[adversario][defensor]);

                            // Verifica se o heroi foi eliminado
                            if (vida[adversario][defensor] == 0) {

                                System.out.println("\n"
                                        + herois[defensor] + " foi eliminado!");
                            }

                            System.out.println("\n================================");

                            // Conta quantos herois ainda estao vivos
                            vivos1 = 0;
                            vivos2 = 0;

                            for (int i = 0; i < 3; i++) {

                                if (vida[0][i] > 0) {
                                    vivos1++;
                                }

                                if (vida[1][i] > 0) {
                                    vivos2++;
                                }
                            }

                            // Verifica se algum jogador perdeu
                            if (vivos1 == 0 || vivos2 == 0) {

                                batalhaFinalizada = true;

                                if (vivos1 == 0) {
                                    vencedor = 2;
                                } else {
                                    vencedor = 1;
                                }

                                System.out.println("\n================================");
                                System.out.println("         FIM DE BATALHA");
                                System.out.println("================================");

                                System.out.println("\nJOGADOR "
                                        + vencedor + " VENCEU!");

                            } else {

                                // Alterna o jogador
                                if (jogador == 0) {
                                    jogador = 1;
                                } else {
                                    jogador = 0;
                                }
                            }
                        }
                    }

                    break;

                // OPCAO 2 - CONSULTAR HEROIS
                case 2:

                    System.out.println("\n================================");
                    System.out.println("       CADASTRO DOS HEROIS");
                    System.out.println("================================");

                    for (int i = 0; i < 3; i++) {

                        System.out.println("\nHeroi: " + herois[i]);
                        System.out.println("Vida inicial: " + vidaInicial[i]);
                        System.out.println("Poder de ataque: " + ataque[i]);
                    }

                    break;

                // OPCAO 3 - CONSULTAR STATUS
                case 3:

                    if (!batalhaIniciada) {

                        System.out.println("\nA batalha ainda nao foi iniciada!");

                    } else {

                        System.out.println("\n================================");
                        System.out.println("       STATUS DA BATALHA");
                        System.out.println("================================");

                        for (int j = 0; j < 2; j++) {

                            System.out.println("\nJOGADOR " + (j + 1));

                            for (int i = 0; i < 3; i++) {

                                System.out.println(herois[i] + ": "
                                        + vida[j][i] + " HP");
                            }
                        }
                    }

                    break;

                // OPCAO 4 - REINICIAR JOGO
                case 4:

                    for (int j = 0; j < 2; j++) {

                        for (int i = 0; i < 3; i++) {

                            vida[j][i] = vidaInicial[i];
                        }
                    }

                    jogador = 0;
                    batalhaIniciada = false;
                    batalhaFinalizada = false;

                    System.out.println("\nJogo reiniciado com sucesso!");

                    break;

                // OPCAO 0 - SAIR
                case 0:

                    System.out.println("\nEncerrando o jogo...");
                    break;

                // OPCAO INVALIDA
                default:

                    System.out.println("\nOpcao invalida!");

                    break;
            }
        }

        entrada.close();
    }
}

