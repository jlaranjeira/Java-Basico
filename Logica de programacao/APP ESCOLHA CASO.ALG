Algoritmo "APP Calcula média"

Var


   doacao, val : real


Inicio

   escreval("APP Doação para ONG")
   escreval("=============================")
   escreval("")

   escreval("1 - Para doar: R$10")
   escreval("2 - Para doar: R$20")
   escreval("3 - Para doar: R$30")
   escreval("4 - Para doar outro valor")

   escreval("")

   escreva("Escolha uma opção para doar: ")
   leia(doacao)
   
   escreval("")

   escolha doacao
   caso 1
      doacao <- 10
      escreval("Sua doação foi de: R$", doacao, " Muito obrigado!")

   caso 2
      doacao <- 20
      escreval("Sua doação foi de: R$", doacao, " Muito obrigado!")

   caso 3
      doacao <- 30
      escreval("Sua doação foi de: R$", doacao, " Muito obrigado!")

   caso 4
      escreva("Informe o valor: ")
      leia(val)
      escreval("")
      escreva("O valor da sua doação foi: R$", val, " Muito obrigado!")

   fimescolha




Fimalgoritmo