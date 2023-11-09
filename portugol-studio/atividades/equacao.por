programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a, b, c
		real r, s, d

		escreva("Digite três números! \n")
		escreva("A: ")
		leia(a)
		escreva("\n")
		escreva("B: ")
		leia(b)
		escreva("\n")
		escreva("C: ")
		leia(c)

		r = (a + b)
		r = mat.potencia(r, 2.0)
		s = (b + c)
		s = mat.potencia(s, 2.0)
		d = (r + s) / 2
		
		escreva("O resultadao da expressão é de: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */