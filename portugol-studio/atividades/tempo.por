programa
{
	
	funcao inicio()
	{
		inteiro seg, horas, minutos, segundos

		escreva("Já se passaram quanto tempo em SEGUNDOS de eventos? ")
		leia(segundos)

		minutos = segundos / 60
		horas = segundos / 3600
		seg = (segundos % 3600) % 60

		escreva("\n")
		escreva("O evento tem duração de: ")
		escreva(minutos + " minutos. \n")
		escreva(horas + " horas. \n")
		escreva("e "+ segundos +" segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */