programa
{
	funcao inicio()
	{
		real  ex, m, p

		escreva("Insira o peso do tomate: ")
		leia(p)

		se (p > 50){
			ex = p - 50
			m = ex * 4
			
			escreva("\n O peso passou do limite de KG, você deve pagar uma multa de: ", m, " reais.") 
		}senao {

			escreva("\n O peso do tomate não excedeu o limite, você não paga multas.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */