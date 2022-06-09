Algoritmo "APP Calcula média"

Var

   nome : caracter
   nota1, nota2, nota3, nota4, media : real


Inicio

   escreval("APP Calcula média")
   escreval("=============================")
   escreval("")

   escreva("Digite seu nome: ")
   leia(nome)
   escreval("")

   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   escreva("Digite a terceira nota: ")
   leia(nota3)
   escreva("Digite a quarta nota: ")
   leia(nota4)
   media <- (nota1 + nota2 + nota3 + nota4) / 4
   escreval("")

   se (media >= 8) entao
      escreval(nome, ", sua média é: ", media)
      escreval("Você foi aprovado!")
   senao
        se (media < 8) e (media >=5) entao
           escreval(nome, ", sua média é: ", media)
           escreval("Você está em recuperação!")
        senao
             escreval(nome, " sua média é: ", media)
             escreval("Infelizmente você está reprovado!")
      fimse

   fimse


Fimalgoritmo