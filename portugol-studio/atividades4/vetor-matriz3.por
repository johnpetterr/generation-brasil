programa
{
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das 
	matrizes N1 e N2.*/
	
	funcao inicio()
	{
		const inteiro LINHA = 4, COLUNA = 6
		inteiro N1[LINHA][COLUNA], matriz1[LINHA][COLUNA], soma, diferenca
		inteiro N2[LINHA][COLUNA], matriz2[LINHA][COLUNA], l, c

		para(l = 0; l < 4; l++){
			para(c = 0; c < 6; c++){
				escreva("N1- Insira o valor da coluna[",c,"] e da linha[",l,"]: ")
				leia(N1[l][c])
				limpa()
				
				escreva("N2- Insira o valor da coluna[",c,"] e da linha[",l,"]: ")
				leia(N2[l][c])
				limpa()

				soma = N1[l][c] + N2[l][c]
				matriz1[l][c] = soma

				diferenca = N1[l][c] - N2[l][c]
				matriz2[l][c] = diferenca
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 11, 10, 2}-{matriz1, 11, 29, 7}-{N2, 12, 10, 2}-{matriz2, 12, 29, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */