programa
{
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		const inteiro LINHA = 3, COLUNA = 3
		inteiro matriz[LINHA][COLUNA], somaDiagonal = 0, somaTotal = 0, l, c

		para(l = 0; l < 3; l++){
			para(c = 0; c < 3; c++){
				escreva("Insira os valores: ")
				leia(matriz[l][c])
				limpa()
				
				somaTotal += matriz[l][c]

				se(l == c){
					somaDiagonal += matriz[l][c]
				}
			}
		}
		escreva("A soma dos valores é de: ", somaTotal)
		escreva("\nA soma da diagonal principal é: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 619; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */