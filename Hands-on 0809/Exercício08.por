programa
{
    funcao inicio()
    {
        real valor, taxa, total, porPessoa

        escreva("Digite o valor total consumido no restaurante: ")
        leia(valor)

        taxa = valor * 0.10
        total = valor + taxa
        porPessoa = total / 3

        escreva("Taxa de servico = ", taxa, "\n")
        escreva("Valor total da conta = ", total, "\n")
        escreva("Valor por pessoa = ", porPessoa)
    }
}