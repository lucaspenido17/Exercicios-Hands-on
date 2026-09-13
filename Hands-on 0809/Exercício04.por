programa
{
    funcao inicio()
    {
        real numero1, numero2, soma, subtracao, multiplicacao, divisao

        escreva("Digite o primeiro numero: ")
        leia(numero1)

        escreva("Digite o segundo numero: ")
        leia(numero2)

        soma = numero1 + numero2
        subtracao = numero1 - numero2
        multiplicacao = numero1 * numero2
        divisao = numero1 / numero2

        escreva("Soma = ", soma, "\n")
        escreva("Subtracao = ", subtracao, "\n")
        escreva("Multiplicacao = ", multiplicacao, "\n")
        escreva("Divisao = ", divisao)
    }
}