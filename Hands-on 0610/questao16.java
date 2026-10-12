public class questao16 {
    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 2;

        while (encontrados < 5) {
            int soma = 0;

            for (int divisor = 1; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    soma += divisor;
                }
            }

            if (soma == numero) {
                System.out.println(numero);
                encontrados++;
            }

            numero++;
        }
    }
}