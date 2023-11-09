programa
{
	funcao inicio()
	{
		real custoF, custoD, custoI
		inteiro soma
		escreva("Qual é o custo de fábrica do carro? ")
		leia(custoF)
		escreva("\n")
		custoD = custoF * 0.28
		custoI = custoF * 0.45
		soma = custoD + custoI + custoF
 		escreva("O seu custo como consumidor é de: R$"+ soma + ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */