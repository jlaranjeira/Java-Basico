Algoritmo "Calcular Idade para Dirigir"

Var
anoAtual, anoNasc, idade : inteiro

Inicio
      escreval ("App Calcular Idade")
      escreval ("===========================")
      escreval ("")
      
      escreva ("Digite o ano atual: ")
      leia(anoAtual)
      escreva ("Digite o ano do seu nascimento: ")
      leia(anoNasc)
      
      idade <- (anoAtual - anoNasc)
      
      escreval("")
      escreval ("Sua idade é: ", idade, " Anos")
      
      se (idade >= 18) entao
      escreval("Você está apto a dirigir!")
      senao
      escreval("Você ainda não pode dirigir!")
      fimse


Fimalgoritmo