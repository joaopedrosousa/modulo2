Algoritmo "maior_numero"
// Autor(a)    : jo�o sousa
// Data atual  : 17/11/2017
Var
num1,num2,num3,maior :real
Inicio
Escreval("Qual o primeiro n�mero?")
leia(num1)
Escreval("Qual o segundo n�mero'")
leia(num2)
Escreval("Qual o terceiro n�mero?")
leia(num3)
se(num1>num2)entao
 maior <- num1
 senao
 maior <- num2
 fimse
 se(maior<num3)entao
 maior <- num3
 fimse
 escreva("O maior n�mero �:",maior)
Fimalgoritmo