programa
{
	
	funcao inicio()
	{
		inteiro n

		escreva("Digite um número: ")
		leia(n)
		limpa()

		se(n > 100){
			escreva("O valor do seu número é de: ", n)
		}senao{
			n -= n
			escreva("O valor do seu número é de: ", n)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */