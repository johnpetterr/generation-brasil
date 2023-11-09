programa
{
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos. O programa
	deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	negativo.*/
	
	funcao inicio()
	{
		inteiro valoresNumericos = 0, totalValores = 0, contadorValores = 0
		real mediaValores = 0.0

		enquanto(valoresNumericos >= 0){
			escreva("Digite um valor: ")
			leia(valoresNumericos)
			totalValores += valoresNumericos
			contadorValores++

			se(valoresNumericos < 0){
				totalValores -= valoresNumericos
				contadorValores = contadorValores - 1
			}

			mediaValores = totalValores / contadorValores
		}
		limpa()
		escreva("A soma dos valores é de: ", totalValores)
		escreva("\nA média dos valores é de: ", mediaValores)
		escreva("\nA quantidade total de valores lidos é de: ", contadorValores)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 860; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */