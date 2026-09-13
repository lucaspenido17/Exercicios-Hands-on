programa
{
    funcao inicio()
    {
        real valorCompra, percentual, desconto, valorFinal

        escreva("Digite o valor da compra: ")
        leia(valorCompra)

        escreva("Digite o percentual de desconto: ")
        leia(percentual)

        desconto = valorCompra * percentual / 100
        valorFinal = valorCompra - desconto

        escreva("Valor do desconto = ", desconto, "\n")
        escreva("Valor final da compra = ", valorFinal)
    }
}