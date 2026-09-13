programa
{
    funcao inicio()
    {
        real quilometros, litros, consumo

        escreva("Digite a distancia percorrida em quilometros: ")
        leia(quilometros)

        escreva("Digite a quantidade de litros utilizada: ")
        leia(litros)

        consumo = quilometros / litros

        escreva("Consumo medio = ", consumo, " km/l")
    }
}