programa
{
	
	funcao inicio()
	{
		inteiro totalMultiplos4 = 0, totalMultiplos7Impares = 0, i
		
		para (i=1; i<=1000; i++){
			se(i >= 100 e i <= 200 e (i % 4) == 0){
				totalMultiplos4 += i //totalMultiplos4 = totalMultiplos4 + i
			}
			se(i >= 400 e (i % 2)==1 e (i % 7) == 0){
				totalMultiplos7Impares += i //totalMultiplos7Impares = totalMultiplos7Impares + i
			}
		}

		escreva("Total multiplos de 4 entre 100 e 200: ", totalMultiplos4)
		escreva("\n Total multiplos de 7 entre 400 e 1000, e ímpares: ", totalMultiplos7Impares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */