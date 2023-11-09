programa
{
	
	funcao inicio()
	{
		inteiro diasV, meses, anos

		escreva("Quantos dias de vida você tem? ")
		leia(diasV)
		escreva("\n")

		anos = diasV / 365
		meses = (diasV % 365) / 30
		

		escreva("Sua idade em meses é de: "+ meses +" meses. \n")
		escreva("Sua idade em anos é de: "+ anos +" anos. \n")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */