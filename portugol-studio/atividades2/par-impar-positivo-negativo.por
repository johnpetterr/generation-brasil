programa
{
	
	funcao inicio()
	{
		inteiro n

		escreva("Insira um número: ")
		leia(n)

		se(n == 0){
			escreva("\n O número é neutro.")
		}senao se(n % 2 == 0){
			escreva("\n O número é par ")
		}senao{
			escreva("\n O número é ímpar ")
		}

		se(n >= 0){
			escreva("e ele é positivo.")
		}senao se(n < 0){
			escreva("e ele é negativo.")
		}senao{
			// só para ele não dar debug
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */