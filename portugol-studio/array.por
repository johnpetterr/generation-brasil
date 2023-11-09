programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 4
		cadeia alunes [TAMANHO]
		inteiro notas [TAMANHO], i
		
		para (i = 0; i < 4; i++){
			escreva("Qual seu nome? ")
			leia (alunes[i])
			escreva ("Qual sua nota? ")
			leia (notas[i])
			limpa()
		}
		
		para (i = 0; i < 4; i++){
			se(notas[i] <= 5){
				escreva ("Aluno: ", alunes[i], " - Nota: ", notas[i]," - Estude mais! \n")
			}senao{
				escreva ("Aluno: ", alunes[i], " - Nota: ", notas[i]," - Muito bem, continue assim! \n")
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */