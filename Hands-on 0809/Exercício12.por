programa
{
    funcao inicio()
    {
        real numero, x, y
        logico estaEntre

        escreva("Digite um numero: ")
        leia(numero)

        escreva("Digite o valor de X: ")
        leia(x)

        escreva("Digite o valor de Y: ")
        leia(y)

        estaEntre = numero >= x e numero <= y

        escreva("O numero esta entre X e Y = ", estaEntre)
    }
}