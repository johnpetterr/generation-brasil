programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4

		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)
		limpa()
		
		se (n3 >= 1000){
			escreva("O valor do quadrado do terceiro número é: ", n3)
		}senao{
			escreva("O primeiro número foi: ", n1," e o seu quadrado é: ", mat.potencia(n1, 2))
			escreva("\nO segundo número foi: ", n2," e o seu quadrado é: ", mat.potencia(n2, 2))
			escreva("\nO terceiro número foi: ", n3," e o seu quadrado é: ", mat.potencia(n3, 2))
			escreva("\nO quarto número foi: ", n4," e o seu quadrado é: ", mat.potencia(n4, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */