programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, y1, x2, y2, d, p1, p2

		escreva("Escolha dois pontos de um plano\n")
		escreva("P - X1: ")
		leia(x1)
		escreva("P - Y1: ")
		leia(y1)
		escreva("\n")
		escreva("P - X2: ")
		leia(x2)
		escreva("P - Y2: ")
		leia(y2)
		limpa()
		p1 = mat.potencia((x2 - x1), 2)
		p2 = mat.potencia((y2 - y1), 2)
		d = mat.raiz(p1 + p2, 2)
		
		escreva("A distancia entre os pontos é de: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */