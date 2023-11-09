programa
{
	
	funcao inicio()
	{
		real b, alt, a

		escreva("Digite o valor da base do triangulo: ")
		leia(b)
		escreva("Digite o valor da altura do triangulo: ")
		leia(alt)
		

		se(b > 0 e alt > 0){
			a = (b * alt) / 2
			escreva("O valor da área do trinângulo é de: ", a)
		}senao{
			limpa()
			escreva("Um dos valores inseridos ou ambos são negativos, não foi capaz de calcular a área.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */