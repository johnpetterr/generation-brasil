programa
{
	/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00.*/
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		const inteiro HABITANTES = 20
		inteiro numeroFilhos, pessoaID = 1, mediaFilhos = 0, totalFilhos = 0
		real salarios = 0.00, mediaSalario = 0.00, totalSalario = 0.00, maiorSalario = 0.00
		real salariosAte100 = 0.00, percentualSalario = 0.0

		para(inteiro i = 1; i <= HABITANTES; i++){
			escreva("Pessoa ", pessoaID)
			pessoaID++
			escreva("\n")
			escreva("Digite seu salário: ")
			leia(salarios)
			escreva("Digite a quantidade de filhos: ")
			leia(numeroFilhos)
			limpa()

			totalSalario += salarios
			mediaSalario = totalSalario / HABITANTES
			totalFilhos += numeroFilhos
			mediaFilhos = totalFilhos / HABITANTES

			se(salarios > maiorSalario){
				maiorSalario = salarios
			}

			se(salarios <= 100.00){
				salariosAte100++
			}

			percentualSalario = (salariosAte100 / HABITANTES) * 100
			
		}
		escreva("A média do salário da população é de: ", mediaSalario)
		escreva("\nA média de filhos da população é de : ", mediaFilhos)
		escreva("\nO maior salário da população é de   : ", maiorSalario)
		escreva("\nO percentual do salário da população até R$100 é de: ", mat.arredondar(percentualSalario, 2),"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */