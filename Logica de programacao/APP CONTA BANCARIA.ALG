Algoritmo "Conta Bancária"

Var
   saldo, saque : real

Inicio
   escreval ("App Conta Bancária")
   escreval ("===========================")
   escreval ("")

   saldo <- 1000
   escreva ("Digite o valor do saque: ")
   leia(saque)
   escreval("")

   se (saque <= saldo) entao
      saldo <- (saldo - saque)

      escreval("Saque de R$", saque, " realizado com sucesso!")
      escreval ("O saldo disponível para o próximo saque é: R$",saldo)
   senao

      escreval("O valor solicitado é maior que o saldo em conta.")
      escreval("O saldo atual é: ", saldo)

   fimse




Fimalgoritmo