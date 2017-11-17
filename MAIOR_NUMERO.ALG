Algoritmo "maior_numero"
// Autor(a)    : joão sousa
// Data atual  : 17/11/2017
Var
num1,num2,num3,maior :real
Inicio
Escreval("Qual o primeiro número?")
leia(num1)
Escreval("Qual o segundo número'")
leia(num2)
Escreval("Qual o terceiro número?")
leia(num3)
se(num1>num2)entao
 maior <- num1
 senao
 maior <- num2
 fimse
 se(maior<num3)entao
 maior <- num3
 fimse
 escreva("O maior número é:",maior)
Fimalgoritmo