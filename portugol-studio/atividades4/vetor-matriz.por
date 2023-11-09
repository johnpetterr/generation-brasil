programa
{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
	funcao inicio()
	{
		const inteiro TAMANHO = 5
		inteiro valoresPontuacao[TAMANHO], maiorPontuacao = 0, contador = 0

		para(inteiro x = 0; x < 5; x++){
			escreva("Digite uma pontuação: ")
			leia(valoresPontuacao[x])
		}
		limpa()
		
		para (inteiro x = 0; x < 5; x++){
			se(valoresPontuacao[x] > maiorPontuacao){
				maiorPontuacao = valoresPontuacao[x]
			}
			escreva("Vetor ", x + 1,": e sua pontuação é: ", valoresPontuacao[x],"\n")
		}
		escreva("\nA maior pontuação é de: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valoresPontuacao, 9, 10, 16};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */