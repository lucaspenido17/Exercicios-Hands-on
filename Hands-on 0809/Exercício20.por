programa
{
    funcao inicio()
    {
        cadeia nome
        inteiro idade
        real nota
        caracter sexo
        logico matriculado

        escreva("Digite o nome completo: ")
        leia(nome)

        escreva("Digite a idade: ")
        leia(idade)

        escreva("Digite a nota final: ")
        leia(nota)

        escreva("Digite o sexo ou inicial do genero: ")
        leia(sexo)

        escreva("O aluno esta matriculado? (verdadeiro ou falso): ")
        leia(matriculado)

        escreva("\n===== DADOS DO ALUNO =====\n")
        escreva("Nome: ", nome, "\n")
        escreva("Idade: ", idade, "\n")
        escreva("Nota final: ", nota, "\n")
        escreva("Sexo: ", sexo, "\n")
        escreva("Matriculado: ", matriculado)
    }
}