programa
{
	
	funcao inicio()
	{
		inteiro i, total = 0, numero = 0, maior = 0, menor = 0
		real media = 0

		para(i = 1; i <= 5; i++){
			escreva("Digite uma nota: ")
			leia(numero)
			
			total += numero

			se(numero > maior){
				maior = numero
			}
		}
		escreva("\n")
		media = total / 5
		escreva("Sua média é: ", media, " e o total das suas notas é: ", total, "\n")
		escreva("Sua sua maior nota é: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */