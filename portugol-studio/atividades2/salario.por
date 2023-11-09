programa
{
	
	funcao inicio()
	{
		inteiro c, n, ex = 0
		real salarioT = 0.00, salarioEx = 0.00
		
		escreva("Insira o seu código de operário: ")
		leia(c)
		escreva("Insira suas horas trabalhadas: ")
		leia(n)
		limpa()

		se (n <= 50){
			salarioT = n * 10.00
		}senao{
			ex = n - 50
			salarioEx = ex * 20.00
			salarioT = salarioEx + 500.00
		}
		
		escreva("Salario total: R$", salarioT, "\n")
		escreva("Salario excedente: R$", salarioEx)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */