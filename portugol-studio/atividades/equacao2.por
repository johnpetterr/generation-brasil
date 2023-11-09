programa
{
	
	funcao inicio()
	{
		real a, b, c, d, e1, f, x, y

		escreva("Digite os seguinte valores para os coeficientes abaixo para realizar a equação linear \n")
		escreva("A: ")
		leia(a)
		escreva("\n")
		escreva("B: ")
		leia(b)
		escreva("\n")
		escreva("C: ")
		leia(c)
		escreva("\n")
		escreva("D: ")
		leia(d)
		escreva("\n")
		escreva("E: ")
		leia(e1)
		escreva("\n")
		escreva("F: ")
		leia(f)
		escreva("\n")
		
		x = c*e1 - b*f / a*e1 - b*d
		y = a*f - c*d / a*e1 - b*d

		escreva("Os valores de X é de: '" + x + "' e o valor de Y é de '"+ y +"'")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */