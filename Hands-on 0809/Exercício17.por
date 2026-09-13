programa
{
    funcao inicio()
    {
        logico a, b, resultadoE, resultadoOU

        a = verdadeiro
        b = verdadeiro
        resultadoE = a e b
        resultadoOU = a ou b

        escreva("A = verdadeiro | B = verdadeiro\n")
        escreva("A E B = ", resultadoE, "\n")
        escreva("A OU B = ", resultadoOU, "\n\n")

        a = verdadeiro
        b = falso
        resultadoE = a e b
        resultadoOU = a ou b

        escreva("A = verdadeiro | B = falso\n")
        escreva("A E B = ", resultadoE, "\n")
        escreva("A OU B = ", resultadoOU, "\n\n")

        a = falso
        b = verdadeiro
        resultadoE = a e b
        resultadoOU = a ou b

        escreva("A = falso | B = verdadeiro\n")
        escreva("A E B = ", resultadoE, "\n")
        escreva("A OU B = ", resultadoOU, "\n\n")

        a = falso
        b = falso
        resultadoE = a e b
        resultadoOU = a ou b

        escreva("A = falso | B = falso\n")
        escreva("A E B = ", resultadoE, "\n")
        escreva("A OU B = ", resultadoOU)
    }
}